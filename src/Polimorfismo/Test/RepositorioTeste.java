package Polimorfismo.Test;

import Polimorfismo.repositorio.Repositorio;
import Polimorfismo.servico.RepositorioArquivo;
import Polimorfismo.servico.RepositorioBancoDedados;
import Polimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
