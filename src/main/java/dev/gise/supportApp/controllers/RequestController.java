package dev.gise.supportApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dev.gise.supportApp.models.Request;
import dev.gise.supportApp.services.RequestService;

@RestController
@RequestMapping("api/v1/requests")
@CrossOrigin(origins = "http://localhost:5173")
public class RequestController {

    @Autowired
    private RequestService services;

    @GetMapping
    public List<Request> listAll() {
        return services.getAllRequests();
    }

    @GetMapping("/{id}")
    public Request getRequestById(@PathVariable Long id) {
        return services.getRequestById(id);
    }

    @PostMapping
    public Request createRequest(@RequestBody Request request) {
        return services.createRequest(request);
    }

    @PutMapping("/{id}")
    public Request updateRequest(@RequestBody Request request, @PathVariable Long id) {
        request.setId(id);  
        return services.updateRequest(request);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        services.deleteRequestById(id);
    }
}
