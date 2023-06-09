package src.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex019 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] cedulas = {5, 10, 20, 50, 100};

        System.out.print("Cédulas disponíveis: ");
        for (int i = 0; i < cedulas.length; i++) {
            System.out.print(cedulas[i]);
            if (i < cedulas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("\nDigite o valor para sague: ");
        int valorSaque = sc.nextInt();

        if (valorSaque % cedulas[0] > 0){
            System.out.println("O valor solicitado não pode ser atendido pelas cédulas disponíveis.");
        }else{

            int valorRestante = valorSaque;


            int [] cedulasSaque = new int[cedulas.length];

            Arrays.sort(cedulas, Collections.reverseOrder());

            for (int i = 0; i < cedulas.length; i++){
                 int cedula = cedulas[i];

                if (cedula > valorRestante){
                    continue;
                }

                int quantidade = (int) Math.floor((double) valorRestante / cedula);

                valorRestante -= cedula * quantidade;

                cedulasSaque[i] = quantidade;

            }

            System.out.println("Saque de R$" + valorSaque);

            for (int i = 0; i < cedulasSaque.length; i++){
                if (cedulasSaque[i] > 0){
                    System.out.println(" > " + cedulasSaque[i] + "X R$" + cedulas[i]);
                }

            }
        }
    }
}
