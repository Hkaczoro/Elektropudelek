package Widoki;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MemyController {

    private LoginController loginController;

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button forumButt;

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
    private Pagination pg;

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

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }
}