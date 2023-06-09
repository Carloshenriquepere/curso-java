package src.java;

import java.util.*;

public class Ex020 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        List<Character> caracteres = new ArrayList<>();

        System.out.println("Digite o tamanho da senha (entre 6 e 60):");
        int tamanho = sc.nextInt();

        if (tamanho < 6 || tamanho > 60){
            System.out.println("Tamanho inválido!");
        }else{
            System.out.print("Permitir letras do Maiúsculas? (s/n) ");
            sc.nextLine();
            String respostaMaiusculas = sc.nextLine();
            if (respostaMaiusculas.equalsIgnoreCase("s")){
                for (char c = 'A'; c <= 'Z'; c++){
                    caracteres.add(c);
                }
            }
            System.out.print("Permitir letras do Minúsculas? (s/n) ");
            String respostaMinusculas = sc.nextLine();
            if (respostaMinusculas.equalsIgnoreCase("s")){
                for (char c = 'a'; c <= 'z'; c++){
                    caracteres.add(c);
                }
            }
            System.out.print("Permitir caracteres numéricos? (s/n) ");
            String respostaNumericos = sc.nextLine();
            if (respostaNumericos.equalsIgnoreCase("s")) {
                for (char c = '0'; c <= '9'; c++) {
                    caracteres.add(c);
                }
            }
            System.out.print("Permitir caracteres especiais? (s/n) ");
            String respostaEspeciais = sc.nextLine();
            if (respostaEspeciais.equalsIgnoreCase("s")) {
                caracteres.add('!');
                caracteres.add('@');
                caracteres.add('#');
                caracteres.add('$');
                caracteres.add('%');
                caracteres.add('¨');
                caracteres.add('&');
                caracteres.add('*');
                caracteres.add('_');
            }

            List<Character> combinacaoCaracteres = new ArrayList<>(caracteres);

            if (combinacaoCaracteres.isEmpty()) {
                System.out.println("Nenhum caractere definido!\n");
                return;
            }

            Collections.shuffle(combinacaoCaracteres);

            StringBuilder senhaBuilder = new StringBuilder();
            int indiceCaractere = 0;
            for (int i = 0; i < tamanho; i++) {
                senhaBuilder.append(combinacaoCaracteres.get(indiceCaractere));
                indiceCaractere = (indiceCaractere + 1) % combinacaoCaracteres.size();
            }
            String senha = senhaBuilder.toString();

            System.out.println("Senha: " + senha);
        }
    }
}
