package behavioral.mediator;

class FrenchBuyer extends Buyer {

    FrenchBuyer(Mediator mediator) {
        super(mediator, "EURO");
        this.mediator.registerIndianBuyer(this);
    }
}
