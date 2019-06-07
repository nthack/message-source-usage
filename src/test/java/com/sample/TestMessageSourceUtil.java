package com.sample;

import com.sample.utils.MessageSourceUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.web-application-type=reactive")
public class TestMessageSourceUtil {
    private static final Logger logger = LoggerFactory.getLogger(TestMessageSourceUtil.class);

    @Autowired
    private MessageSourceUtil messageSourceUtil;

    @Test
    public void testMessageSourceUtil(){
        logger.info(messageSourceUtil.getMessage("hello"));
    }
}
