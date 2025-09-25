package exercicios_unidade2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // --- Exercício 1 e 4: Veículos ---
        Carro carro = new Carro("Toyota Corolla", 2021, 4);
        Moto moto = new Moto("Honda CB500", 2022, 500);
        carro.imprimirInformacoes();
        carro.ligarArCondicionado();
        moto.imprimirInformacoes();
        moto.empinar();

        // --- Exercício 2 e 5 e 8: Animais ---
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Mamifero("Cachorro"));
        animais.add(new Ave("Canário"));
        animais.add(new Peixe("Sardinha"));

        for(Animal a : animais) {
            a.emitirSom();
        }

        // Ave voando
        ((Ave)animais.get(1)).voar();

        // --- Exercício 3 e 9: Contas Bancárias ---
        ContaCorrente cc = new ContaCorrente("1234-5", 1000);
        ContaPoupanca cp = new ContaPoupanca("9876-5", 5000);
        cc.depositar(200);
        cc.sacar(100);
        cc.aplicarJuros();
        cp.depositar(500);
        cp.sacar(1000);
        cp.aplicarJuros();

        // --- Exercício 6: Calculadora ---
        Calculadora calc = new Calculadora();
        System.out.println("Soma int: " + calc.soma(2,3));
        System.out.println("Soma double: " + calc.soma(2.5,3.7));
    }
}
