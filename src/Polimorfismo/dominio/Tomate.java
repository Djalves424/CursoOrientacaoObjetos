package Polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);

    }

    public Tomate(java.lang.String tomate_asiático, int valor) {
        
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setDataValidade(java.lang.String s) {
    }
}
