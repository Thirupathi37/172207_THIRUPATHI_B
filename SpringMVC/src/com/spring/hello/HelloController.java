package com.spring.hello;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  

@Controller  
public class HelloController
{  
@RequestMapping("/display")  
    public String display()  
    {  
        return "display";  
    }     
}  