package Widoki;

import Dane.News;
import Dane.PostNaForum;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ForumController implements Initializable {

    private LoginController loginController;

    private List<PostNaForum> posty = new ArrayList<>();

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    @FXML
    private Button forumButt;

    @FXML
    private Button premierButt;

    @FXML
    private Button opinieButt;

    @FXML
    private Button memeButt;

    @FXML
    private Button porozmawiajButt;

    @FXML
    private Button newsButt;

    @FXML
    private GridPane grid;

    @FXML
    void toMeme(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Widoki/memy.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }
        MemyController memyController = loader.getController();
        memyController.setLoginController(loginController);
        loginController.setScreen(pane);
    }

    @FXML
    public void toNews(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Widoki/newsy.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }
        NewsController newsController = loader.getController();
        newsController.setLoginController(loginController);
        loginController.setScreen(pane);
    }


    private List<PostNaForum> getData(){
        for (int i = 0; i < 10; i++){
            PostNaForum post = new PostNaForum();
            post.setNazwa("Co wybrać?");
            post.setTresc("Zadajesz sobie pytanie, jaki telefon wybrać? Chcesz mieć dobry smartfon to dobrze trafiłeś. Ogrom urządzeń pojawiających się w sprzedaży może powodować spory ból głowy. W tej strefie znajdziesz poradniki, w których przygotowujemy zestawienia telefonów z wybranego przedziału cenowego, aby każdy znalazł coś na własną kieszeń, lub dedykowane do określonych zastosowań. Doradzamy w kwestii specyfikacji, ze szczególnym uwzględnieniem takich kwestii jak jakość ekranu, wydajność lub wydajność 3D, czas pracy na baterii, wyposażenie w złącza i jakoś wykonania. Podpowiadamy, jaki system operacyjny będzie najlepszym wyborem dla konkretnego użytkownika, jaki smartfon będzie najlepszy do gier, jaki do filmów, a jaki do firmy. Omawiamy też najważniejsze trendy panujące na rynku mobilnym.");
            
            posty.add(post);
        }
        return posty;
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        posty.addAll(getData());


        int column = 0;
        int row = 1;

        try {
            for (int i = 0; i < posty.size(); i++){
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/Widoki/onePost.fxml"));
                VBox vBox = loader.load();

                OnePostController OnePostController = loader.getController();
                OnePostController.setData(posty.get(i));

                grid.add(vBox, column, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(vBox, new Insets(10));

                row++;
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }


    @FXML
    void toPorozmawiaj(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Widoki/porozmawiaj.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }
        PorozmawiajController porozmawiajController = loader.getController();
        porozmawiajController.setLoginController(loginController);
        loginController.setScreen(pane);
    }

    @FXML
    void toPremiery(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Widoki/premiery.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }
        PremieryController premieryController = loader.getController();
        premieryController.setLoginController(loginController);
        loginController.setScreen(pane);
    }

}


