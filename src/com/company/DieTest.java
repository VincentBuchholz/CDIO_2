package com.company;

import jdk.jshell.execution.JdiExecutionControl;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @org.junit.jupiter.api.Test
    void rollMultiple() {
        Die die = new Die();
        die.rollMultiple(100);
    }
}