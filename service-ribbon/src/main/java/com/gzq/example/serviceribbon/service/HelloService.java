package com.gzq.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author guozhiqiang
 * @description
 * @created 2018-04-28 9:46.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
