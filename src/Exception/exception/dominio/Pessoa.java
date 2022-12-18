package Exception.exception.dominio;

import Exception.exception.LoginInvalidoException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("Salvando pessoa");

    }
}
