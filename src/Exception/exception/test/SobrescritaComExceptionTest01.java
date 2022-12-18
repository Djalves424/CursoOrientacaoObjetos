package Exception.exception.test;

import Exception.exception.dominio.LoginInvalidoException;
import Exception.exception.dominio.Funcionario;
import Exception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
           e.printStackTrace();
        }
    }
}
