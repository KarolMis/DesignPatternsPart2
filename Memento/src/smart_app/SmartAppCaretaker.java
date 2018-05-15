package smart_app;

import java.util.ArrayList;
import java.util.List;

class SmartAppCaretaker {

    private List<SmartAppMemento> mementos = new ArrayList<>();

    void addMemento(SmartAppMemento smartAppMemento) {
        mementos.add(smartAppMemento);
        System.out.println("Zapisana wersja: " + smartAppMemento.getVersion() + " znajduje się pod indexem: " + (mementos.size()-1));
    }

    SmartAppMemento getMemento(int index){
        System.out.println("wczytano wersje " + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
