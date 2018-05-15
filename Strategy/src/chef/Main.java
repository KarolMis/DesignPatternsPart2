package chef;

import chef.egg_cooker.HardBoilEggCooker;
import chef.egg_cooker.SoftBoilEggCooker;

public class Main {

    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoilEggCooker());
        chef.cook();

        chef.setEggCooker(new SoftBoilEggCooker());
        chef.cook();


    }
}
