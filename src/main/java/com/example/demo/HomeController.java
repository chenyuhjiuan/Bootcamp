package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){return "home";}

    @RequestMapping("/bootcamp")
    public String bootcamp(){return "bootcamp";}

    @RequestMapping("/author")
    public String author(){return "author";}

    @RequestMapping("/polymorphism")
    public String polymorphism(){return "polymorphism";}

    @RequestMapping("/gitsetup")
    public String gitsetUp(){return "gitsetup";}


}
