package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    private TaskList taskListToDo;

    @Autowired
    @Qualifier("inProgress")
    private TaskList taskListInProgress;

    @Autowired
    @Qualifier("done")
    private TaskList taskListDone;

    @Bean
    Board board() {
        return new Board(taskListToDo, taskListInProgress, taskListDone);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    TaskList taskListToDo() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    TaskList taskListInProgress() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    TaskList taskListDone() {
        return new TaskList();
    }

    @Bean
    @Scope("singleton")
    @Conditional(IsBackupServiceAvailable.class)
    BackupService backupService(){
        return new BackupService();
    }

}
