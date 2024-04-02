package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TurmaTest {

    private Turma turma;
    private Aluno aluno;

    @BeforeEach
    public void setUp() {
        Disciplina disciplina = new Disciplina(1, "Matemática");
        Professor professor = new Professor(101, "João");
        turma = new Turma(1, disciplina, professor);
        aluno = new Aluno(1001, "Maria");
    }

    @Test
    public void testAddAluno() {
        assertEquals("Aluno Adicionado", turma.addAluno(aluno));
    }

    @Test
    public void testGerarPauta() {
        turma.addAluno(aluno);
        String expectedPauta = "Pauta da Turma\n" +
                "Código da Turma: 1\n" +
                "Disciplina: Matemática\n" +
                "Professor: João\n" +
                "Lista de alunos Inscritos:\n" +
                "Maria\n";
        assertEquals(expectedPauta, turma.gerarPauta());
    }
}
