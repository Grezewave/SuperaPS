import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double amount = Double.parseDouble(input.nextLine());
        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.5, 0.25, 0.1, 0.05, 0.01};
        
        System.out.println("NOTAS:");
        for (int note : notes) {
            int count = (int) (amount / note);
            System.out.println(count + " nota(s) de R$ " + note + ".00");
            amount %= note;
        }
        
        System.out.println("MOEDAS:");
        for (double coin : coins) {
            int count = (int) (amount / coin);
            System.out.println(count + " moeda(s) de R$ " + String.format("%.2f", coin).replace(",", "."));
            amount %= coin;
        }
        
        input.close();
    }
}
