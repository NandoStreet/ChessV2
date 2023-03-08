
package code;

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void update();
}

class Model {
    private final List<Observer> observers = new ArrayList<>();
    private int state;
    
    public int getState() {
        return state;
    }
    
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

class View implements Observer {
    private Model model;
    
    public View(Model model) {
        this.model = model;
        this.model.attachObserver(this);
    }
    
    @Override
    public void update() {
        System.out.println("El estado del modelo ha cambiado a: " + model.getState());
    }
}
