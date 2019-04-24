package behavioral.mediator;

class Buyer {

    Mediator mediator;
    private String unitOfCurrency;

    Buyer(Mediator mediator, String unitOfCurrency) {
        this.mediator = mediator;
        this.unitOfCurrency = unitOfCurrency;
    }

    boolean attemptToPurchase(float bid){
        System.out.println("Buyer Attempting the bid of "+bid + " "+unitOfCurrency);
       return mediator.placeBid(bid,unitOfCurrency);
    }
}
