package br.edu.insper.desagil.aula1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void teste() {
        HelloWorld hw = new HelloWorld();
        assertEquals(4, hw.menor(4, 5, 6));
    }
}