package src.java;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int entrada;

        System.out.println("Entre com um número: ");
        entrada = sc.nextInt();

        for (int i = 0; i < entrada ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }
}
