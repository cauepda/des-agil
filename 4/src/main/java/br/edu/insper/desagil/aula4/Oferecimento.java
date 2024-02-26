package br.edu.insper.desagil.aula4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Oferecimento {
    private Disciplina disciplina;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private List<Matricula> matriculas;
    public Oferecimento(Disciplina disciplina, LocalDate data_inicio, LocalDate data_fim, Aluno aluno) {
        this.disciplina = disciplina;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.matriculas = new ArrayList<>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public LocalDate getData_fim() {
        return data_fim;
    }
    public void fazMatricula(Aluno aluno) {
        Matricula nova_matricula = new Matricula(aluno);
        matriculas.add(nova_matricula);
    }
    public int numeroDeAlunos() {
        return matriculas.size();
    }
}
