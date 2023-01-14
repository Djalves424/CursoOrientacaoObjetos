package String.test;

public class StringBuiderTest01 {
    public static void main(String[] args) {
        String nome = "Son Goku";
        nome.concat(" DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Son Goku");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
//        sb.delete(0,3);
        System.out.println(sb.toString());
    }
}
