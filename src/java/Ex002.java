package src.java;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Integer quantidadePatinhos;

        //ENTRADA DE QUANTIDADES DE PATINHO
        System.out.print("Digite a quantidade de patinhos: \n");
        quantidadePatinhos = s.nextInt();

        //VALIDAÇÃO DE QUANTIDADE
        if(quantidadePatinhos <= 1 || quantidadePatinhos >=10){
            System.out.println("\nO número de patinhos digitado é inválido.\nÈ necessario enviar um valor maior que 1 e menor do que 10.");
        }

        //INTERA A QUANTIDADE DE PATINHOS E CONDIÇÕES DE PATINHOS
        for(int i = quantidadePatinhos; i > 0; i --){
            String mensagem = (i != 1) ? (i + " patinhos foram passear\n") : ("1 patinhos foi passear\n");
            if(mensagem != null){
                System.out.println(mensagem +
                        "Além das montanhas para brincar\n" +
                        "A mamãe gritou: Quá, quá, quá, quá,");
            }

            switch (i){
                case 2:
                    System.out.println("Mas só 1 patinho voltou de lá.\n");
                    break;
                case 1:
                    System.out.println("Mas nenhum patinho voltou de lá.\n");
                    break;
                default:
                    System.out.println("Mas só "+ (i -1) + " voltaram de lá\n");
                    break;

            }
        }

        System.out.println("A mamãe patinha foi procurar\n" +
                "Além das montanhas na beira do mar\n" +
                "A mamãe gritou: Quá, quá, quá, quá\n" +
                "E todos os "+quantidadePatinhos+" patinhos voltaram de lá\nFIM");
    }
}
