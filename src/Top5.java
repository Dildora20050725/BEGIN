import java.util.Scanner;

public class Top5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kubning tomonini kiriting:");
        double a = scanner.nextDouble();

        double V = a * a * a;
        double S = 6 * a * a;
        System.out.println("Kubning hajmi: " + V);
        System.out.println("Kubning to‘la sirti: " + S);
    }
}
