package prod.ladeiko.taxi.View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChangeListUI {
    private Label title;
    private Label header;
    private Label text;
    private Button addingButton;
    private Button deleteButton;
    private HBox hBoxFromButtons;
    private VBox vBoxFromText;
    private VBox vBoxFromAll;
    private Stage stage;

    public void init(){
        title = new Label("Изменить список");
        header = new Label("избранных адресов");
        text = new Label("Мой любимый адрес");
        addingButton = new Button("Добавить");
        addingButton.setOnAction(actionEvent -> {
            ChangeConfigurationUI changeConfigurationUI = new ChangeConfigurationUI();
            changeConfigurationUI.init();
        });
        deleteButton = new Button("Удалить");

        vBoxFromText = new VBox(title, header, text);
        vBoxFromText.setSpacing(10);
        vBoxFromText.setAlignment(Pos.CENTER);

        hBoxFromButtons = new HBox(addingButton, deleteButton);
        hBoxFromButtons.setSpacing(50);
        hBoxFromButtons.setAlignment(Pos.CENTER);

        vBoxFromAll = new VBox(vBoxFromText, hBoxFromButtons);
        vBoxFromAll.setAlignment(Pos.CENTER);
        vBoxFromAll.setSpacing(10);

        Scene scene = new Scene(vBoxFromAll);

        this.stage = new Stage();
        this.stage.setScene(scene);
        this.stage.setTitle("Change List");
        this.stage.setResizable(false);
        this.stage.setMinHeight(300);
        this.stage.setMinWidth(400);
        this.stage.show();

    }
}
