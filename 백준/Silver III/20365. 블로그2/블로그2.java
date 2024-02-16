import java.util.*;

public class Main {
    public static void main(String[] args) {
        long result = 0;
        // BRBRBRBRBR 10 -> 6
        // BBBRBBRB 5 3
        // BBBRRBB 2
        // RRRBBRRB R:2, B:2

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int blue = 0;
        int red = 0;

        char current = '\0';
        String colors = scanner.next();

        char before = '\0';
        for (int i = 0; i < n; i++) {
            current = colors.charAt(i);
            if (current != before) {
                if(current == 'B')
                    blue++;
                else
                    red++;
            }
            before = current;
        }

        if (blue > red) {
            result += red + 1;
        } else{
            result += blue + 1;
        }

        System.out.println(result);
    }
}