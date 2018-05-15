package zadanie;

public class PriceCalculator {
    private PricingStrategy pricingStrategy;

    void calculate(int price, boolean isSignedUpForNewsletter){
        pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}

