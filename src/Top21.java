import java.util.Scanner;

public class Top21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uchburchak uchlarini kiriting (x1, y1, x2, y2, x3, y3):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double p = (a + b + c) / 2; // Yarim perimetr
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        double perimeter = a + b + c;

        System.out.println("Yuzasi: " + area);
        System.out.println("Perimetri: " + perimeter);
    }
}
