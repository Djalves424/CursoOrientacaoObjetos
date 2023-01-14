package Interfaces.Test;

import Interfaces.dominio.DatabseLoader;
import Interfaces.dominio.FileLoader;

public class DataLoaderTest02 {
    public static void main(String[] args) {
        DatabseLoader databseLoader2 = new DatabseLoader();
        FileLoader fileLoader = new FileLoader();
        databseLoader2.load();
        fileLoader.load();

        databseLoader2.remove();
        fileLoader.remove();

        databseLoader2.checkPermission();
        fileLoader.checkPermission();

    }
}
