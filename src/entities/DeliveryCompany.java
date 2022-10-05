package entities;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private final double pricePerKilogram = 150;
    private int customers;
    private final double maxCapacityPerCubeSantimeter = 600;

    public DeliveryCompany(String deliveryCompanyName, int customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
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

    public int getCustomers() {
        return customers;
    }

    public void setCustomers(int customers) {
        this.customers = customers;
    }

    public double getMaxCapacityPerCubeSantimeter() {
        return maxCapacityPerCubeSantimeter;
    }
}
