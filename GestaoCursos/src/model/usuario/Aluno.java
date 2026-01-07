package model.usuario;

import model.Matricula;
import java.util.List;

public class Aluno extends Usuario {

    private List<Matricula> matricula;

    public Aluno(String nome, String email, List<Matricula> matriculas) {
        setNome(nome);
        setEmail(email);
        setMatricula(matriculas);
    }

    @Override
    void login() {
        System.out.println("Simulando Login");
    }

    public void setMatricula(List<Matricula> matricula) {
        this.matricula = matricula;
    }

    public List<Matricula> getMatricula() {
        return matricula;
    }
}
