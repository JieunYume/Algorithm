import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int result = 0;

        result += (price / 5);
        price %= 5;

        if (price % 2 != 0 && result > 0) {
            result -= 1;
            price += 5;
        }
        result += (price / 2);
        price %= 2;
        if (price != 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(result);
    }
}