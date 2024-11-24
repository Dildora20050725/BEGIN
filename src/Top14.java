import java.util.Scanner;

public class Top14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aylanani uzunligini kiriting (L):");
        double L = scanner.nextDouble();
        double pi = 3.14;

        double R = L / (2 * pi);
        double S = pi * R * R;

        System.out.println("Radius: " + R);
        System.out.println("Yuzasi: " + S);
    }
}
