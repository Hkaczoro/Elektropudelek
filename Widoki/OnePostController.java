package Widoki;

import Dane.News;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class OneNewsController {

    @FXML
    private Label tytul;

    @FXML
    private Label tresc;

    @FXML
    private Button czytaj;

    private PostNaForum post;

    public void setData(PostNaForum post){
        this.post = post;
        tytul.setText(post.getNazwa());
        tresc.setText(post.getTresc());

    
    }
}
