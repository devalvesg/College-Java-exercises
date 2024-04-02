package Lista4.ex5_a_ex7;

public class Conta {
    protected String nome;
    protected float salario;
    protected int numConta;
    protected float saldo;
    protected float limite;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if(limite <= getSalario()){
            this.limite = limite;
        }
        else{
            this.limite = 0;
            System.out.println("Limite definido em zero devido ao salario.");
        }
    }

    public Conta(String nome, float salario, int numConta, float saldo, float limite) {
        this.setNome(nome);
        this.setSaldo(saldo);
        this.setLimite(limite);
        this.setNumConta(numConta);
        this.setSalario(salario);
    }

    public void depositar(float val){
        this.setSaldo(getSaldo() + val);
    }

    public void retirar(float retirada, boolean verif){
        if(saldo > retirada){
            this.setSaldo(getSaldo() - retirada);
            verif = true;
        }
        else{
            verif = false;
        }
    }

    public void mostrarSaldo(){
        System.out.println("O saldo da conta é: " + getSaldo());
    }

}
