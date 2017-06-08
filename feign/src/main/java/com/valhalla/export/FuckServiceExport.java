package com.valhalla.export;

import com.valhalla.export.hystric.FuckServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jiang on 2017/6/6.
 */
@FeignClient(value = "service-fuck", fallback = FuckServiceHystric.class)
public interface FuckServiceExport {
    @RequestMapping(value = "/fuck", method = RequestMethod.GET)
    String fuck();
}
