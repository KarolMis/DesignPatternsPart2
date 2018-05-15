package zadanie;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter){
            System.out.println("Promocyjna cena: " + price/2 +" zł");
        } else {

            System.out.println("Użytkownik nie jest zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
