package exercicios_unidade2;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public void aplicarJuros() {
        double juros = saldo * 0.065;
        saldo += juros;
        System.out.println("Conta Poupança: Juros aplicados R$ " + juros + " | Saldo atual: R$ " + saldo);
    }
}