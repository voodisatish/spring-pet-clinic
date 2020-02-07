package com.vss.springpetclinic.controllers;

import com.vss.springpetclinic.services.VetService;
import com.vss.springpetclinic.services.map.VetServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listOfVets() {
        return "vets/index";
    }
}
