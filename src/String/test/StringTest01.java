package String.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Diego"; //String constant pool
        String nome2 = "Diego";
        nome = nome.concat(" Alves"); // nome += " Alves"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Diego"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
