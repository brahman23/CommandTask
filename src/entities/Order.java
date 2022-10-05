package entities;

public class Order {
    private String orderFree;
    private int load;

    public Order(String orderFree, int load) {
        this.orderFree = orderFree;
        this.load = load;
    }

    public String getOrderFree() {
        return orderFree;
    }

    public void setOrderFree(String orderFree) {
        this.orderFree = orderFree;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
