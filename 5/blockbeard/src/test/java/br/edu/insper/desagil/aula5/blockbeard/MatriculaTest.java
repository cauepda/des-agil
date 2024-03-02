package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatriculaTest {
    private Aluno aluno;
    private Matricula matricula;
    private static final int id = 3;
    private static final String nome = "Cauezao";
    private static final double cr = 9.0;

    @BeforeEach
    void setUp() {
        aluno = new Aluno(id, nome, cr);
        matricula = new Matricula(aluno);
    }

    @Test
    void constroi(){
        assertNotNull(aluno);
        assertFalse(matricula.isTrancada());
    }

    @Test
    void mudaTrancada() {
        matricula.setTrancada(true);
        assertTrue(matricula.isTrancada());
    }
}
