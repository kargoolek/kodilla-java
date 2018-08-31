package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable {
    private final List<Observer> observers;
    private final String name;
    private final List<String> exercises;

    public HomeworkQueue(final String name) {
        observers = new ArrayList<>();
        exercises = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyObservers();
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getName() {
        return name;
    }

}
