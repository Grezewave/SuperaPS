import java.util.*;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int count = countPairsWithDiffK(arr, k);
        System.out.println(count);

        input.close();
    }

    public static int countPairsWithDiffK(int[] arr, int k) {
        int count = 0;
        Set<Integer> numSet = new HashSet<>();

        for (int num : arr) {
            // Possibilidade k = num - target e k = target - num
            int target1 = num + k;
            int target2 = num - k;

            // Fazer dessa forma evita pares duplicados
            if (numSet.contains(target1)) {
                count++;
            }
            if (numSet.contains(target2) && k != 0) {
                count++;
            }

            numSet.add(num);
        }

        return count;
    }
}
