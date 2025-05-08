package com.xrp.aiagent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class LangChainAiInvoke {
    @Resource
    private  TestApiKey testApiKey;
    public  void test() {
        QwenChatModel qwenChatModel = QwenChatModel.builder()
                .apiKey(testApiKey.getApiKey())
                .modelName("qwen-max")
                .build();
        String answer = qwenChatModel.chat("你是谁");
        System.out.println(answer);

    }
}
