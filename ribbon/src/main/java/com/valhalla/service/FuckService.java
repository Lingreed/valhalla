package com.valhalla.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jiang on 2017/6/6.
 */
@Service
public class FuckService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String fuck(){
        return restTemplate.getForObject("http://SERVICE-FUCK/fuck/", String.class);
    }

    public String hiError() {
        return "fuck damn it, Errrrrrrrror!";
    }
}
