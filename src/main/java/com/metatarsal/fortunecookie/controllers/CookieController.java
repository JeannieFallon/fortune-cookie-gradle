package com.metatarsal.fortunecookie.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "cookie")
public class CookieController {

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Fortune Cookie");
        model.addAttribute("testCookie", "You will find what you seek in an unexpected place.");

        return "cookie/index";

    }

}
