package Widoki;

import Funkcje.Logowanie;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LoginController implements Initializable, Logowanie {

    @FXML
    private AnchorPane mainPane;

    @FXML
    private TextField loginR;

    @FXML
    private TextField loginL;

    @FXML
    private PasswordField hasloR;

    @FXML
    private PasswordField hasloRR;

    @FXML
    private PasswordField hasloL;

    @FXML
    private Label zlyLogin;

    @FXML
    private Label inneHasla;

    @FXML
    private Label zleHaslo;

    @FXML
    private Label bledneDane;
    List<String> pasy = new ArrayList<String>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bledneDane.setVisible(false);
        zleHaslo.setVisible(false);
        inneHasla.setVisible(false);
        zlyLogin.setVisible(false);
    }
    public void setScreen(AnchorPane pane){
        mainPane.getChildren().clear();
        mainPane.getChildren().add(pane);
    }

    @Override
    public void zarejestrujUzytkownika() {
        if (loginR.getText().length() > 12 || loginR.getText().length() < 6){
            zlyLogin.setVisible(true);
        }
        else if(hasloR.getText().length() > 18 || hasloR.getText().length() < 8){
            zleHaslo.setVisible(true);
        }
        else if(!hasloRR.getText().equals(hasloR.getText())){
            inneHasla.setVisible(true);
        }
        else{
            String loginS = loginR.getText();
            String hasloS = hasloR.getText();
            pasy.add(loginS);
            pasy.add(hasloS);
            zlyLogin.setVisible(false);
            zleHaslo.setVisible(false);
            inneHasla.setVisible(false);
            loginR.setText("");
            hasloR.setText("");
            hasloRR.setText("");
        }
    }

    @Override
    public void zaloguj() {
        if (!loginL.getText().equals(pasy.get(0))|| !hasloL.getText().equals(pasy.get(1))){
            bledneDane.setVisible(true);
        }
        else{
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/Widoki/newsy.fxml"));
            AnchorPane pane = null;
            try {
                pane = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            NewsController newsController = loader.getController();
            newsController.setLoginController(this);
            setScreen(pane);

        }
    }

    public void backToLog() {
        
    }

    @Override
    public void zmienHaslo() {

    }

    @Override
    public void zmienLogin() {

    }
}
