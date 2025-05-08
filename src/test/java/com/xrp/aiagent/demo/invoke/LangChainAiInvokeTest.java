package com.xrp.aiagent.demo.invoke;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class LangChainAiInvokeTest {


    @Resource
    private  LangChainAiInvoke langChainAiInvoke;


    @Test
    void test1() {
        langChainAiInvoke.test();
    }
}