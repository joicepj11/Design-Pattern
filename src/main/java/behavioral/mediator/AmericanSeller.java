package behavioral.mediator;

class AmericanSeller {

    private float priceInDollars;

    AmericanSeller(Mediator mediator, float priceInDollars) {
        this.priceInDollars = priceInDollars;
        mediator.registerAmericanSeller(this);
    }

    boolean isBidAccepted(float bidInDollars) {
        if (bidInDollars > priceInDollars) {
            System.out.println("Seller accepts bid of " + bidInDollars + " dollars\n");
            return true;
        } else {
            System.out.println("Seller rejects bid of " + bidInDollars);
        }
        return false;
    }

}