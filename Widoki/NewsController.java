package Widoki;

import Dane.News;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class NewsController implements Initializable {

    private List<News> newsy = new ArrayList<>();

    private LoginController loginController;

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }



    @FXML
    private Button forumButt;

    @FXML
    private AnchorPane mainPane;
    @FXML
    private Button premierButt;

    @FXML
    private Button opinieButt;

    @FXML
    private Button memeButt;

    @FXML
    private Button porozmawiajButt;

    @FXML
    private Button newsybutt;

    @FXML
    private Button logoutButt;

    @FXML
    private GridPane grid;

    @FXML
    private Label loginLab;

    public void setLoginLab(String text) {
        loginLab.setText(text);
    }

    @FXML
    public void toForum(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Widoki/forum.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }
        ForumController forumController = loader.getController();
        forumController.setLoginController(loginController);
        loginController.setScreen(pane);
        forumController.setLoginLab(LoginController.userLogin);
    }

    @FXML
    public void toMeme(ActionEvent event) {
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
        memyController.setLoginLab(LoginController.userLogin);
    }

    @FXML
    void toOpinie(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Widoki/opinie.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e){
            e.printStackTrace();
        }
        OpinieController opinieController = loader.getController();
        opinieController.setLoginController(loginController);
        loginController.setScreen(pane);
        opinieController.setLoginLab(LoginController.userLogin);
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
        porozmawiajController.setLoginLab(LoginController.userLogin);
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
        premieryController.setLoginLab(LoginController.userLogin);
    }


    private List<News> getData(){
        News news;
        for (int i = 0; i < 20; i++){
            news = new News();
            news.setNazwa("Nowe iPhony!");
            news.setTresc("Nowe ajfony są super. Kup je już dziś. Będą lepsze niż zawsze. Cena nie odbiega od poprzednich premier.");
            news.setImgSource("D:\\Users\\kubam\\Documents\\Studia\\Propgramowanie\\Piu\\piu21l_kaczorowski\\ElektroPudelek\\src\\Widoki\\resources\\images.jpg");
            newsy.add(news);
        }
        return newsy;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        newsy.addAll(getData());


        int column = 0;
        int row = 1;

        try {
            for (int i = 0; i < newsy.size(); i++){
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/Widoki/oneNews.fxml"));
                VBox vBox = loader.load();

                OneNewsController oneNewsController = loader.getController();
                oneNewsController.setData(newsy.get(i));

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
}
