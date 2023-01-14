package Polimorfismo.servico;

import Polimorfismo.dominio.Computador;
import Polimorfismo.dominio.Produto;
import Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Pruduto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if(produto instanceof Tomate){
            String dataValidade = ((Tomate)produto).getDataValidade().toString();
            System.out.println(dataValidade);
        }
    }
}
