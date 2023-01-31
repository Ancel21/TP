package com.example.Projet.Tp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Projet.Tp3.model.Address;
import com.example.Projet.Tp3.model.AddressRepository;

import jakarta.validation.Valid;

import org.springframework.ui.Model;

@Controller
public class MeteoController {
    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/meteo")
    public String addAdresse(Model model){
        model.addAttribute("meteo", model);
        return "meteo";
    }
    @PostMapping("/meteo")
    public String submitddresse(@RequestParam String addrese){

        return addrese;



    }

}


