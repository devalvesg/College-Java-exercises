package Ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ArrayList<CartaoWeb> array = new ArrayList();

    array.add(new DiaDosNamorados("Gabriel"));
    array.add(new Natal("Yan"));
    array.add(new Aniversario("Gustavo"));

    array.forEach(x -> {
        x.showMessage(); //POLIMORFISMO AQUI
    });
    }

}
