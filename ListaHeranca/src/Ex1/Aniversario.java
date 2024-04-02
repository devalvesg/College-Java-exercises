package Ex1;

public class Aniversario extends CartaoWeb{

    public Aniversario(String nome){
        super.destinatario = nome;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz aniversário " + this.destinatario);
    }
}
