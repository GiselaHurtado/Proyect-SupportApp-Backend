package dev.gise.supportApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import dev.gise.supportApp.models.SupportApp;

public interface SupportAppRepository extends JpaRepository<SupportApp, Long>{
    
}
