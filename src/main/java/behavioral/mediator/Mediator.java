package behavioral.mediator;

class Mediator {

    private Buyer indianBuyer;
    private Buyer frenchBuyer;
    private AmericanSeller americanSeller;
    private DollarConverter dollarConverter;

    Mediator() {
    }

    void registerIndianBuyer(Buyer indianBuyer) {
        this.indianBuyer = indianBuyer;
    }

    void registerFrenchBuyer(Buyer frenchBuyer) {
        this.frenchBuyer = frenchBuyer;
    }

    void registerAmericanSeller(AmericanSeller americanSeller) {
        this.americanSeller = americanSeller;
    }

    void registerDollarConverter(DollarConverter dollarConverter) {
        this.dollarConverter = dollarConverter;
    }

    boolean placeBid(float bid, String unitOfCurrency) {
        float dollarAmount = dollarConverter.convertCurrencyIntoDollars(bid, unitOfCurrency);
        return americanSeller.isBidAccepted(dollarAmount);
    }
}
