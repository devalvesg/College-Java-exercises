package Ex1;

public class Cliente {

    private String numeroConta;

    private String numeroAgencia;

    private String nome;

    private float saldo;

    public Cliente() {
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        setNumeroConta(numeroConta);
        setNumeroAgencia(numeroAgencia);
        setSaldo(saldo);
        setNome(nome);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.length() != 8 || numeroConta.charAt(6) != '-'){
            System.out.println("Numero de conta inválido");
        }
        else{
            this.numeroConta = numeroConta;
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() != 6 || !numeroAgencia.contains("-")){
            System.out.println("Numero de agencia inválido");
        }
        else{
            this.numeroAgencia = numeroAgencia;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 30){
            System.out.println("O nome não pode ultrapassar 30 caracteres");
        }
        else{
            this.nome = nome;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo < 0){
            System.out.println("O saldo da conta não pode ser negativo");
        }
        else{
            this.saldo = saldo;
        }
    }

    public void realizarSaque(float valor){
        if(getSaldo() - valor < 0){
            System.out.println("Você não possui esse valor para saque");
        }else{
        setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        }
    }
    public void realizarDeposito(float valor){
        setSaldo(this.saldo + valor);
    }

    public void exibirDados(){
        System.out.println("\nNome da conta: " + getNome() + "\nNumero da conta:" + getNumeroConta() + "\nAgencia: " + getNumeroAgencia() + "\nSaldo: " + getSaldo() + "\n");
    }
}
