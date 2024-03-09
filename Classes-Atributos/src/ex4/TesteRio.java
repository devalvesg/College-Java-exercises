package ex4;

public class TesteRio {
    public static void main(String[] args) {

        Rio tiete = new Rio();
        tiete.poluido = false;
        tiete.nome = "Tiete";
        tiete.nivel = 70;

        Rio alagoa = new Rio("Alagoa", 80, false);

        alagoa.chover(20);
        alagoa.ensolarar(20);
        alagoa.limpar();
        alagoa.mostra();
    }
}
