package prod.ladeiko.taxi.View;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateOrderUI {
    private Label title;
    private Label costOfTravel;
    private Label cost;
    private Label addressTravel;
    private Label address;
    private Button changeButton;
    private Button cancelButton;
    private Button orderButton;
    private HBox hBoxFromTitles;
    private HBox hBoxFromText;
    private HBox hBoxFromButtons;
    private VBox vBoxFromAll;
    private Stage stage;

    public void init(){
        title = new Label("Заказать машину");

        costOfTravel = new Label("Стоимость поездки");
        addressTravel = new Label("Адрес поездки");
        hBoxFromTitles = new HBox(costOfTravel, addressTravel);
        hBoxFromTitles.setSpacing(70);

        costOfTravel = new Label("$$$$$$$");
        address = new Label("Адрес!!!!");
        hBoxFromText = new HBox(costOfTravel, address);
        hBoxFromText.setSpacing(70);

        orderButton = new Button("Заказать");
        changeButton = new Button("Изменить");
        cancelButton = new Button("Отменить");

        hBoxFromButtons = new HBox(orderButton, cancelButton, cancelButton);
        hBoxFromButtons.setSpacing(10);

        vBoxFromAll = new VBox(title, hBoxFromTitles, hBoxFromText, hBoxFromButtons);
        vBoxFromAll.setAlignment(Pos.CENTER);
        vBoxFromAll.setSpacing(20);

        Scene scene = new Scene(vBoxFromAll);

        this.stage = new Stage();
        this.stage.setScene(scene);
        this.stage.setTitle("Order Auto");
        this.stage.setResizable(false);
        this.stage.setMinHeight(300);
        this.stage.setMinWidth(400);
        this.stage.show();

    }
}
