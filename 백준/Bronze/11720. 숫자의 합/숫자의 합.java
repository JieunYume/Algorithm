import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String number = scanner.next();
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Character.getNumericValue(number.charAt(i));
        }

        System.out.println(result);
    }
}