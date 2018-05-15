package zadanie;

public class Tomek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)) {
            System.out.println("Tomek zdjął słoik z półki!");
        } else {
            System.out.println("Nawet tomek jest za mały");
        }
    }
}
