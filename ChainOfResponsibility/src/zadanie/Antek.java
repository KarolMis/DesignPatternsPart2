package zadanie;

public class Antek extends Child {
    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)) {
            System.out.println("Antek zdjał słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
