package com.valhalla.controller;

import com.valhalla.export.FuckServiceExport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiang on 2017/6/6.
 */
@RestController
public class FuckController {

    @Autowired
    private FuckServiceExport fuckServiceExport;

    @RequestMapping(value = "/fuck", method = RequestMethod.GET)
    public String sayfuck(){
        return fuckServiceExport.fuck();
    }

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

}


