package com.eden.kitfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showIndex(Model model) {
        //This displays
        model.addAttribute("menuoption", "home");
        return "index";
    }

    @RequestMapping("/firstlink")
    public String showFirstLink(Model model)
    {

        model.addAttribute("menuoption","firstlink");
        return "firstlink";
    }

    @RequestMapping("/kitfo")
    public String showKitfo(Model model) {
        model.addAttribute("menuoption", "KITFO");
        return "kitfo";
    }



}
