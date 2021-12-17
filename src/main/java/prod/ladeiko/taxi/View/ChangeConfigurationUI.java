package prod.ladeiko.taxi.View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChangeConfigurationUI {
    private Label title;
    private Label text;
    private Button changeButton;
    private VBox vBoxFromText;
    private VBox vBoxFromAll;
    private Stage stage;

    public void init(){
        title = new Label("Изменить кофнигурацию машины");
        text = new Label("В этом поле мы изменяем конфигурацию машины!!!");
        changeButton = new Button("Изменить");
        changeButton.setOnAction(actionEvent -> {
            CreateOrderUI createOrderUI = new CreateOrderUI();
            createOrderUI.init();
        });

        vBoxFromText = new VBox(title, text);
        vBoxFromText.setSpacing(30);
        vBoxFromText.setAlignment(Pos.CENTER);

        vBoxFromAll = new VBox(vBoxFromText, changeButton);
        vBoxFromAll.setAlignment(Pos.CENTER);
        vBoxFromAll.setSpacing(10);

        Scene scene = new Scene(vBoxFromAll);

        this.stage = new Stage();
        this.stage.setScene(scene);
        this.stage.setTitle("Change Сonfigure Auto");
        this.stage.setResizable(false);
        this.stage.setMinHeight(300);
        this.stage.setMinWidth(400);
        this.stage.show();

    }
}
