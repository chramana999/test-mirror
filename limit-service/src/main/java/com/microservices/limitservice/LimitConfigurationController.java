package com.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limit")
    public LimitConfiguration retrieveLimitFromConfiguration(){


     return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum() );
    }
}
