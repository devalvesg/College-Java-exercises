package ex4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio() {
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        this.nivel -= x;
    }

    public void sujar(){
        this.poluido = true;
    }

    public void limpar(){
        this.poluido = false;
    }

    public void mostra(){
        System.out.printf("\nNome: "+ this.nome + "\nNivel: " + this.nivel + "\nPoluido: " + this.poluido);

    }
}
