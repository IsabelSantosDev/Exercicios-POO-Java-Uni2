package exercicios_unidade2;

public class SonsAnimais {
    protected String nome;

    public SonsAnimais(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som.");
    }

    public String getDescricao() {
        return "Animal: " + nome;
    }
}
