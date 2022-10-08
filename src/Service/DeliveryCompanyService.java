package Service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Order;

import java.util.ArrayList;

public class DeliveryCompanyService {
    private ArrayList<DeliveryCompany> deliveryCompanies;

    public DeliveryCompanyService(ArrayList<DeliveryCompany> deliveryCompanies) {
        this.deliveryCompanies = deliveryCompanies;
    }

    public void acceptOrder(Order order){
        for (DeliveryCompany d:deliveryCompanies) {
            if (d.getMaxCapacityPerSquareSantimeter()>=(order.getLoad().getWidht()*order.getLoad().getHeight()*order.getLoad().getLenght())){
                d.setOrder(order);
                System.out.println(d);
            }else {
                System.out.println("Bul load chon , batpait ");
            }
        }
    }
    public void createDeliveryCompany(String deliveryCompanyName ) {
        DeliveryCompany deliveryCompany = new DeliveryCompany(deliveryCompanyName);
        deliveryCompanies.add(deliveryCompany);
    }
    public static int getTotalFee(Customer customer) {
        int totalFee = 0;
        for (Order order :customer.getOrder()) {
            totalFee += order.getOrderFee();
        }
        return totalFee;
    }
    public static int getCompanyProfit(DeliveryCompany deliveryCompany) {
        int totalProfit = 0;
        for (Customer customer : deliveryCompany.getCustomers()) {
            totalProfit += getTotalFee(customer);
        }
        return totalProfit;
    }

    @Override
    public String toString() {
        return "\nDeliveryCompanyService: " +
                "\ndeliveryCompanies: " + deliveryCompanies;
    }
}
