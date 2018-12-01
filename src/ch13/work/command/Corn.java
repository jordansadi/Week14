package ch13.work.command;

public class Corn implements Commodity {
    private double dailyPrice;

    public Corn(double dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public void buy() {
        System.out.println("Corn bought at $" + dailyPrice + " per unit.");
    }

    public void sell() {
        System.out.println("Corn sold at $" + dailyPrice + " per unit.");
    }

    public double getDailyPrice() {
        return dailyPrice;
    }
}
