package zadanie;

public abstract class Child {

    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    Child getTallerChild() {
        return tallerChild;
    }

    void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

}
