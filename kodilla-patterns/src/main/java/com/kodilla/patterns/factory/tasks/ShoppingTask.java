package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName, whatToBuy;
    private double quantity;
    private boolean isTaskExecuted = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing Shopping task");
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
