package Interfaces.Test;

import Interfaces.dominio.DatabseLoader;
import Interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabseLoader databseLoader = new DatabseLoader();
        FileLoader fileLoader = new FileLoader();
        databseLoader.load();
        fileLoader.load();

        databseLoader.remove();
        fileLoader.remove();

        databseLoader.checkPermission();
        fileLoader.checkPermission();

    }
}
