package com.shanghai.albert;

import com.shanghai.albert.timer.TimerJob;

import java.util.Timer;

/**
 * App
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Timer timer = new Timer();
        long startDelay = 1000; //Unit(ms)
        long repeatInterval = 10000;  //Unit(ms)

        timer.schedule(new TimerJob("job1"), startDelay, repeatInterval);

        timer.schedule(new TimerJob("job2"), startDelay * 2, repeatInterval * 2);


    }
}
