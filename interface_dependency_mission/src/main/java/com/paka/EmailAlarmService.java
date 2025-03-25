package com.paka;

import java.util.HashMap;
import java.util.Map;

public class EmailAlarmService implements AlarmService {
    @Override
    public Map<String, Object> sendAlarm(String message, String recipient) {
        System.out.println("이메일 알림 보내기"+recipient+"님:" +message);

        Map<String,Object> result = new HashMap<>();
        result.put("status","성공");
        result.put("timestamp",System.currentTimeMillis());
        return result;
    }
}
