package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    String taskName, whatToPaint, color;
    boolean isTaskExecuted = false;

    public PaintingTask(final String taskName, final String whatToPaint, final String color) {
        this.taskName = taskName;
        this.whatToPaint = whatToPaint;
        this.color = color;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Painting task");
        setTaskExecuted(true);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

    public void setTaskExecuted(final boolean taskExecuted) {
        isTaskExecuted = taskExecuted;
    }
}
