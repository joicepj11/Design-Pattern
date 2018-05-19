package behavioral.observer;

public class GoogleObserver extends AbstractObserver {

     StockTicker stockTicker;

    public GoogleObserver(StockTicker subject) {
        subject.register(this);
        this.stockTicker = subject;
    }

    @Override
    public void update() {
        Stock stock = this.stockTicker.getStock();
        if(stock.getString().equals("google"))
        System.out.println("Stock price of google " + stock.getPrice());
    }
}
