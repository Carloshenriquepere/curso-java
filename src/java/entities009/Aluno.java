package src.java.entities009;

public class Aluno {

    public String nome;
    public int nota1;
    public int nota2;
    public int nota3;

    public int notaFinal(){
        return  (nota1 + nota2 + nota3) / 3;

    }
    public void boletin(){
        if (notaFinal() < 60){
            System.out.println("Reprovado");
        }else {
            System.out.println("Aprovado");
        }
    }

    @Override
    public String toString() {
        return nome +
                ", Nota Final " + notaFinal() +
                "." ;
    }
}
