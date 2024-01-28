import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String problem = scanner.next();
        String result = "";

        if ((problem.contains("XXXX"))) {
            problem = problem.replace("XXXX", "AAAA");
        }
        if (problem.contains("XX")) {
            problem = problem.replace("XX", "BB");
        }
        if(problem.contains("X")){
            System.out.println(-1);
            return;
        }
        System.out.println(problem);
    }
}