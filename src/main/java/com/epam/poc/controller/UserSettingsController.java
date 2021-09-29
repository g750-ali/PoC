package com.epam.poc.controller;

import com.epam.poc.entity.UserSettings;
import com.epam.poc.repo.UserSettingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/userSettings")
public class UserSettingsController {

    @Autowired
    private UserSettingsRepo userSettingsRepo;

    @RequestMapping(method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public UserSettings getUserSettings() throws Exception {
        UserSettings us = userSettingsRepo.getByUserIdAndDeviceType(1, "android");
        if (us == null) {
            us = new UserSettings();
            HashMap<String, String> content = new HashMap<>();
            content.put("key1", "value1");
            content.put("key2", "value2");

            //us.setId(1L); // it's not supposed to be here
            us.setUserId(1);
            us.setDeviceType("android");
            //us.setContent("123"/*content*/);
            us.setContent(content);
            userSettingsRepo.saveAndFlush(us);

            us = userSettingsRepo.getByUserIdAndDeviceType(1, "android");
        }

        return  us;
    }
}
