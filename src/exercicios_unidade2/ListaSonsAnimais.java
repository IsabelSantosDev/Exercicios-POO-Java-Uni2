package exercicios_unidade2;

public class ListaSonsAnimais {
    public static void main(String[] args) {
        Animal[] lista = {
            new Mamifero("Cachorro"),
            new Ave("Galo"),
            new Peixe("Sardinha")
        };

        for (Animal a : lista) {
            a.emitirSom();
        }
    }
}
