package com.joaoPaulo.foodta.domain.repository;

import com.joaoPaulo.foodta.domain.model.Estado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository {
    List<Estado> listar();
    Estado buscar(Long id);
    Estado salvar (Estado estado);
    void remover(Long id);
}
