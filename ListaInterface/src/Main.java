public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("43565245810", "65200869-7");
        Pessoa p2 = new Pessoa("43565245850", "65200869-9");


        System.out.println(p1.tiraRG());
        System.out.println(p1.getCPF());
        p1.come();
        p1.respira();
    }
}
