package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int messagesCount;

    public Mentor(final String name) {
        this.name = name;
    }

    @Override
    public void update(final HomeworkQueue homework) {
        System.out.println(name + ": New exercise completed. " + homework.getName() + "\n" + " (total: " + homework.getExercises().size() + " messages");
        messagesCount++;
    }

    public int getMessagesCount() {
        return messagesCount;
    }
}
