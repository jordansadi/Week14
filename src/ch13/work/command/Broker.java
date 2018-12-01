package ch13.work.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();
    private double grandTotal;

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
            grandTotal += order.getTotalPrice();
        }
        orderList.clear();
        System.out.printf("Total amount spent: $%.2f\n", grandTotal);
    }
}
