package com.epam.poc.service;

import com.ibm.as400.access.AS400SecurityException;
import com.ibm.as400.access.ErrorCompletingRequestException;
import com.ibm.as400.access.IllegalObjectTypeException;
import com.ibm.as400.access.ObjectDoesNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ScheduleService {

    @Autowired
    private QueueService queueService;

    //@Scheduled(cron = "*/5 * * * * *")
    /*@Scheduled(fixedDelay = 1000*60)
    public void queueReader() throws Exception {
        queueService.checkTheQueue();
    }*/
}
