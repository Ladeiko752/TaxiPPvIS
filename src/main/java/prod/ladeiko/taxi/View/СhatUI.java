package prod.ladeiko.taxi.View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class СhatUI {
    private Stage chatStage;
    private Label title;
    private TextField message;
    private Button sendMessageButton;
    private HBox hBoxFromTextField;
    private VBox vBox;

    public void init(){
        title = new Label("Чат");

        message = new TextField();
        message.setPromptText("Введите сообщение");
        sendMessageButton = new Button("Отправить");
        hBoxFromTextField = new HBox(message, sendMessageButton);
        hBoxFromTextField.setSpacing(0);

        vBox = new VBox(title, hBoxFromTextField);
        vBox.setSpacing(300);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox);

        this.chatStage = new Stage();
        this.chatStage.setScene(scene);
        this.chatStage.setTitle("Chat");
        this.chatStage.setResizable(false);
        this.chatStage.setMinHeight(300);
        this.chatStage.setMinWidth(400);
        this.chatStage.show();
    }
}
