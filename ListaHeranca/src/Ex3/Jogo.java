package Ex3;

public class Jogo {
    public static void main(String[] args) {

    jogar(new Papel());

    }

    public static void jogar(Coisa jogada){
        int min = (int) Math.ceil(1);
        int max = (int) Math.floor(4);
        int jogadaComp = (int) Math.floor(Math.random() * (max - min) + min);

        switch (jogadaComp){
            case 1: jogada.compara(new Pedra());
            break;
            case 2: jogada.compara(new Papel());
            break;
            case 3: jogada.compara(new Tesoura());
            break;
            default:
                System.out.println("Jogada inválida");
        }
    }
}
