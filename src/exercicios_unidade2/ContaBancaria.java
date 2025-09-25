package exercicios_unidade2;

public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito: R$ " + valor + " | Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque: R$ " + valor + " | Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void aplicarJuros() {
        // Implementado nas subclasses
    }
}
