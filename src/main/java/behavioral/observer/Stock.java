package behavioral.observer;

public class Stock {
    private int price;
    private String string;

    public Stock(String string,int price ) {
        this.price = price;
        this.string = string;
    }

    public int getPrice() {
        return price;
    }

    public String getString() {
        return string;
    }

}
