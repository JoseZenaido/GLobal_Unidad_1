package mx.edu.utng.unidad_i_patronesdise;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> mementos = new ArrayList<Memento>();

    public void addMemento(Memento memento){
        mementos.add(memento);
    }

    public Memento getMemento(int index){
        return  mementos.get(index);
    }

    public ArrayList<Memento> getMementos() {
        return mementos;
    }
}
