package ex1;

import ex1.Aluno;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestaAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(24682, "Gabriel Alves", 19, 7.2f, 8.9f);

        aluno.dadosAluno();
        if(aluno.passou()){
            System.out.println("PASSOU!!!");
        }
        else{
            System.out.println("REPROVOU!!!");
        }
    }
}