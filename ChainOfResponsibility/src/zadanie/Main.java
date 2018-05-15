package zadanie;

public class Main {
    public static void main(String[] args) {
        MotherRequest motherRequest = new MotherRequest(Shelf.HIGH);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        ania.setTallerChild(antek);
        antek.setTallerChild(tomek);
        ania.processRequest(motherRequest);
        //init
    }
}
