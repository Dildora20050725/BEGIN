import java.util.Scanner;

public class Top1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kvadratning tomonini kiriting:");
        double a = scanner.nextDouble();

        double P = 4 * a;
        System.out.println("Kvadratning perimetri: " + P);
    }
}
