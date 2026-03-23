package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.OrderController;
import com.nt.model.Order;

@SpringBootApplication
public class OrderManagementApp {

    private final OrderController orderController;

    OrderManagementApp(OrderController orderController) {
        this.orderController = orderController;
    }

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(OrderManagementApp.class, args);
        
        OrderController controller = context.getBean(OrderController.class);

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Insert Order");
            System.out.println("2 View Orders");
            System.out.println("3 Delete Order");
            System.out.println("4 Update Order");
            System.out.println("5 Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Order p = new Order();

                    System.out.println("Enter OrderID:");
                    p.setOrderId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Enter Date:");
                    p.setDate(sc.nextLine());

                    System.out.println("Enter Customer Name:");
                    p.setCustomerName(sc.nextLine());

                    System.out.println("Enter Total Amount:");
                    p.setTotalAmount(sc.nextDouble());

                    controller.addOrder(p);
                    break;

                case 2:
                    List<Order> orders = controller.retrieveAllOrders();
                    orders.forEach(order ->
                            System.out.println(order.getOrderId() + " "
                                    + order.getDate() + " "
                                    + order.getCustomerName() + " "
                                    + order.getTotalAmount()));
                    break;

                case 3:
                    System.out.println("Enter Order ID to delete:");
                    controller.deleteOrder(sc.nextInt());
                    System.out.println("Order Deleted");
                    break;

                case 4:
                    Order up = new Order();

                    System.out.println("Enter Order ID: ");
                    up.setOrderId(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Enter New Date: ");
                    up.setDate(sc.nextLine());

                    System.out.println("Enter New CustomerName: ");
                    up.setCustomerName(sc.nextLine());

                    System.out.println("Enter New TotalAmount: ");
                    up.setTotalAmount(sc.nextDouble());

                    controller.updateOrder(up);
                    System.out.println("Order Updated");
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}