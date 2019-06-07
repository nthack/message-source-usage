package com.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application
 *
 * @author Jerry Sung
 * @date 2019-06-07
 */
@SpringBootApplication
public class Application {
    /**
     * lombok不是人人都有用，因此直接使用logger
     */
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Starting message source application ....");

        SpringApplication.run(Application.class, args);

        logger.info("message source application started....");
    }
}
