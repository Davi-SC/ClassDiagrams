package model;

import java.util.List;

public class Modulo {
    private String titulo;
    private int ordem;

    private Curso curso;
    private List<Aula> aulas;

    public Modulo(String titulo, int ordem, Curso curso, List<Aula> aulas) {
        this.titulo = titulo;
        this.ordem = ordem;
        this.curso = curso;
        this.aulas = aulas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
}
