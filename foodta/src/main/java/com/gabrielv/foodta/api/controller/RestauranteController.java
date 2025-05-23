package com.gabrielv.foodta.api.controller;

import com.gabrielv.foodta.domain.model.Restaurante;
import com.gabrielv.foodta.domain.repository.RestauranteRepository;
import com.gabrielv.foodta.domain.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {
    @Autowired
    private RestauranteRepository restauranteRepository;
    @Autowired
    private RestauranteService restauranteService;

    @GetMapping
    public List<Restaurante> listar() { return restauranteRepository.listar(); }

    @GetMapping("/{restauranteId}")
    public ResponseEntity<Restaurante> buscar(@PathVariable Long restauranteId) {
        Restaurante restaurante = restauranteRepository.buscar(restauranteId);

        if (restaurante != null){
            return ResponseEntity.ok(restaurante);
        }
        return ResponseEntity.notFound().build();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurante adicionar(@RequestBody Restaurante restaurante) { return restauranteService.salvar(restaurante); }
}
