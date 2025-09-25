package exercicios_unidade2;

interface Autenticavel {
    boolean autenticar(String senha);
}

class Usuario implements Autenticavel {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

class Administrador implements Autenticavel {
    private String nome;
    private String senha;

    public Administrador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}

public class AutenticaçãoUsuario {
    public static void main(String[] args) {
        Autenticavel u = new Usuario("Isa", "senha123");
        Autenticavel adm = new Administrador("Admin", "admin123");

        System.out.println("Usuário autenticado? " + u.autenticar("senha123"));
        System.out.println("Administrador autenticado? " + adm.autenticar("admin123"));
        System.out.println("Tentativa incorreta usuario? " + u.autenticar("errado"));
    }
}
