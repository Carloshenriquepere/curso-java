package src.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {


        //ARRAY PARA GUARDAR A LISTA DE NOMES
        Random random = new Random();
        String[] nomes = { };
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de Opcões:");
            System.out.println("1 - Adicionar:");
            if(nomes.length >= 1){System.out.println("2 - Listar:");}
            if(nomes.length >= 2){System.out.println("3 - Sortear:");}
            System.out.println("4 - Sair:");

            //OPÇÃO SELECIONADA PELO USUARIO
            System.out.println("Digite a opçao desejada: ");
            opcao = sc.nextInt();

            //VALIDAÇÃO DAS OPÇÕES
            switch (opcao){
                case 1:
                    System.out.println("Adicionar quantas pessoas iram participar do sorteio:");
                    int quantidade = sc.nextInt();

                    nomes = new String[quantidade];

                    for (int i = 0; i < quantidade; i++) {
                        System.out.println("Digite o nome " + (i+1) + "º:");
                        nomes[i] = sc.next();
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    if(nomes.length >= 1){
                        System.out.println("Nomes na lista:\n");
                        for (String nome : nomes) {
                        System.out.println(" - " + nome);
                        }
                    }else {
                        System.out.println("Não a nomes suficientes para lista:");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    if (nomes.length >= 2){
                        int indiceSorteado = random.nextInt(nomes.length);

                        String nomeSorteado = nomes[indiceSorteado];

                        System.out.println("Nome Sorteado: " + nomeSorteado);


                        String[] novosNomes = new String[nomes.length - 1];

                        int contador = 0;
                        for (int i = 0; i < nomes.length; i++) {
                            if (i != indiceSorteado) {
                                novosNomes[contador] = nomes[i];
                                contador++;
                            }
                        }

                        nomes = novosNomes;
                    }else {
                        System.out.println("Não á nomes suficientes para sorteio:");
                    }
                    break;

            }

        } while (opcao != 4);
    }
}
