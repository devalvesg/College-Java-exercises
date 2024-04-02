package Ex1;

public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String nome){
        super.destinatario = nome;
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos namorados " + this.destinatario);
    }
}
