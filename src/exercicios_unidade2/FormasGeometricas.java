package exercicios_unidade2;

abstract class FormaGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Aqui, para simplicidade, vamos supor triângulo equilátero
        return 3 * base;
    }
}

public class FormasGeometricas {
    public static void main(String[] args) {
        FormaGeometrica f1 = new Circulo(3);
        FormaGeometrica f2 = new Retangulo(4, 5);
        FormaGeometrica f3 = new Triangulo(3, 4);

        System.out.println("Área círculo: " + f1.calcularArea());
        System.out.println("Perímetro círculo: " + f1.calcularPerimetro());

        System.out.println("Área retângulo: " + f2.calcularArea());
        System.out.println("Perímetro retângulo: " + f2.calcularPerimetro());

        System.out.println("Área triângulo: " + f3.calcularArea());
        System.out.println("Perímetro triângulo: " + f3.calcularPerimetro());
    }
}
