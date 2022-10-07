package Service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Order;

import java.util.ArrayList;

public class DeliveryCompanyService {
    private ArrayList<DeliveryCompany> deliveryCompanies;
    public void createDeliveryCompany(String deliveryCompanyName ) {
        DeliveryCompany deliveryCompany = new DeliveryCompany(deliveryCompanyName);
        deliveryCompanies.add(deliveryCompany);
    }
    public static int getTotalFee(Customer customer) {
        int totalFee = 0;
        for (Order order : customer.getOrders()) {
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
}
