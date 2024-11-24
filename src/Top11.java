import java.util.Scanner;

public class Top11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nolga teng bo‘lmagan ikkita sonni kiriting (a va b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double sum = a + b;
        double product = a * b;
        double absA = Math.abs(a);
        double absB = Math.abs(b);

        System.out.println("Yig‘indi: " + sum);
        System.out.println("Ko‘paytma: " + product);
        System.out.println("a ning moduli: " + absA);
        System.out.println("b ning moduli: " + absB);
    }
}
