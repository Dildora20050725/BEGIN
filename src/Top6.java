import java.util.Scanner;

public class Top6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parallelepiped tomonlarini kiriting (a, b, c):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double V = a * b * c;
        double S = 2 * (a * b + b * c + a * c);
        System.out.println("Hajmi: " + V);
        System.out.println("To‘la sirti: " + S);
    }
}
