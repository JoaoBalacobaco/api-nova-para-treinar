package com.gabrielv.foodta.domain.service;

import com.gabrielv.foodta.domain.model.Estado;
import com.gabrielv.foodta.domain.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public Estado salvar(Estado estado) { return estadoRepository.salvar(estado); }
}
