package prod.ladeiko.taxi.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class AuthorizationUI {
    private final FlowPane flowPane = new FlowPane();
    private TextField login;
    private TextField password;
    private Label authorizationLabel;
    private Button signInButton;
    private VBox vBox;

    public AuthorizationUI(){
        login = new TextField();
        password = new TextField();
        authorizationLabel = new Label("Aвторизация");
        signInButton = new Button("Войти");
        signInButton.setOnAction(actionEvent -> {
            ChangeListUI changeList = new ChangeListUI();
            changeList.init();
        });
        login.setPromptText("Логин");
        password.setPromptText("Пароль");
        vBox = new VBox(authorizationLabel, login, password, signInButton);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);

        this.flowPane.getChildren().addAll(vBox);
        this.flowPane.setAlignment(Pos.CENTER);
        this.flowPane.setMinHeight(300);
        this.flowPane.setMinWidth(400);
    }

    public FlowPane getFlowPane(){
        return this.flowPane;
    }
}
