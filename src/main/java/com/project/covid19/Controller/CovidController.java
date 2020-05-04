package com.project.covid19.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.project.covid19.Entity.Covid19;
import com.project.covid19.Service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CovidController {
    @Autowired
    private CovidService covidService;


   @GetMapping("/")
    public String callApi(Model model) throws JsonProcessingException {
        Covid19 covid19 = covidService.getDailyDataCovid();
        model.addAttribute("covid19",covid19);
     return "index";
   }

}





