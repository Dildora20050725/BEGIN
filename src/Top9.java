import java.util.Scanner;

public class Top9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ikkita manfiy bo‘lmagan sonni kiriting (a va b):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double geometricMean = Math.sqrt(a * b);
        System.out.println("O‘rta geometrik: " + geometricMean);
    }
}
