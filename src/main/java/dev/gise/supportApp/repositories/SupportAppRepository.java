package dev.gise.supportApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gise.supportApp.SupportAppApplication;

public interface SupportAppRepository extends JpaRepository<SupportAppApplication, Long>{
    
}
