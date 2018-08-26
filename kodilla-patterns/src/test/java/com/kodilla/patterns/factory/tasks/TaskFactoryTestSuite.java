package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskFactoryTestSuite {

    @Test
    public void testFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        List<Task> taskList = new ArrayList<>();

        //When
        taskList.add(factory.createTask(TaskFactory.TASK_SHOPPING));
        taskList.add(factory.createTask(TaskFactory.TASK_DRIVING));
        taskList.add(factory.createTask(TaskFactory.TASK_PAINTING));
        taskList.add(factory.createTask(TaskFactory.TASK_SHOPPING));
        taskList.add(factory.createTask(TaskFactory.TASK_DRIVING));
        taskList.add(factory.createTask(TaskFactory.TASK_PAINTING));

        taskList.get(0).executeTask();
        taskList.get(1).executeTask();
        taskList.get(2).executeTask();

        //Then
        Assert.assertTrue(taskList.get(0).isTaskExecuted());
        Assert.assertTrue(taskList.get(1).isTaskExecuted());
        Assert.assertTrue(taskList.get(2).isTaskExecuted());
        Assert.assertFalse(taskList.get(3).isTaskExecuted());
        Assert.assertFalse(taskList.get(4).isTaskExecuted());
        Assert.assertFalse(taskList.get(5).isTaskExecuted());
        Assert.assertEquals(TaskFactory.TASK_SHOPPING, taskList.get(0).getTaskName());
        Assert.assertEquals(TaskFactory.TASK_DRIVING, taskList.get(1).getTaskName());
        Assert.assertEquals(TaskFactory.TASK_PAINTING, taskList.get(2).getTaskName());
    }

}
