package ClassesAbstratas.Test;

import ClassesAbstratas.dominio.Desenvolvedor;
import ClassesAbstratas.dominio.Funcionario;
import ClassesAbstratas.dominio.Gerente;

public class FuncioanrioTest01 {
    public static void main(String[] args) {

                Gerente gerente = new Gerente("Nami", 5000);
                Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);

                System.out.println(gerente);
                System.out.println(desenvolvedor);
                gerente.imprime();
                desenvolvedor.imprime();
    }

}
