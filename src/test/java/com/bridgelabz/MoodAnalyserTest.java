package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String sadMood = moodAnalyser.analyseMood();
        System.out.println(sadMood);
        Assertions.assertEquals("SAD", sadMood);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String happyMood = moodAnalyser.analyseMood();
        System.out.println(happyMood);
        Assertions.assertEquals("HAPPY", happyMood);

    }
}