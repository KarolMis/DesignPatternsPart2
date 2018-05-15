package zadanie;

public class NewDay extends WeekDay {
    @Override
    protected void work() {
        System.out.println("pracujemy!");
    }

    @Override
    protected int goToWork(TypeOfTransport transport) {
        switch(transport) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }
}
