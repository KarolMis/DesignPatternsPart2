package zadanie;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter){
            System.out.println("Użytkownik zapisany do newslettera," +
                    " należy wybrać inną strategię cenową!");
        } else
        System.out.println("Normalna cena: " + price +" zł");
    }
}
