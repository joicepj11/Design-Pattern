package behavioral.mediator;

class IndianBuyer extends Buyer {

    IndianBuyer(Mediator mediator) {
        super(mediator, "INR");
        this.mediator.registerIndianBuyer(this);
    }
}