package prod.ladeiko.taxi.model;

public class PassengerOrder {
    private String address;
    private int ratingPassenger;
    private long orderCost;
    private boolean statusOfOrder;

    public PassengerOrder(){}
    public PassengerOrder(String address, int ratingPassenger, long orderCost, boolean statusOfOrder) {
        this.address = address;
        this.ratingPassenger = ratingPassenger;
        this.orderCost = orderCost;
        this.statusOfOrder = statusOfOrder;
    }

    public String getAddress() {
        return address;
    }

    public int getRatingPassenger() {
        return ratingPassenger;
    }

    public long getOrderCost() {
        return orderCost;
    }

    public boolean isStatusOfOrder() {
        return statusOfOrder;
    }
}
