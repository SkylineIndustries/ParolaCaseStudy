package org.nl.parola.MOCKDATA;

public class Timer {
    static long currentTime = 0;
    static long previousTime = 0;


    public static void startTimer(){
        previousTime = System.currentTimeMillis();
    }

    public static void stopTimer(){
        currentTime = System.currentTimeMillis();
    }

    /**
     * Gets the difference in time for the quiz.
     * @return 0 if one of the times has not been set. If the quiz takes to long, then it will return 500 as a value
     */
    public static int getTimeDifference(){
        if(currentTime == 0 || previousTime == 0){
            return 0;
        }
        int difference = Math.toIntExact((currentTime - previousTime))/1000;
        return Math.min(difference, 500);
    }
}
