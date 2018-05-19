package behavioral.observer;

public class MicrosoftObserver extends AbstractObserver {

    StockTicker stockTicker;

    public MicrosoftObserver(StockTicker subject) {
        subject.register(this);
        this.stockTicker = subject;
    }

    @Override
    public void update() {
        Stock stock = this.stockTicker.getStock();
        if(stock.getString().equals("microsoft"))
            System.out.println("Stock price of microsoft " + stock.getPrice());
    }
}
