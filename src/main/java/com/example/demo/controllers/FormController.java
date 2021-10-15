package com.example.demo.controllers;

import com.example.demo.models.Form;
import com.example.demo.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
    private FormService service;

    @Autowired
    public FormController(FormService service) {
        this.service = service;
    }

    @GetMapping("/form")
    public String getFormPage(@ModelAttribute("myForm") Form form) {
        return "form";
    }

    @PostMapping("/form")
    public String sendForm(@ModelAttribute("myForm")Form userForm, Model model) {
        model.addAttribute("number", service.getEnteredNumber(userForm));
        return "success";
    }
}
