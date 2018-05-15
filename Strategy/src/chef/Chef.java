package chef;

import chef.egg_cooker.EggCooker;

public class Chef {

    private String name;
    private EggCooker eggCooker;

    Chef(String name) {
        this.name = name;
    }

    void cook(){
        this.eggCooker.cookEgg();
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
