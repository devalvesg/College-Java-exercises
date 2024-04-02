package Lista4.ex5_a_ex7;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Yan", 7000.77f,5678,5000.76f,5000);
        Cartao ca1 = new  Cartao(123,c1);
        ca1.retirar(123,2000);
        ca1.retirar(321, 1);
        ca1.saldo(123);
        ca1.saldo(321);
        ca1.alterarSenha(321, 456);
        ca1.alterarSenha(123,456);
        
    }
}
