package com.br.io.bookstore;

import com.br.io.bookstore.Repositories.CategoriaRepository;
import com.br.io.bookstore.Repositories.LivroRepository;
import com.br.io.bookstore.domain.Categoria;
import com.br.io.bookstore.domain.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Categoria categoria = new Categoria(null, "informatica", "livro de TI");

        Livro livro = new Livro(null, "clean code", "Robert Martin", "Loren Ipsum", categoria);

        categoria.getLivros().addAll(Arrays.asList(livro));

        this.categoriaRepository.saveAll(Arrays.asList(categoria));
        this.livroRepository.saveAll(Arrays.asList(livro));
    }
}
