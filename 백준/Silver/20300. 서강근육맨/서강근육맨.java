import java.util.*;

public class Main {
    public static void main(String[] args) {
        long result = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Long> muscle_loss_values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            muscle_loss_values.add(scanner.nextLong());
        }

        Collections.sort(muscle_loss_values);

        long sum = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n/2; i++) {
                sum = muscle_loss_values.get(i) + muscle_loss_values.get(n - i - 1);
                if (sum > result) {
                    result = sum;
                }
            }
        } else{
            for (int i = 0; i < n/2; i++) {
                sum = muscle_loss_values.get(i) + muscle_loss_values.get(n - i - 2);
                if (sum > result) {
                    result = sum;
                }
            }
            if (muscle_loss_values.get(n - 1) > result) {
                result = muscle_loss_values.get(n - 1);
            }

        }

        System.out.println(result);
    }
}