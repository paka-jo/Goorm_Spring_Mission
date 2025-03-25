package com.paka;

public class Main {
    public static void main(String[] args) {
        AlarmService emailAlarmService = new EmailAlarmService();
        UserService userService1 = new UserService(emailAlarmService);
        userService1.sendWelcomeAlarm("paka01@gmail.com");
    }
}
