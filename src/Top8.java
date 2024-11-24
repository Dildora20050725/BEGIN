import java.util.Scanner;

public class Top8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita sonni kiriting (a va b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double average = (a + b) / 2;
        System.out.println("O‘rta arifmetik: " + average);
    }
}
