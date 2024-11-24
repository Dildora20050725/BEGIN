import java.util.Scanner;

public class Top4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aylanani diametrini kiriting:");
        double d = scanner.nextDouble();

        double L = Math.PI * d;
        System.out.println("Aylanani uzunligi: " + L);
    }
}
