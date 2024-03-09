package ex2;

public class Cliente {

    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){

    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valor){
        this.saldo += valor;
    }

    public void realizarSaque(float valor){
        this.saldo -= valor;
    }

    public String dadosCliete(){
        return "Conta: " + this.numeroConta + "\nCliente: " + this.nome + "\nSaldo: " + this.saldo + "\n";
    }

}
