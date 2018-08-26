package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    String taskName, where, using;
    boolean isTaskExecuted = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Driving task");
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
