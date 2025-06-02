package dev.breno.academiaAPI.repository;

import dev.breno.academiaAPI.model.clientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<clientModel, Long> { }
