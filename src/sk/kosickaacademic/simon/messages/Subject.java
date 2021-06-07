package sk.kosickaacademic.simon.messages;

import sk.kosickaacademic.simon.messages.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;
    private int priority;

    public String getMessage() {
        return message;
    }

    public int getPriority() {
        return priority;
    }

    public void setMessage(String message, int priority) {
        this.message = message;
        this.priority = priority;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for(Observer observer : observers)
            observer.update();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
