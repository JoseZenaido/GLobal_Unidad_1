package mx.edu.utng.unidad_i_patronesdise;

import java.util.ArrayList;


public class CareTaker8 {
    private ArrayList<Memento8> mementos = new ArrayList<Memento8>();

    public void addMemento(Memento8 memento){
        mementos.add(memento);
    }

    public Memento8 getMemento(int index){
        return  mementos.get(index);
    }

    public ArrayList<Memento8> getMementos() {
        return mementos;
    }
}
