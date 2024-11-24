import java.util.Scanner;

public class Top22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A va B sonlarini kiriting:");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("A: " + A);
        System.out.println("B: " + B);
    }
}
