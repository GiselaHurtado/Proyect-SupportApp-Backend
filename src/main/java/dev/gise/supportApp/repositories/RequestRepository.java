package dev.gise.supportApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.gise.supportApp.models.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
}
