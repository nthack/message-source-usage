package com.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Locale;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = "spring.main.web-application-type=reactive")
public class TestMessageSource {
    private static final Logger logger = LoggerFactory.getLogger(TestMessageSource.class);

    @Autowired
    private MessageSource messageSource;

    @Test
    public void testGetMessage() {
        // 測試使用默認信息: can be null
        logger.info(messageSource.getMessage("hello", null, "", null));

        // 測試使用英文: en_US
        logger.info(messageSource.getMessage("hello", null, "", Locale.US));

        // 測試用中文: zh_CN
        logger.info(messageSource.getMessage("hello", null, "", Locale.SIMPLIFIED_CHINESE));


    }
}
