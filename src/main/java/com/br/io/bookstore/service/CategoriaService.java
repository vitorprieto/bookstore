package com.br.io.bookstore.service;

import com.br.io.bookstore.Repositories.CategoriaRepository;
import com.br.io.bookstore.domain.Categoria;
import com.br.io.bookstore.exceptions.ObjectNotFoundExceptiom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptiom("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
