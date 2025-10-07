package com.selat.nativeimagetest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class NativeImageTestController {

    @RequestMapping
    public String index() {
        return "Hello World!";
    }
}
