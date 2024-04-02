package org.example;

public class Aluno {
    private final int matricula;
    private final String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}
