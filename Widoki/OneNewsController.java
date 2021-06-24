package Widoki;

import Dane.News;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class OneNewsController {

    @FXML
    private Label nazwa;

    @FXML
    private Label tresc;

    @FXML
    private ImageView zdjecie;

    private News news;

    public void setData(News news) throws FileNotFoundException {
        this.news = news;
        nazwa.setText(news.getNazwa());
        tresc.setText(news.getTresc());

        //InputStream stream = new FileInputStream("D:\\Users\\kubam\\Documents\\Studia\\Propgramowanie\\Piu\\piu21l_kaczorowski\\ElektroPudelek\\src\\Widoki\\resources\\images.jpg");
        InputStream stream = new FileInputStream("/Users/hubertkaczorowski/Desktop/gegagnhwrt/ElektroPudelek/src/Widoki/resources/images.jpg");
        Image image = new Image(stream);

       // Image image = new Image(getClass().getResourceAsStream(news.getImgSource()));
        zdjecie.setImage(image);
    }
}
