package com.shanghai.albert.timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TimerTask;

/**
 * Created by zhaowenbo on 2016/4/14.
 */
public class TimerJob extends TimerTask {
    private static Logger logger = LoggerFactory.getLogger(TimerJob.class);

    private String jobName = "job"; //

    public TimerJob(String jobName) {
        this.jobName = jobName;
    }

    @Override
    public void run() {
        logger.info("jobName: " + jobName);
    }
}
