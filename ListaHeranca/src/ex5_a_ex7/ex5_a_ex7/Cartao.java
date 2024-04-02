package Lista4.ex5_a_ex7;

public class Cartao {
    private int senha;
    private Conta conta;

    public Cartao(int senha, Conta conta) {
        this.setSenha(senha);
        this.setConta(conta);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void saldo(int num){
        if(num == getSenha()){
            System.out.println("Saldo: "+ conta.getSaldo());
        }
        else {
            System.out.println("Senha invalida.");
        }
    }

    public void retirar(int num, float retirada){
        if(num == getSenha() && conta.getSaldo() > retirada){
            System.out.println("Retirada realizada.");
        } else if (num != getSenha()) {
            System.out.println("Senha inválida");
        } else if (retirada > conta.getSaldo()) {
            System.out.println("Retirada maior que o saldo da conta");
        }
    }

    public void alterarSenha(int num, int newSenha){
        if(num == getSenha()){
            this.setSenha(newSenha);
            System.out.println("Senha alterada");
        }
        else{
            System.out.println("Senha antiga invalida");
        }
    }
}
