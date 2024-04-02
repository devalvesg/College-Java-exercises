package Ex1;

public class Natal extends CartaoWeb{

    public Natal(String nome){
        super.destinatario = nome;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz natal " + this.destinatario);
    }
}
