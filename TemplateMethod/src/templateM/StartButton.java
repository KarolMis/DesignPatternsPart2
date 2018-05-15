package templateM;

public class StartButton {
    public void startTheCar(){

    fastenSeatbelts();
    startTheIgnition();
    setTheGear();
    go();
    }

    private void go() {
        System.out.println("ruszamy");
    }

    private void setTheGear() {
        System.out.println("");
    }

    private void startTheIgnition() {
        System.out.println("przekręcamy klucz");
    }

    private void fastenSeatbelts() {
        System.out.println("zapianamy pasy");
    }
}
