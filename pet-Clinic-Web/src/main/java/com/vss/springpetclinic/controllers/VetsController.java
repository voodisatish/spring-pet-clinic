package com.vss.springpetclinic.controllers;

import com.vss.springpetclinic.services.VetService;
import com.vss.springpetclinic.services.map.VetServiceMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listOfVets(Model model) {
        model.addAttribute("Vets", vetService.findAll());
        return "vets/index";
    }
}
