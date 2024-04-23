package com.example.almacenadospruebita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.almacenadospruebita.entity.Comida;
import com.example.almacenadospruebita.repository.ComidaRepository;
import com.example.almacenadospruebita.repository.ProcedimientoRepository;

@Service
public class ComidaService {
    
    @Autowired
    private ComidaRepository comidaRepository;

    @Autowired
    private ProcedimientoRepository procedimientoRepository;

    public void actualizarPrincipalingrediente(Long idcomida, String nuevoPrincipalingrediente ){
        procedimientoRepository.actualizarPrincipalingrediente(idcomida, nuevoPrincipalingrediente);
    }

    public Comida añadirComida(Comida comida){
        return comidaRepository.save(comida);
    }


}
