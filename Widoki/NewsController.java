package Widoki;

import Dane.News;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class NewsController implements Initializable {

    private List<News> newsy = new ArrayList<>();

    @FXML
    private GridPane grid;

    private List<News> getData(){
        News news;
        for (int i = 0; i < 20; i++){
            news = new News();
            news.setNazwa("Nowe iPhony!");
            news.setTresc("Nowe ajfony są super. Kup je już dziś. Będą lepsze niż zawsze. Cena nie odbiega od poprzednich premier.");
            news.setImgSource("resources/1-Apple_announce-iphone12pro_10132020.jpg");
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
