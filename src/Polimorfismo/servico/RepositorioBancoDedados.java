package Polimorfismo.servico;

import Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDedados implements Repositorio {

    public void salvar() {
        System.out.println("Salvando em um banco de dados");
    }
}
