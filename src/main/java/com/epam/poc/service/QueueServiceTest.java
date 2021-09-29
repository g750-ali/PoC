package com.epam.poc.service;


import com.ibm.as400.access.AS400;
import com.ibm.as400.access.DataQueue;
import com.ibm.as400.access.DataQueueEntry;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class QueueServiceTest {

    public void putDataToQueue(Integer id) throws Exception {
        AS400 system = new AS400("pub400.com", "DBORISOV", "MyPerCom0");
        system.connectService(AS400.DATAQUEUE);
        DataQueue dq = new DataQueue(system, "/QSYS.LIB/DBORISOV1.LIB/POC_Q.DTAQ");
        for (int i = 0; i < id; i++) {
            dq.write("Test queue data: " + i);
            System.out.println("Data is added");
        }
        system.disconnectService(AS400.DATAQUEUE);
    }
}
