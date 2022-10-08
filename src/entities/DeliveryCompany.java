package entities;

import java.util.Arrays;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private final double pricePerKilogram = 150;
    private Customer[] customers;
    private final int maxCapacityPerSquareSantimeter = 1000;
    private Order order;


    public DeliveryCompany(String deliveryCompanyName, Customer[] customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
    }

    public DeliveryCompany(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public double getPricePerKilogram() {
        return pricePerKilogram;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return getCustomers();
    }

    public int getMaxCapacityPerSquareSantimeter() {
        return maxCapacityPerSquareSantimeter;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "\n\tDeliveryCompany: " +
                "\ndeliveryCompanyName: " + deliveryCompanyName + '\'' +
                ", \npricePerKilogram: " + pricePerKilogram +
                ", \n\ncustomers: " + Arrays.toString(customers) +
                ", \nmaxCapacityPerSquareSantimeter: " + maxCapacityPerSquareSantimeter;
    }
}
