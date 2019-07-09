package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOfOrderFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOfOrderFacade.class);

/*
    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(userId) && target(object)")
    public void logEventVer2(Long userId, Object object){
        LOGGER.info("Class: " + object.getClass().getName() + ", Args - userId: " + userId);
    }
*/

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent(){
        LOGGER.info("Method processOrder has been called");
    }
}
