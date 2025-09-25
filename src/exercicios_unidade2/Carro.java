package exercicios_unidade2;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, int ano, int portas) {
        super(modelo, ano);
        this.portas = portas;
    }

    public void ligarArCondicionado() {
        System.out.println(modelo + ": ar-condicionado ligado!");
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Carro: " + modelo + " | Ano: " + ano + " | Portas: " + portas);
    }
}

