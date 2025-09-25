package exercicios_unidade2;

public class InfoVeiculos {
    protected String modelo;
    protected int ano;

    public InfoVeiculos(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimirInformacoes() {
        System.out.println("Modelo: " + modelo + " | Ano: " + ano);
    }
}
