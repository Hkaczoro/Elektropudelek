package Widoki;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class MemyController implements Initializable {

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
    private ImageView iv;

    @FXML
    private Label loginLab;

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

    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }


    public VBox createPage(int index) throws FileNotFoundException {

        ImageView imageView = new ImageView();
        InputStream stream;

        if (index==1){
            stream = new FileInputStream("/Users/hubertkaczorowski/Desktop/gegagnhwrt/ElektroPudelek/src/Widoki/resources/m1.jpg");
        }
        else{
            stream = new FileInputStream("/Users/hubertkaczorowski/Desktop/gegagnhwrt/ElektroPudelek/src/Widoki/resources/m2.jpg");
        }

        Image image = new Image(stream);
        imageView.setImage(image);
        imageView.setSmooth(true);
        imageView.setCache(true);

        VBox pageBox = new VBox();
        pageBox.getChildren().add(imageView);
        return pageBox;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        iv = new ImageView();
        InputStream stream;
        try {
            stream = new FileInputStream("/Users/hubertkaczorowski/Desktop/gegagnhwrt/ElektroPudelek/src/Widoki/resources/m1.jpg");
            Image image = new Image(stream);
            iv.setImage(image);
            iv.setSmooth(true);
            iv.setCache(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
