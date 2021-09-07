package com.blitznihar.tryaop.tryaop.services;

import org.springframework.stereotype.Service;

@Service
public class LoggingService {
    
    public void log(String logstring){
        System.out.println(logstring);
    }
}
