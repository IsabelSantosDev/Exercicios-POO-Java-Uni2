package exercicios_unidade2;

public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome + " está fazendo um som!");
    }

    public String getNome() {
        return nome;
    }
}