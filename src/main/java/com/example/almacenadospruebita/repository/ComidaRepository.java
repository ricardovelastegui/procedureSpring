package com.example.almacenadospruebita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.almacenadospruebita.entity.Comida;

@Repository
public interface ComidaRepository extends JpaRepository<Comida, Long> {
    
}
