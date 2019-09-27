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

    @RequestMapping("usinggit")
    public String usingGit(){return "usinggit";}

    @RequestMapping("/repository")
    public String repoSitory(){return "repository";}

    @RequestMapping("/design")
    public String design(){return "design";}

    @RequestMapping("/structure")
    public String structure(){return "structure";}

    @RequestMapping("/core")
    public String core(){return "core";}

    @RequestMapping("firstjava")
    public String firstjava(){return "firstjava";}

    @RequestMapping("/array")
    public String array(){return "array";}

    @RequestMapping("/debug")
    public String debug(){return "debug";}

    @RequestMapping("/basicweb")
    public String basicWeb(){return "basicweb";}

    @RequestMapping("/hyperlink")
    public String hyperLink(){return "hyperlink";}


}
