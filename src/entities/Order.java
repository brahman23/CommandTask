package entities;

public class Order {
    private String orderFree;
    private Load load;

    public Order(String orderFree, Load load) {
        this.orderFree = orderFree;
        this.load = load;
    }

    public String getOrderFree() {
        return orderFree;
    }

    public void setOrderFree(String orderFree) {
        this.orderFree = orderFree;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }


    public int getOrderFee() {
    }
}
