package com.gzq.example.servicefeign.fallback;

import com.gzq.example.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author guozhiqiang
 * @description
 * @created 2018-04-28 11:27.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry" + name;
    }
}
