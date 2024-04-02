package Ex3;

public class Papel extends Coisa{
    @Override
    public void compara(Coisa c) {
        if(c.quemSouEu() == quemSouEu()){
            System.out.println("Empate");
        }
        else if(c.quemSouEu() == "Tesoura"){
            System.out.println("Perdeu");
        }
        else{
            System.out.println("Ganhou");
        }
    }

    @Override
    public String quemSouEu() {
        return "Papel";
    }
}
