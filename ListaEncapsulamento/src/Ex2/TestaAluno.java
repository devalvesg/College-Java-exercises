package Ex2;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(123456, "Fulano", 19, 8, 10);

        aluno.notaFinal();
        aluno.dadosAluno();

        //Vai da erro por conta dos getter e setters
        //aluno.idade;
    }


}
