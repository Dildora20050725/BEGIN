import java.util.Scanner;

public class Top7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doiraning radiusini kiriting:");
        double R = scanner.nextDouble();

        double L = 2 * Math.PI * R;
        double S = Math.PI * R * R;
        System.out.println("Doiraning uzunligi: " + L);
        System.out.println("Doiraning yuzasi: " + S);
    }
}
