import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int z = sc.nextInt();

            if (z % 3 == 0 && z % 5 == 0) {
                System.out.println("Good Number");
            } else if (z % 3 == 0) {
                System.out.println("Bad Number");
            } else if (z % 5 == 0) {
                System.out.println("Poor Number");
            } else {
                System.out.println("-1");
            }
        }
    }
}