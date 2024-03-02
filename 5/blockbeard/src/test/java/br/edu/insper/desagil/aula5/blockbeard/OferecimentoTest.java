package br.edu.insper.desagil.aula5.blockbeard;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OferecimentoTest {
    private Disciplina disciplina;
    private Oferecimento oferecimento;
    private static final String codigo = "DESAGIL";
    private static final String nome = "Desenvolvimento Colaborativo Ágil";

    @BeforeEach
    void setUp() {
        disciplina = new Disciplina(codigo, nome);
        LocalDate inicio = LocalDate.of(2024, Month.FEBRUARY, 5);
        LocalDate fim = LocalDate.of(2024, Month.JUNE, 28);
        oferecimento = new Oferecimento(disciplina, inicio, fim);
    }

    @Test
    void constroi() {
        assertNotNull(disciplina);
        assertNotNull(oferecimento.getInicio());
        assertNotNull(oferecimento.getFim());
        assertEquals(0, oferecimento.numeroDeAlunos());
    }

    @Test
    void fazUmaMatricula() {
        Aluno aluno = new Aluno(1234, "Cauezao", 5.0);
        oferecimento.fazMatricula(aluno);
        assertEquals(1, oferecimento.numeroDeAlunos());
    }

    @Test
    void fazDuasMatriculas() {
        Aluno aluno_1 = new Aluno(1234, "Cauezao", 5.0);
        Aluno aluno_2 = new Aluno(4321, "Edison", 4.0);
        oferecimento.fazMatricula(aluno_1);
        oferecimento.fazMatricula(aluno_2);
        assertEquals(2, oferecimento.numeroDeAlunos());
    }


}
