package com.valhalla.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang on 2017/6/2.
 */
@RestController
public class FuckController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/fuck")
    public String sayfuck(){
        return "fuck you ! from:" + port ;
    }
}
