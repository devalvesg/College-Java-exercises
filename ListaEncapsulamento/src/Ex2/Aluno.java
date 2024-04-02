package Ex2;

public class Aluno {
    private Integer numeroAluno;

    private String nome;

    private int idade;

    private float p1;

    private float p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        setNumeroAluno(numeroAluno);
        setIdade(idade);
        setNome(nome);
        setP1(p1);
        setP2(p2);
    }

    public Aluno() {

    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(Integer numeroAluno) {
        if(numeroAluno.toString().length() != 6){
            System.out.println("O numero do aluno deve ter tamanho 6");
        }else{
            this.numeroAluno = numeroAluno;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() > 30){
            System.out.println("O nome do aluno não pode conter mais que 30 caracteres");
        }
        else{
            this.nome = nome;
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if(p1 < 0){
            System.out.println("A nota não pode ser negativa!");
        }else{
            this.p1 = p1;
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 < 0){
            System.out.println("A nota não pode ser negativa!");
        }else{
            this.p2 = p2;
        }
    }

    public void notaFinal(){
        var mediaFinal = (p1 + p2) / 2;
        System.out.println("Nota final: " + Math.round(mediaFinal));
    }

    public void dadosAluno(){
        System.out.println("\nNome: " + this.nome + "\nIdade: " + this.idade);
    }

}
