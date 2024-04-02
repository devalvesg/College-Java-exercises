package Ex2;

public class Televisao extends Produto{

    private String canal;
    public Televisao(int numeroSerie, int volume, String canal) {
        super(numeroSerie, volume);
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String assistir(){
        return getCanal();
    }

    @Override
    public String toString() {
        return "Televisao{" +
                super.toString() +
                "canal='" + canal + '\'' +
                '}';
    }


}
