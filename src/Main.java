import Service.DeliveryCompanyService;
import entities.Customer;
import entities.DeliveryCompany;
import entities.Load;
import entities.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Load load = new Load(9, 9, 3, 9);
        Order order = new Order(70, load);

        Customer customer = new Customer("Baktygul", order);
        Customer customer1 = new Customer("Sultanbek", order);
        Customer[] customers = {customer, customer1};

        DeliveryCompany deliveryCompany = new DeliveryCompany("Peaksoft", customers);
        ArrayList<DeliveryCompany> deliveryCompanies = new ArrayList<>();
        deliveryCompanies.add(deliveryCompany);

        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService(deliveryCompanies);
        Scanner scanner = new Scanner(System.in);

        String y = scanner.nextLine();
        while (!(y.contains("х"))) {

            switch (y) {
                case "1":
                    deliveryCompanyService.acceptOrder(order);
                case "2":
                    deliveryCompanyService.createDeliveryCompany("Peaksoft ");
                case "3":
//                    DeliveryCompanyService.getTotalFee(customer);
                case "4":
//                    DeliveryCompanyService.getCompanyProfit(deliveryCompany);
            }
            method();
            y = scanner.nextLine();
        }
    }

    public static void method() {
        System.out.println("-------------------Komandany tandanyz:------------------- ");
        System.out.println("1: Заказдарды компанияга салып , компанияны баткызуу лимити текшерилет. ");
        System.out.println("2: Комранияларды тузот.");
        System.out.println("3: Белгилуу бир кишинин бардык заказдарынын суммасын таап берет. ");
        System.out.println("4: Компаниянын тапкан пайдасын таап берет ");
    }
}