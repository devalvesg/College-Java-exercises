package Ex2;

public class Controle {

    public static void main(String[] args) {
    Radio produto = new Radio(2, 5, "The rock", 91.2f);
    System.out.println(produto.toString());
    produto.setVolume(10);
    System.out.println(produto.toString());
    produto.setBanda("Beatles");
    System.out.println(produto.toString());
    }

}
