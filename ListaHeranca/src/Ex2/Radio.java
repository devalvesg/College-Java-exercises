package Ex2;

public class Radio extends Produto{

    private String banda;
    private float estacao;

    public Radio(int numeroSerie, int volume, String banda, float estacao) {
        super(numeroSerie, volume);
        setBanda(banda);
        setEstacao(estacao);
    }

    public String escutar(){
        return getBanda() + " " + getEstacao();
    }

    public void trocaEstacao(float estacao){
        setEstacao(estacao);
    }

    public void trocaBanda(String banda){
        setBanda(banda);
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public float getEstacao() {
        return estacao;
    }

    public void setEstacao(float estacao) {
        this.estacao = estacao;
    }

    @Override
    public String toString() {
        return "Radio{" +
                super.toString() +
                "banda='" + banda + '\'' +
                ", estacao=" + estacao +
                '}';
    }
}
