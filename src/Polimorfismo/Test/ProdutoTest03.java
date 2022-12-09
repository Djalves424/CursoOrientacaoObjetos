package Polimorfismo.Test;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;
import Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);


        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(produto);



    }
}
