package Formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberformatTest01 {
    public static void main(String[] args) {
        Locale lacaleDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = localeJP.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeBR);
        nfa[3] = NumberFormat.getInstance(localeIT);
        double valor = 10_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
