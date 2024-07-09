package dev.gise.supportApp.services;
import java.util.List;
import org.springframework.stereotype.Service;

import dev.gise.supportApp.SupportAppApplication;

import dev.gise.supportApp.repositories.SupportAppRepository;

@Service
public class SupportAppService {

    SupportAppRepository repository;

    public SupportAppService(SupportAppRepository repository){
        this.repository = repository;
    }

    public List<SupportAppApplication> getAll() {
        List<SupportAppApplication> supportapps = repository.findAll();
        return supportapps;
   
}
}
