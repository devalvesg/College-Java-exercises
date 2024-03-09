package ex3;

public class TestaProduto {
    public static void main(String[] args) {

        Produto tenis = new Produto(123736, "Tenis nike azul", 52, 359.90f);
        Produto chinelo = new Produto(123736, "Chinelo nike azul", 22, 55.90f);

        tenis.mostra();
        tenis.comprar(28);
        tenis.vender(10);
        tenis.subir(40);
        tenis.descer(20);
        tenis.mostra();

    }
}
