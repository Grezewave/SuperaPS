
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int size = input.nextInt();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        input.close();
        
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        
        for (int num : even) {
            System.out.println(num);
        }
        
        for (int num : odd) {
            System.out.println(num);
        }
    }
}
