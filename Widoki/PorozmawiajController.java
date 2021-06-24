package Widoki;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class PorozmawiajController implements Initializable {

    private LoginController loginController;

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

    @FXML
    private Button forumButt;

    @FXML
    private Button premieryButt;

    @FXML
    private Button opinieButt;

    @FXML
    private Button memeButt;

    @FXML
    private Button newsButt;

    @FXML
    private Label loginLab;

    @FXML
    private Label rezerwLab;

    @FXML
    private Label zajeteLab;

    @FXML
    private Button rezerwButt;

    @FXML
    private DatePicker datePicker;

    @FXML
    private SplitMenuButton listaMenuButt;

    public void setLoginLab(String text) {
        loginLab.setText(text);
    }

    MenuItem smartphone = new MenuItem("smartphone");
    MenuItem laptop = new MenuItem("laptop");
    MenuItem tablet = new MenuItem("smartwatch");

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

    @FXML
    void rezerwuj() {
        LocalDate localDate;
        localDate = LocalDate.now().plusDays(4);
        if(datePicker.getValue().isBefore(localDate)){
            zajeteLab.setVisible(true);
        }
        else {
            zajeteLab.setVisible(false);
            rezerwLab.setVisible(true);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        zajeteLab.setVisible(false);
        rezerwLab.setVisible(false);
        datePicker.setValue(LocalDate.now());
        listaMenuButt.getItems().clear();
        listaMenuButt.getItems().addAll(smartphone,laptop,tablet);
    }
}
