package br.edu.insper.desagil.aula1;

public class HelloWorld {
    public int menor(int a, int b, int c) {
        int m = a;
        if (m > b) {
            m = b;
        }
        if (m > c) {
            m = c;
        }
        return m;
    }
}
