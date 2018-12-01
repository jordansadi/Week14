package ch13.work.command;

public class SellCommodity implements Order {
    private Commodity comm;
    private int quantity;
    private double totalPrice;

    public SellCommodity(Commodity comm, int quantity){
        this.comm = comm;
        this.quantity = quantity;
        totalPrice = quantity * comm.getDailyPrice();
    }

    public void execute() {
        comm.sell();
        System.out.printf(quantity + " units sold for a total return of $%.2f.\n", totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice * -1;
    }
}
