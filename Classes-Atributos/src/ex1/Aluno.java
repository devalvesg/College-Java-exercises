package ex1;

public class Aluno {
    public int numeroAluno;
    public String nome;

    public int idade;
    public float p1;
    public float p2;

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Aluno(){

    }

    public float notaFinal(float p1, float p2){
        return p1 + p2 / 2;
    }
    public void dadosAluno(){
        System.out.println("O numero do aluno é: " + this.numeroAluno + "\nNome: " + this.nome + "\nIdade: " + this.idade);
    }

    public boolean passou(){
        float media = notaFinal(this.p1, this.p2);
        if(media >= 7){
            return true;
        }
        return false;
    }
}
