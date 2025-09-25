package exercicios_unidade2;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, int ano, int cilindradas) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }

    public void empinar() {
        System.out.println(modelo + " está empinando!");
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Moto: " + modelo + " | Ano: " + ano + " | Cilindradas: " + cilindradas);
    }
}
