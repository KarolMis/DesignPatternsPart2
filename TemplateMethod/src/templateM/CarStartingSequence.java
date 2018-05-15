package templateM;

public abstract class CarStartingSequence {

    public final void startTheCar(){
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("ruszamy");
    }

    private void fastenSeatbelts() {
        System.out.println("zapianamy pasy");
    }

    public abstract void setTheGear();

    public abstract void startTheIgnition();
}
