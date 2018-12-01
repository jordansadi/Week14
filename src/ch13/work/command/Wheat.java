package ch13.work.command;

public class Wheat implements Commodity {
    private double dailyPrice;

    public Wheat(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public void buy() {
        System.out.println("Wheat bought at $" + dailyPrice + " per unit.");
    }

    public void sell() {
        System.out.println("Wheat sold at $" + dailyPrice + " per unit.");
    }

    public double getDailyPrice() {
        return dailyPrice;
    }
}
