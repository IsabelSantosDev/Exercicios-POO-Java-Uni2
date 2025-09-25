package exercicios_unidade2;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public void aplicarJuros() {
        double juros = saldo * 0.15;
        saldo += juros;
        System.out.println("Conta Corrente: Juros aplicados R$ " + juros + " | Saldo atual: R$ " + saldo);
    }
}