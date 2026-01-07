package model.usuario;

public class Instrutor extends Usuario {
    public Instrutor(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    @Override
    void login() {
        System.out.println("Simulando Login");
    }

    void criarConteudo(){
        System.out.println("Conteudo Criado");
    }

    void gerenciarNotas(){
        System.out.println("Notas Gerenciadas");
    }
}
