package Widoki;

import Dane.Uzytkownik;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class PremieryLipiecController {

    private LoginController loginController;

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    @FXML
    private Button forumButt;

    @FXML
    private Label loginLab;

    public void setLoginLab(String text) {
        loginLab.setText(text);
    }

    @FXML
    private Button premieryButt;

    @FXML
    private Button opinieButt;

    @FXML
    private Button memeButt;

    @FXML
    private Button porozmawiajButt;

    @FXML
    private Button newsButt;

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
    void toCzerwiec(){
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
}
