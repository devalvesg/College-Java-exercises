public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{

    private String CPF;

    private String RG;

    public Pessoa() {
    }

    public Pessoa(String CPF, String RG) {
        this.CPF = CPF;
        this.RG = RG;
    }

    @Override
    public void vota() {
        System.out.println("Pessoa votou!");
    }

    @Override
    public String tiraRG() {
        return RG;
    }

    @Override
    public void pagaIR() {
        System.out.println("Imposto de renda pago!");
    }

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void trabalha() {
        System.out.println("Trabalhando");
    }

    @Override
    public void ensina() {
        System.out.println("Dando aulas!");
    }

    @Override
    public void come(){
        System.out.println("Pessoa comeu");
    }

    @Override
    public void respira(){
        System.out.println("Pessoa respirou");
    }
}
