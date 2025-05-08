package com.xrp.aiagent;

import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import com.xrp.aiagent.demo.invoke.HttpAiInvoke;
import com.xrp.aiagent.demo.invoke.SdkAiInvoke;
import com.xrp.aiagent.demo.invoke.TestApiKey;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class AiAgentApplicationTests {

    @Resource
    private TestApiKey testApiKey;
    @Resource
    private SdkAiInvoke sdkAiInvoke;
    @Resource
    private HttpAiInvoke httpAiInvoke;
    @Test
    void contextLoads() {
    }

    @Test
    public void test() {
        try {
            GenerationResult result = sdkAiInvoke.callWithMessage();
            System.out.println(result);
        } catch (NoApiKeyException | InputRequiredException e) {
            log.error("error : " + e.getMessage());
        }
    }
    @Test
    public void test2() {
     //   httpAiInvoke.test();
    }

}
