package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;

public class IsBackupServiceAvailable implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        int day = LocalDate.now().getDayOfWeek().getValue();
        return (day == 1 || day == 5 || day == 6 || day == 7);
    }
}