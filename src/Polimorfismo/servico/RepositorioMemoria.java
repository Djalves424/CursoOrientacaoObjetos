package Polimorfismo.servico;

import Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
