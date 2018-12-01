package ch13.work.command;

public class Beans implements Commodity {
    private double dailyPrice;

    public Beans(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public void buy() {
        System.out.println("Beans bought at $" + dailyPrice + " per unit.");
    }

    public void sell() {
        System.out.println("Beans sold at $" + dailyPrice + " per unit.");
    }

    public double getDailyPrice() {
        return dailyPrice;
    }
}
