package zadanie;

import java.util.Date;

class OperatingSystem {
    private int backupNumber = 0;
    private Date backupDate;

    void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Utworzono backup nr: " + this.backupNumber + " z datą: " + backupDate);
    }

    OperatingSystemMemento save(){
        return  new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    void  load(OperatingSystemMemento operatingSystemMemento) {
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
    }

}
