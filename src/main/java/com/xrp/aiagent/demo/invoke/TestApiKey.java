package com.xrp.aiagent.demo.invoke;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestApiKey {
    
    @Value("${aliYunAi.apiKey}")
    private String apiKey;
    
    public String getApiKey() {
        return apiKey;
    }
}