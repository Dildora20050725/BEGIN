import java.util.Scanner;

public class Top12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To‘g‘ri uchburchakning katetlarini kiriting (a va b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);
        double P = a + b + c;
        System.out.println("Gipotenuza: " + c);
        System.out.println("Perimetri: " + P);
    }
}
