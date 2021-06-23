package Widoki;

import Dane.News;
import Dane.PostNaForum;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class OnePostController {

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
