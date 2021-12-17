package prod.ladeiko.taxi.model;

public class DriverOrder {
    private String address;
    private int ratingDriver;
    private long orderCost;
    private boolean statusOfOrder;

    public DriverOrder(){}
    public DriverOrder(String address, int ratingDriver, long orderCost, boolean statusOfOrder) {
        this.address = address;
        this.ratingDriver = ratingDriver;
        this.orderCost = orderCost;
        this.statusOfOrder = statusOfOrder;
    }

    public String getAddress() {
        return address;
    }

    public int getRatingDriver() {
        return ratingDriver;
    }

    public long getOrderCost() {
        return orderCost;
    }

    public boolean isStatusOfOrder() {
        return statusOfOrder;
    }
}
