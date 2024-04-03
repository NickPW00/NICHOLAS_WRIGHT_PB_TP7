package org.example;

public class App {
    public static void main(String[] args) {
        Professor professor = new Professor(1, "João Silva");

        Disciplina disciplina = new Disciplina(101, "Matemática");

        Turma turma = new Turma(1, disciplina, professor);

        Aluno aluno1 = new Aluno(1001, "Maria");
        Aluno aluno2 = new Aluno(1002, "Pedro");
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);

        boolean turmaAberta = turma.abrirTurma();
        System.out.println("A turma está aberta? " + (turmaAberta ? "Sim" : "Não"));

        for (int i = 3; i <= 10; i++) {
            Aluno aluno = new Aluno(1000 + i, "Aluno " + i);
            turma.addAluno(aluno);
        }

        Aluno aluno11 = new Aluno(1011, "Novo Aluno");
        String mensagem = turma.addAluno(aluno11);
        System.out.println(mensagem);

        String pauta = turma.gerarPauta();
        System.out.println(pauta);
    }
}