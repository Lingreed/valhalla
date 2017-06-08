package com.valhalla.controller;

import com.valhalla.service.FuckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang on 2017/6/6.
 */
@RestController
public class FuckController {

    @Autowired
    private FuckService fuckService;

    @RequestMapping("/fuck")
    public String fuck(){
        return fuckService.fuck();
    }
}
