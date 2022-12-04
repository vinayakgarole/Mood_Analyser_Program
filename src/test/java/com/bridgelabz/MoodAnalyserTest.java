package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String sadMood = moodAnalyser.analyseMood();
        System.out.println(sadMood);
        Assertions.assertEquals("SAD", sadMood);
    }
}