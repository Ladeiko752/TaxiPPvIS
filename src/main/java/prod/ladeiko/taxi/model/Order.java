package prod.ladeiko.taxi.model;

public class Order {
    private DriverOrder driverOrder;
    private PassengerOrder passengerOrder;

    {
        driverOrder = new DriverOrder();
        passengerOrder = new PassengerOrder();
    }
}
