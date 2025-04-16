package com.gabrielv.foodta.infrastructure.Repository;

import com.gabrielv.foodta.domain.model.Estado;
import com.gabrielv.foodta.domain.model.Restaurante;
import com.gabrielv.foodta.domain.repository.RestauranteRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository {
    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Restaurante> listar() { return manager.createQuery("from Restaurante", Restaurante.class).getResultList(); }

    @Override
    public Restaurante buscar(Long id) {
        return manager.find(Restaurante.class, id);
    }

    @Override
    @Transactional
    public Restaurante salvar(Restaurante restaurante) {
        return manager.merge(restaurante);
    }

    @Override
    @Transactional
    public void remover(Long id) {
        Restaurante restaurante = buscar(id);
        manager.remove(restaurante);
    }
}
