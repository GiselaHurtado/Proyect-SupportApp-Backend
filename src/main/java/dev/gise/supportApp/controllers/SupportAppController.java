package dev.gise.supportApp.controllers;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gise.supportApp.SupportAppApplication;

import dev.gise.supportApp.services.SupportAppService;

@RestController
public class SupportAppController {

    private SupportAppService services;

    public SupportAppController(SupportAppService services){
        this.services = services;
    
}

@GetMapping(path = "/supportapps")
public List<SupportAppApplication> index() {

    return services.getAll();
}

}