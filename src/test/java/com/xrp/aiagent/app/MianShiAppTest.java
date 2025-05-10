package com.xrp.aiagent.app;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MianShiAppTest {

    @Resource
    private MianShiApp mianShiApp;


    @Test
    void testChat(){
        String id = UUID.randomUUID().toString();
        //第一轮
        String msg = "你好，我是404 not found";
        String answer = mianShiApp.doChat(msg,id );
        //第二轮
        msg = "我的学校是集美大学";
        answer = mianShiApp.doChat(msg,id );
        //第三轮
        msg = "我的学校是什么来着，刚才和你说过，帮我回忆一下";
        answer = mianShiApp.doChat(msg,id );

    }
}