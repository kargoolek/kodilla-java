package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue student1ExerciseQueue = new Student1ExerciseQueue();
        HomeworkQueue student2ExerciseQueue = new Student2ExerciseQueue();
        Mentor mentor1 = new Mentor("Mentor #1");
        Mentor mentor2 = new Mentor("Mentor #2");
        student1ExerciseQueue.registerObserver(mentor1);
        student1ExerciseQueue.registerObserver(mentor2);
        student2ExerciseQueue.registerObserver(mentor1);
        //When
        student1ExerciseQueue.addExercise("Finished exercise 20.3.");
        student1ExerciseQueue.addExercise("Finished exercies 20.4");
        student2ExerciseQueue.addExercise("Finished exercise 10.1");
        student1ExerciseQueue.addExercise("Finished exercise 20.5");
        student2ExerciseQueue.addExercise("Finished exercise 10.2");
        //Then
        assertEquals(5, mentor1.getMessagesCount());
        assertEquals(3, mentor2.getMessagesCount());
    }
}