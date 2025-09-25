package exercicios_unidade2;

public class Mamifero extends Animal {
    public Mamifero(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz som de mamífero!");
    }
}
