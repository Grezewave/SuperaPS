import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha após o inteiro N
        
        for (int i = 0; i < N; i++) {
            String line = input.nextLine();
            String decoded = decodeLine(line);
            System.out.println(decoded);
        }
        
        input.close();
    }
    
    public static String decodeLine(String line) {
        int length = line.length();
        int halfLength = length / 2;
        StringBuilder sb = new StringBuilder();
        
        for (int i = halfLength - 1; i >= 0; i--) {
            sb.append(line.charAt(i));
        }
        
        for (int i = length - 1; i >= halfLength; i--) {
            sb.append(line.charAt(i));
        }
        
        return sb.toString();
    }
}
