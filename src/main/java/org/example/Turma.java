package org.example;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private final int codigo;
    private List<Aluno> alunos;
    private final Disciplina disciplina;
    private Professor professor;

    public Turma(int codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>(); // Inicialização da lista de alunos
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String addAluno(Aluno aluno){
        if(alunos.size() <= 10){
            alunos.add(aluno);
            return "Aluno Adicionado";
        }
        else return "Turma Cheia";
    }

    public boolean abrirTurma(){
        return alunos.size() >= 2;
    }

    public String gerarPauta(){
        StringBuilder pauta = new StringBuilder();
        pauta.append("Pauta da Turma\n");
        pauta.append("Código da Turma: ").append(codigo).append("\n");
        pauta.append("Disciplina: ").append(disciplina.getNome()).append("\n");
        pauta.append("Professor: ").append(professor.getNome()).append("\n");
        pauta.append("Lista de alunos Inscritos:\n");
        for (Aluno aluno : alunos) {
            pauta.append(aluno.getNome()).append("\n");
        }
        return pauta.toString();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
