package Ex1;

public class Teste {
    public static void main(String[] args){

        Cliente fulano = new Cliente("123456-8", "1234-5", "Gabriel Alves", 1200f);
        fulano.realizarDeposito(2000f);
        fulano.exibirDados();
        fulano.realizarSaque(1000f);
        fulano.exibirDados();

        //Vai dar erro por conta de não estar utilizando o metodo Getter da classe
        //fulano.saldo
    }
}
