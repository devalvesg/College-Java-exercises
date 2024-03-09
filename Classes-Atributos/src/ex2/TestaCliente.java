package ex2;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(12344657, 1240, "Fulano", 1250);
        System.out.println(fulano.dadosCliete());
        fulano.realizarDeposito(250);
        System.out.println(fulano.dadosCliete());
        fulano.realizarSaque(500);
        System.out.println(fulano.dadosCliete());

        Cliente beltrano = new Cliente(12344658, 1030, "Beltrano", 500);
        System.out.println(beltrano.dadosCliete());
        beltrano.realizarDeposito(500);
        System.out.println(beltrano.dadosCliete());
        beltrano.realizarSaque(50);
        System.out.println(beltrano.dadosCliete());


    }
}
