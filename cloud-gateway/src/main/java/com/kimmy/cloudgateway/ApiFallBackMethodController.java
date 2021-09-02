package com.kimmy.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiFallBackMethodController {

    @GetMapping("packagesFallbackMethod")
    public String packagesFallbackMethod (){
        return "InternetPackages service is currently down, please try again later!";
    }

    @GetMapping("tiersFallbackMethod")
    public String tiersFallbackMethod (){
        return "Tiers service is currently down, please try again later!";
    }
}
