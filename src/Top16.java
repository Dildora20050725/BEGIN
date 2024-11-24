import java.util.Scanner;

public class Top16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita nuqta koordinatasini kiriting (x1 va x2):");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();

        double distance = Math.abs(x2 - x1);
        System.out.println("Masofa: " + distance);
    }
}
