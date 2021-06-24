package Widoki;

import Dane.News;
import Dane.Opinia;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class OpinieController implements Initializable {

    private LoginController loginController;

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    @FXML
    private Button forumButt;

    @FXML
    private Button premieryButt;

    @FXML
    private Button memeButt;

    @FXML
    private Button porozmawiajButt;

    @FXML
    private Button newsButt;

    @FXML
    private Label loginLab;

    @FXML
    private GridPane grid;

    private  List<Opinia> opinie = new ArrayList<>();

    public void setLoginLab(String text) {
        loginLab.setText(text);
    }

    @FXML
    void toForum(ActionEvent event) {
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
        memyController.setLoginLab(LoginController.userLogin);
    }

    @FXML
    void toNews(ActionEvent event) {
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
        newsController.setLoginLab(LoginController.userLogin);
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

    private List<Opinia> getData(){
        Opinia opinia;
        for (int i = 0; i < 20; i++){
            opinia = new Opinia();
            opinia.setElektro("Samsung QuickDrive ");
            opinia.setTresc("Bęben Swirl+ o specjalnej perforacji ma aż 9 kg wsadu i obraca się maksymalnie 1600 razy na minutę. Klasa energetyczna to A, a realne zużycie prądu jest wyjątkowo niskie i wynosi 49 kWh na 100 cykli programu ECO. Niewysokie jest również zużycie wody – 50 litry na cykl to skromna ilość, jak na tak pojemną pralkę. Cieszy standardowy wymiar urządzenia – 60 cm głębokości i tyle samo szerokości.");
            opinia.setEkspert("Henryk Wąs");
            opinie.add(opinia);
        }
        return opinie;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        opinie.addAll(getData());


        int column = 0;
        int row = 1;

        try {
            for (int i = 0; i < opinie.size(); i++){
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/Widoki/OpiniaSzczegol.fxml"));
                VBox vBox = loader.load();

                OpiniaSzczegolController szczegol = loader.getController();
                szczegol.setData(opinie.get(i));

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