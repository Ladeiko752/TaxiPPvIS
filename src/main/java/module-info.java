module prod.ladeiko.taxi {
    requires javafx.controls;
    requires javafx.fxml;


    opens prod.ladeiko.taxi to javafx.fxml;
    exports prod.ladeiko.taxi;
}