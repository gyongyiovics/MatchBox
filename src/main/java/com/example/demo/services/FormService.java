package com.example.demo.services;

import com.example.demo.models.Form;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    public String getEnteredNumber(Form form) {
        return "Thy number: " + form.getEnteredNumber() + ".";
    }
}
