package Lab3.Challenge4;

import java.util.ArrayList;

public class Teacher implements ObservedSubject{

    private ArrayList<Observer> observersList;

    Teacher() {
        observersList = new ArrayList<>();
    }
    @Override
    public void register(Observer newObj) {
            observersList.add(newObj);
    }

    @Override
    public void unregister(Observer deleteObj) {
        observersList.remove(deleteObj);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer obs : observersList) {
                obs.update(message);
            }
    }

    public void teach(String javaTopics) {
           notifyObservers(javaTopics);
        }
}

