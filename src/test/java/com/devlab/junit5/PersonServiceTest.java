package com.devlab.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Entities.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import Utils.LogTracker;
import Utils.LogTrackerStub;

public class PersonServiceTest {

    @RegisterExtension
    LogTrackerStub logTrackerStub = LogTrackerStub.create().recordForLevel(LogTracker.LogLevel.INFO)
            .recordForType(Person.class);

    @Test
    public void testCUTMethodOne() {
        logTrackerStub.recordForLevel(LogTracker.LogLevel.DEBUG);
        Person classUnderTest = new Person();
        classUnderTest.doNothingButLog();

        assertTrue(logTrackerStub.contains("Inside CUT.doNothingButLog"));
        assertEquals(1, logTrackerStub.size());
    }

    @Test
    public void testCUTMethodTwo() {
        Person classUnderTest = new Person();
        classUnderTest.doNothingButLogTwo();
        assertTrue(logTrackerStub.contains("Start CUT.doNothingBugLogTwo"));
        assertTrue(logTrackerStub.contains("End CUT.doNothingBugLogTwo"));
        assertEquals(2, logTrackerStub.size());
    }

}
