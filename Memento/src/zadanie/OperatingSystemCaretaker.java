package zadanie;

class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;

    void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Zapisano backup nr: " + operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
        this.operatingSystemMemento = operatingSystemMemento;
    }

    OperatingSystemMemento getMemento() {
        System.out.println("Wczytano backup nr: " + operatingSystemMemento.getBackupNumber() + " z datą: " + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }
}
