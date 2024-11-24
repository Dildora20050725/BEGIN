import java.util.Scanner;

public class Top3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To‘g‘ri to‘rtburchakning tomonlarini kiriting (a va b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double S = a * b;
        double P = 2 * (a + b);
        System.out.println("Yuzasi: " + S);
        System.out.println("Perimetri: " + P);
    }
}
