package com.vss.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Owners controller added.
 */
@Controller
@RequestMapping("/owners")
public class OwnersController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}


