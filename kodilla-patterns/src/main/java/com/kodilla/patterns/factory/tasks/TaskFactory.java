package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String TASK_PAINTING = "PaintingTask";
    public static final String TASK_DRIVING = "DrivingTask";
    public static final String TASK_SHOPPING = "ShoppingTask";

    public final Task createTask(final String taskType) {

        switch(taskType) {
            case TASK_SHOPPING:
                return new ShoppingTask(TASK_SHOPPING, "New item to buy", 12);
            case TASK_PAINTING:
                return new PaintingTask(TASK_PAINTING, "New painting", "red");
            case TASK_DRIVING:
                return new DrivingTask(TASK_DRIVING, "Drive home", "car");
            default:
                return null;
        }

    }

}
