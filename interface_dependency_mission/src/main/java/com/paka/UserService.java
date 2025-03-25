package com.paka;

import java.util.Map;

public class UserService {
    private final AlarmService alarmService;

    public UserService(AlarmService alarmService) {
        this.alarmService =alarmService;
    }

    public void sendWelcomeAlarm(String email) {
        Map<String, Object> result =
                alarmService.sendAlarm("환영합니다",email);
        System.out.println("알림이 전송되었습니다 결과:"+result);
    }
}
