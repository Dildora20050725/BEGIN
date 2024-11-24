import java.util.Scanner;

public class Top2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kvadratning tomonini kiriting:");
        double a = scanner.nextDouble();

        double S = a * a;
        System.out.println("Kvadratning yuzasi: " + S);
    }
}
