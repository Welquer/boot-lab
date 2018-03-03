package com.first.first;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Value("${hello.world}")
    private String helloWorld;

    @Autowired
    private Environment env;

    @PostConstruct
    public void init() {
        logger.debug("hello.world = {}", helloWorld);
        logger.debug("app.config.property.env = {}", env.getProperty("app.config.hello"));
    }

}
