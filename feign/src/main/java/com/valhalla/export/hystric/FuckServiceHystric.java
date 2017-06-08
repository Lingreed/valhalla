package com.valhalla.export.hystric;

import com.valhalla.export.FuckServiceExport;
import org.springframework.stereotype.Component;

/**
 * Created by jiang on 2017/6/6.
 */
@Component
public class FuckServiceHystric implements FuckServiceExport {
    @Override
    public String fuck() {
        return "fucccck!not work!";
    }
}
