package model;

import java.util.List;
import model.usuario.Instrutor;

public class Curso {
    private String titulo;
    private String descricao;

    private List<Matricula> matriculas;
    private List<Modulo> modulos;
    private Instrutor instrutor;

    public Curso(String titulo, String descricao, List<Matricula> matriculas, List<Modulo> modulos, Instrutor instrutor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.matriculas = matriculas;
        this.modulos = modulos;
        this.instrutor = instrutor;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
