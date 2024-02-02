import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> coins_value = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            coins_value.add(scanner.nextInt());
        }

        int result = 0;

        for (int i = n-1; i >= 0; i--) {
            if (coins_value.get(i) <= k) {
                result += (k / coins_value.get(i));
                k %= coins_value.get(i);
            }
        }

        System.out.println(result);
    }
}