package behavioral.mediator;

class DollarConverter {

    private static final float DOLLAR_UNIT = 1.0F;
    private static final float EURO_UNIT = 0.7F;
    private static final float INR_UNIT = 45.0F;

    DollarConverter(Mediator mediator) {
       mediator.registerDollarConverter(this);
    }

    private float convertEurosToDollar(float euros) {
        float dollar = euros * (DOLLAR_UNIT / EURO_UNIT);
        System.out.println("Converting " + euros + " euros to " + dollar + " dollar");
        return dollar;
    }

    private float convertInrToDollar(float inr) {
        float dollar = inr * (DOLLAR_UNIT / INR_UNIT);
        System.out.println("Converting " + inr + " inr to " + dollar + " dollar");
        return dollar;
    }

    float convertCurrencyIntoDollars(float bid, String unitOfCurrency) {
        if ("INR".equalsIgnoreCase(unitOfCurrency)) {
            return convertInrToDollar(bid);
        } else {
            return convertEurosToDollar(bid);
        }
    }
}
