package src.java;

import src.java.entities009.Aluno;

import java.util.Scanner;

public class Ex009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Qual o nome do aluno: ");
        aluno.nome = sc.next();
        System.out.print("Entre com a primeira nota: ");
        aluno.nota1 = sc.nextInt();
        System.out.print("Entre com a segunda nota: ");
        aluno.nota2 = sc.nextInt();
        System.out.print("Entre com a terceira nota: ");
        aluno.nota3 = sc.nextInt();

        System.out.println(aluno);
        aluno.boletin();







        sc.close();



    }
}
