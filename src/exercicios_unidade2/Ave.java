package exercicios_unidade2;

public class Ave extends Animal {
    public Ave(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz som de ave!");
    }
    
    public void voar() {
        System.out.println(nome + " está voando!");
        }
}