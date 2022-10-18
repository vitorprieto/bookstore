package com.br.io.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {

    private Integer id;
    private String nome;
    private String descricao;

    private List<Livro> livro = new ArrayList<>();

    public Categoria(){
        super();
    }

    public Categoria(Integer id, String nome, String descricao, List<Livro> livro) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.livro = livro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
