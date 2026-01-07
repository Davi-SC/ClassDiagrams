package model;

import java.util.Date;

public class Matricula {

    private Date dataInicio;
    private Float progresso;
    private Curso curso;

    public void concluirCurso(){
        System.out.println("Curso Concluido");
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Matricula(Date dataInicio, Float progresso, Curso curso) {
        this.dataInicio = dataInicio;
        this.progresso = progresso;
        this.curso = curso;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Float getProgresso() {
        return progresso;
    }

    public void setProgresso(Float progresso) {
        this.progresso = progresso;
    }
}
