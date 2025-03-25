package com.paka;

import java.util.Map;

public interface AlarmService {

    Map<String,Object> sendAlarm(String message, String recipient);


}
