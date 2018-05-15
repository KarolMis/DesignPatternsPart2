package zadanie;

public class MotherRequest {
    private Shelf shelf;

    MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }
}
