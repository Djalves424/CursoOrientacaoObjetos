package String.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        contatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para string " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        contatStringBuider(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para stringBuider " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        contatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");
    }
    private static void contatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
    private static void contatStringBuider(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    private static void contatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
