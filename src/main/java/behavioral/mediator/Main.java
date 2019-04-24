package behavioral.mediator;

public class Main {


    public static void main(String[] args) {

        Mediator mediator  = new Mediator();
        Buyer indianBuyer = new IndianBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        float sellingPriceInDollar = 10.0f;

        new AmericanSeller(mediator,sellingPriceInDollar);
        new DollarConverter(mediator);

        float indianBidInr = 55f;

        while (!indianBuyer.attemptToPurchase(indianBidInr)){
            indianBidInr += 15;
        }

        float frenchBidInr = 3f;

        while (!frenchBuyer.attemptToPurchase(frenchBidInr)){
            frenchBidInr += 1.5;
        }
    }
}
