package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
   @RequestMapping("/")
   public String index() {
         return "Hello World, This is a Message from ANANTHAN \n";
    }
    
}
