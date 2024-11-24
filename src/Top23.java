import java.util.Scanner;

public class Top23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A, B va C sonlarini kiriting:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int temp = A;
        A = B;
        B = C;
        C = temp;

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
    }
}
