package smart_app;

class SmartApp {

    private Double version;

    void changeVersion(Double version){
        this.version = version;
        System.out.println("nowa wersja: " + version);
    }

    SmartAppMemento save(){
        return  new SmartAppMemento(this.version);
    }

    void  load(SmartAppMemento smartAppMemento) {
        this.version = smartAppMemento.getVersion();
    }

}
