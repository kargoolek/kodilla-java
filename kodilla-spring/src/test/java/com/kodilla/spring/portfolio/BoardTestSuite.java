package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String testDoneTask = "Task to do #1";
        String testInProgressTask = "Task to do #2";
        String testToDoTask = "Task to do #3";

        board.getDoneList().addTask(testDoneTask);
        board.getInProgressList().addTask(testInProgressTask);
        board.getToDoList().addTask(testToDoTask);

        System.out.println("TASKS DONE:");
        board.getDoneList().getTasks().forEach(System.out::println);
        System.out.println("TASKS IN PROGRESS:");
        board.getInProgressList().getTasks().forEach(System.out::println);
        System.out.println("TASKS TO DO:");
        board.getToDoList().getTasks().forEach(System.out::println);

        //Then
        Assert.assertTrue(board.getDoneList().getTasks().contains(testDoneTask));
        Assert.assertTrue(board.getToDoList().getTasks().contains(testToDoTask));
        Assert.assertTrue(board.getInProgressList().getTasks().contains(testInProgressTask));
        Assert.assertTrue(board.getDoneList().getTasks().size() == 1);
        Assert.assertTrue(board.getToDoList().getTasks().size() == 1);
        Assert.assertTrue(board.getInProgressList().getTasks().size() == 1);
    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);

        //When & Then
        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");
    }

    @Test
    public void testBeans() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When & Then
        Assert.assertTrue(context.containsBean("board"));
        Assert.assertTrue(context.containsBean("toDo"));
        Assert.assertTrue(context.containsBean("inProgress"));
        Assert.assertTrue(context.containsBean("done"));
        Assert.assertFalse(context.containsBean("taskList"));
    }

}
