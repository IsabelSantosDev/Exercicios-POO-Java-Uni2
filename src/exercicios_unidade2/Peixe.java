package exercicios_unidade2;

public class Peixe extends Animal {
    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz som de peixe!");
    }
}
