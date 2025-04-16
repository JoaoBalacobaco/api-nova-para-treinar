package com.gabrielv.foodta.domain.service;

import com.gabrielv.foodta.domain.model.Cidade;
import com.gabrielv.foodta.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade salvar(Cidade cidade) { return cidadeRepository.salvar(cidade); }
}
