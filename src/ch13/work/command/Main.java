package ch13.work.command;

public class Main {

    public static void main(String[] args) {
        /* Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders(); */

        CommodityFactory cf = new CommodityFactory();
        BuyCommodity buyBeans = new BuyCommodity(cf.getCommodity(CommodityType.BEANS, 1.23), 10);
        BuyCommodity buyCorn = new BuyCommodity(cf.getCommodity(CommodityType.CORN, 2.34), 15);
        BuyCommodity buyWheat = new BuyCommodity(cf.getCommodity(CommodityType.WHEAT, 3.45), 20);
        SellCommodity sellWheat = new SellCommodity(cf.getCommodity(CommodityType.WHEAT, 3.45), 10);

        Broker broker = new Broker();

        broker.takeOrder(buyBeans);
        broker.takeOrder(buyCorn);
        broker.takeOrder(buyWheat);
        broker.takeOrder(sellWheat);

        broker.placeOrders();
    }
}