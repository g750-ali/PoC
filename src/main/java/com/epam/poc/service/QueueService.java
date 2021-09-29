package com.epam.poc.service;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.ibm.as400.access.*;

import javax.annotation.PostConstruct;

@Service
public class QueueService {

    //@PostConstruct
    @Scheduled(fixedDelay = 10000)
    public void checkTheQueue() throws Exception {

        AS400 system = new AS400("pub400.com", "DBORISOV", "MyPerCom0");
        //DataQueue dq = new DataQueue(system, "/qsys2/DBORISOV1/POC_Q");
        DataQueue dq = new DataQueue(system, "/QSYS.LIB/DBORISOV1.LIB/POC_Q.DTAQ");
        system.connectService(AS400.DATAQUEUE);

        DataQueueEntry DQData = null;
        String messageData = null;

        //RecordFormat dataFormat = new RecordFormat();
        while (true) {
            //Record data = dataFormat.getNewRecord(DQData.getData());
            //String messageData = (String) data.getField("message_data");
            DQData = dq.read(-1);
            messageData = DQData.getString().trim();
            System.out.println("message_data: " + messageData);

        }
    }
}
