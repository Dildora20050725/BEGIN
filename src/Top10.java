import java.util.Scanner;

public class Top10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nolga teng bo‘lmagan ikkita sonni kiriting (a va b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        double product = a * b;
        double squareA = a * a;
        double squareB = b * b;

        System.out.println("Yig‘indi: " + sum);
        System.out.println("Ko‘paytma: " + product);
        System.out.println("a ning kvadrati: " + squareA);
        System.out.println("b ning kvadrati: " + squareB);
    }
}
