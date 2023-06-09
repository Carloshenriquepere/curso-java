package src.java;

import java.util.Scanner;

public class Ex012 {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar?  ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < n; i++) {
            if (vet[i] < 0){
            System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}
