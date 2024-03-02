package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisciplinaTest {
    @Test
    void constroi() {
        Disciplina disciplina = new Disciplina("12345", "Matemática");
        assertEquals("12345", disciplina.getCodigo());
        assertEquals("Matemática", disciplina.getNome());
    }
}
