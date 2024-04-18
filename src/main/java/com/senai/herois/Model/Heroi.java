package com.senai.herois.Model;

public class Heroi {

    private String nome;
    private String superpoder;
    private Integer idade;
    private String cidade;

    @Override
    public String toString() {
        return "Heroi [nome=" + nome + ", superpoder=" + superpoder + ", idade=" + idade + ", cidade=" + cidade + "]";
    }

    public Heroi(String nome, String superpoder, Integer idade, String cidade) {
        this.nome = nome;
        this.superpoder = superpoder;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}
