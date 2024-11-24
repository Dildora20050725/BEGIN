import java.util.Scanner;

public class Top13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aylana radiuslarini kiriting (R1 > R2):");
        double R1 = scanner.nextDouble();
        double R2 = scanner.nextDouble();

        double S1 = Math.PI * R1 * R1;
        double S2 = Math.PI * R2 * R2;
        double S3 = S1 - S2;

        System.out.println("Birinchi aylananing yuzasi: " + S1);
        System.out.println("Ikkinchi aylananing yuzasi: " + S2);
        System.out.println("Yuzalar ayirmasi: " + S3);
    }
}
