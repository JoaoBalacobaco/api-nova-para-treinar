package com.gabrielv.foodta.domain.repository;

import com.gabrielv.foodta.domain.model.FormaPagamento;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormaPagamentoRepository {
    List<FormaPagamento> listar();
    FormaPagamento buscar(Long id);
    FormaPagamento salvar(FormaPagamento formaPagamento);
    void remover(Long id);
}
