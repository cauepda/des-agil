package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {
    private Aluno aluno;
    private static final double DELTA = 0.000001;
    private static final int id = 12345;
    private static final String nome = "Cauezao";
    private static final double cr = 4.0;
    private static final double new_cr = 1.0;

    @BeforeEach
    void setUp() {

        aluno = new Aluno(id, nome, cr);
    }
    @Test
    void constroi() {
        assertEquals(id, aluno.getId());
        assertEquals(nome, aluno.getNome());
        assertEquals(cr, aluno.getCr(), DELTA);
    }

    @Test
    void mudaCr() {
        aluno.setCr(new_cr);
        assertEquals(new_cr, aluno.getCr(), DELTA);
    }
}
