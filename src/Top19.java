import java.util.Scanner;

public class Top19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("To‘g‘ri to‘rtburchakning qarama-qarshi uchlari koordinatalarini kiriting:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double length = Math.abs(x2 - x1);
        double width = Math.abs(y2 - y1);
        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("Perimetri: " + perimeter);
        System.out.println("Yuzasi: " + area);
    }
}

