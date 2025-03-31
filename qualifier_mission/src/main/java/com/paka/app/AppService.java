package com.paka.app;

import com.paka.common.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ServiceQualifier")
public class AppService {

    @Autowired
    @Qualifier("solve")
    private Screen screen;

    public void ScreenOpen() {screen.open();}
}
