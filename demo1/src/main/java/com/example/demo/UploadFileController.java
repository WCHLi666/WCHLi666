package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UploadFileController {
    @RequestMapping("/hello")
    @ResponseBody
    public String HelloWorld(){
        return "hello world!";
    }
}
