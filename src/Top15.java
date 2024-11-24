import java.util.Scanner;

public class Top15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aylanani yuzasini kiriting (S):");
        double S = scanner.nextDouble();
        double pi = 3.14;

        double R = Math.sqrt(S / pi);
        double d = 2 * R;

        System.out.println("Radius: " + R);
        System.out.println("Diametr: " + d);
    }
}
