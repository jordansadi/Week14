package ch13.work.command;

public class BuyCommodity implements Order {
    private Commodity comm;
    private int quantity;
    private double totalPrice;

    public BuyCommodity(Commodity comm, int quantity){
        this.comm = comm;
        this.quantity = quantity;
        totalPrice = quantity * comm.getDailyPrice();
    }

    public void execute() {
        comm.buy();
        System.out.printf(quantity + " units bought for a total cost of $%.2f.\n", totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
