package Widoki;

import Dane.News;
import Dane.Opinia;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class OpiniaSzczegolController {

    @FXML
    private Label sprzet;

    @FXML
    private Label ekspert;

    @FXML
    private Label tresc;

    private Opinia opinia;

    public void setData(Opinia opinia) {
        this.opinia = opinia;
        sprzet.setText(opinia.getElektro());
        tresc.setText(opinia.getTresc());
        ekspert.setText(opinia.getEkspert());

    }
}
