package Polimorfismo.Test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Televisao;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

import java.util.Comparator;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Asiático", 20);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
