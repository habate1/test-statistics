package com.pluralsight;

public class TestStatsApp {
    public static void main(String[] args) {
        // create an array with 10 test scores
        int[] testScores = {70, 100, 23, 54, 98, 56, 99, 97, 60, 99};
        int sum = 0;
        double average = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        // figure out average
        average = sum / testScores.length;

        System.out.println("The test score average for this class is: " + average);
    }
}
