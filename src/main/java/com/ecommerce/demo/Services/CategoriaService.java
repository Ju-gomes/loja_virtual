package com.ecommerce.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.demo.Repositories.CategoriaRepository;
import com.ecommerce.demo.domain.Categoria;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Long id){
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }
    
}
