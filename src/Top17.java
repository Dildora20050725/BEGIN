import java.util.Scanner;

public class Top17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A, B, C nuqtalarini kiriting:");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double AC = Math.abs(C - A);
        double BC = Math.abs(C - B);
        double sum = AC + BC;

        System.out.println("AC kesma uzunligi: " + AC);
        System.out.println("BC kesma uzunligi: " + BC);
        System.out.println("Kesmalarning yig‘indisi: " + sum);
    }
}
