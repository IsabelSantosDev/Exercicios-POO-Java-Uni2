package exercicios_unidade2;

class ContaBancaria2 {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria2(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void aplicarJuros() {
        System.out.println("A conta padrão não possui juros.");
    }

    public void imprimirSaldo() {
        System.out.println("Conta: " + numeroConta + " | Saldo: R$" + saldo);
    }
}

class ContaCorrente2 extends ContaBancaria2 {
    public ContaCorrente2(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void aplicarJuros() {
        double juros = saldo * 0.15;
        saldo += juros;
        System.out.println("Juros de 15% aplicados. Saldo atual: R$" + saldo);
    }
}

class ContaPoupanca2 extends ContaBancaria2 {
    public ContaPoupanca2(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void aplicarJuros() {
        double juros = saldo * 0.065;
        saldo += juros;
        System.out.println("Juros de 6.5% aplicados. Saldo atual: R$" + saldo);
    }
}

public class JurosContaBancaria {
    public static void main(String[] args) {
        ContaCorrente2 cc = new ContaCorrente2("1111-1", 1000);
        ContaPoupanca2 cp = new ContaPoupanca2("2222-2", 2000);

        cc.imprimirSaldo();
        cc.aplicarJuros();

        System.out.println();

        cp.imprimirSaldo();
        cp.aplicarJuros();
    }
}
