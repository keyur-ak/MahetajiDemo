import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class mainController implements Initializable{
    AnchorPane a;
    @FXML
    private MenuItem acccreate;
    @FXML
    private AnchorPane homePageAnchorePane;
    public void acccreateclick() {
        System.out.println("account creation called");
        System.out.println(homePageAnchorePane.getScene());
        if (!homePageAnchorePane.getChildren().isEmpty()) {
            homePageAnchorePane.getChildren().removeAll();
        } else {
            System.out.println(a);
            homePageAnchorePane.getChildren().setAll(a);
            System.out.println(homePageAnchorePane.getChildren());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            a=FXMLLoader.load(getClass().getResource("AccCreate/AccCreate.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        KeyCombination kc = new KeyCodeCombination(KeyCode.C, KeyCombination.ALT_DOWN);
        acccreate.setAccelerator(kc);
    }
}
