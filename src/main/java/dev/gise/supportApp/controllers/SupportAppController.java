package dev.gise.supportApp.controllers;
import java.util.List;

// import org.springframework.http.HttpStatusCode;
// import org.springframework.http.ResponseEntity;

// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import dev.gise.supportApp.models.SupportApp;
import dev.gise.supportApp.services.SupportAppService;

@RestController
public class SupportAppController {

    private SupportAppService services;

    public SupportAppController(SupportAppService services){
        this.services = services;
    
}

@GetMapping(path = "/supportapps")
public List<SupportApp> index() {

    return services.getAll();
}

// @PostMapping(path = "/supportapps")
// public ResponseEntity<SupportApp> create(@RequestBody Request newRequest) {
//     Request request = services.store(newRequest);
//     return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(request);
}
