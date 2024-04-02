package Ex2;

public class Produto {
    protected int numeroSerie;
    protected int volume;
    protected String valor = "nao testado";

    public Produto(int numeroSerie, int volume) {
        this.valor = aprovaProduto(Math.random());
        this.numeroSerie = numeroSerie;
        this.volume = volume;
    }

    public String aprovaProduto(Double valor){
        if(valor > 0.1){
            return "aprovado";
        }
        return "reprovado";
    }
    public boolean testaUnidade(){
        if(valor == "aprovado"){
            return true;
        }
        return false;
    }

    public void setVolume(int volume){
        this.volume += volume;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numeroSerie=" + numeroSerie +
                ", volume=" + volume +
                ", valor='" + valor + '\'' +
                '}';
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getVolume() {
        return volume;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
