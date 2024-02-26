package br.edu.insper.desagil.aula4;

public class Matricula {
    private Aluno aluno;
    private Boolean trancada;
    public Matricula(Aluno aluno) {
        this.aluno = aluno;
        this.trancada = false;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Boolean isTrancada() {
        return trancada;
    }

    public void setTrancada(Boolean trancada) {
        this.trancada = trancada;
    }
}
