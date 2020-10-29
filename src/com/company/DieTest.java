package com.company;

import jdk.jshell.execution.JdiExecutionControl;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @org.junit.jupiter.api.Test
    void rollMultiple() {
        Die die = new Die();
        die.rollMultiple(6000);

    }
}