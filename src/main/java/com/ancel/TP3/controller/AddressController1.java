package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Projet.Tp3.model.Address;
import com.example.Projet.Tp3.model.AddressRepository;


import org.springframework.ui.Model;


@controller
public class AddressController1 {
    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/addresse")
    public String showAdresse(Model model){
        model.addAttribute("addresse",new Address());
        return "addresse";
    }
}
