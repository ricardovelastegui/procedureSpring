package com.example.almacenadospruebita.repository;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedimientoRepository {

    @Procedure(name = "actualizar_principalingrediente")
    void actualizarPrincipalingrediente(@Param("p_id") Long id, @Param("p_principalingrediente") String principalingrediente);

    
    
}
