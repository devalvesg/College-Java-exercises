package src;

public class Main {
    public static void main(String[] args) {
        Product sabonete = new Product(10,"Sabonete", 2.50f);
        Product shampoo = new Product(11,"Shampoo", 12.50f);
        Product pasta = new Product(13,"Pasta de Dente", 5.50f);

        ShoppingCart car1 = new ShoppingCart(1, 15);
        car1.setCarItem(1, 1, sabonete);
        car1.setCarItem(2, 1, shampoo);

        ShoppingCart car2 = new ShoppingCart(2, 18);
        car2.setCarItem(1, 1, shampoo);
        car2.setCarItem(2, 1, pasta);

        System.out.println(car1);
        System.out.println(car2);

    }
}
