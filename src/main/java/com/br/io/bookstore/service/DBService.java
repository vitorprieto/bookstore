package com.br.io.bookstore.service;

import com.br.io.bookstore.Repositories.CategoriaRepository;
import com.br.io.bookstore.Repositories.LivroRepository;
import com.br.io.bookstore.domain.Categoria;
import com.br.io.bookstore.domain.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public DBService(CategoriaRepository categoriaRepository, LivroRepository livroRepository) {
        this.categoriaRepository = categoriaRepository;
        this.livroRepository = livroRepository;
    }

    public void instanciaBaseDeDados() {
        Categoria categoria = new Categoria(null, "informatica", "livro de TI");

        Livro livro = new Livro(null, "clean code", "Robert Martin", "Loren Ipsum", categoria);

        categoria.getLivros().addAll(Arrays.asList(livro));

        this.categoriaRepository.saveAll(Arrays.asList(categoria));
        this.livroRepository.saveAll(Arrays.asList(livro));
    }
}
