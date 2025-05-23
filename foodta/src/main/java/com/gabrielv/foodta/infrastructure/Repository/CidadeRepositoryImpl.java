package com.gabrielv.foodta.infrastructure.Repository;

import com.gabrielv.foodta.domain.model.Cidade;
import com.gabrielv.foodta.domain.model.Estado;
import com.gabrielv.foodta.domain.repository.CidadeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CidadeRepositoryImpl implements CidadeRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Cidade> listar() { return manager.createQuery("from Cidade", Cidade.class).getResultList(); }

    @Override
    public Cidade buscar(Long id) { return manager.find(Cidade.class, id); }

    @Override
    public Cidade salvar(Cidade cidade) {
        return manager.merge(cidade);
    }

    @Override
    public void remover(Long id) {
        Cidade cidade = buscar(id);
        manager.remove(cidade);
    }
}
