package entities;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private final double pricePerKilogram = 150;
    private  Customer [] customers;
    private final double maxCapacityPerSquareSantimeter=1000;
    private Order order;


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public DeliveryCompany(String nameOfDeliveryCompany) {
    }

    public DeliveryCompany(Customer[] customers) {
        this.customers = customers;
    }

    public double getMaxCapacityPerSquareSantimeter() {
        return maxCapacityPerSquareSantimeter;
    }

    public Customer[] getCustomers() {
        return getCustomers();
    }
}
