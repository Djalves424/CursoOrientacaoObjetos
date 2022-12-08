package Interfaces.dominio;

public class DatabseLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
