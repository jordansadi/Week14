package ch13.work.command;

public class CommodityFactory {
    public Commodity getCommodity (CommodityType ct, double dailyPrice){
        switch (ct){
            case BEANS: return new Beans(dailyPrice);
            case CORN: return new Corn(dailyPrice);
            case WHEAT: return new Wheat(dailyPrice);
            default: return null;
        }
    }
}
