package behavioral.observer;

public class StockTicker extends AbstractSubject {

    protected Stock stock;

    public void setStock(Stock stock) {
        this.stock = stock;
        this.notifyUpdate();
    }

    public Stock getStock() {
        return stock;
    }
}
