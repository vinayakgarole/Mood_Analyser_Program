package com.bridgelabz;

public class MoodAnalyserException extends Exception {

    public String message;

    public MoodAnalyserException(String message) {
        super(message);
    }
}