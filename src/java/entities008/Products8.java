package src.java.entities008;

public class Products8 {


    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
       return salarioBruto - taxa;
    }

    public void adicaoSalarial(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100.0;

    }



    @Override
    public String toString() {
        return nome  +
                ", $ " + String.format("%.2f",salarioLiquido());
    }
}
