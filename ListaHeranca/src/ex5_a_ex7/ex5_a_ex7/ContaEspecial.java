package Lista4.ex5_a_ex7;

public class ContaEspecial extends Conta{
    public ContaEspecial(String nome, float salario, int numConta, float saldo, float limite) {
        super(nome, salario, numConta, saldo, limite);
    }

    @Override
    public float getLimite() {
        return limite;
    }

    @Override
    public void setLimite(float limite) {
        if (limite <= getSaldo() * 3) {
            this.limite = limite;
        } else {
            this.limite = 0;
            System.out.println("LImite em R$ 0,00 devido a pedido superior ao permitido");
        }
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
