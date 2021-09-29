package com.epam.poc.controller;

import com.epam.poc.entity.UserSettings;
import com.epam.poc.service.QueueService;
import com.epam.poc.service.QueueServiceTest;
import com.ibm.db2.jcc.b.r;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private QueueServiceTest queueServiceTest;

    /*@RequestMapping(path = "startQueueListener", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public void testQueue() throws Exception {
        queueService.checkTheQueue();
    }*/

    @RequestMapping(path = "putDataToQueue/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public void putDataToQueue(@PathVariable Integer id) throws Exception {
        queueServiceTest.putDataToQueue(id);
    }
}
