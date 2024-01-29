import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> products_price = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            products_price.add(scanner.nextInt());
        }
        int result = 0;

        Collections.sort(products_price, Comparator.reverseOrder());

        for (int i = 0; i < products_price.size(); i++) {
            if ((i + 1) % 3 == 0) {
                continue;
            }
            result += products_price.get(i);
        }
        System.out.println(result);
    }
}