package Widoki;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bledneDane.setVisible(false);
        zleHaslo.setVisible(false);
        inneHasla.setVisible(false);
        zlyLogin.setVisible(false);
    }
}
