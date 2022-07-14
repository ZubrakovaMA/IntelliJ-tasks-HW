import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the year");
        a = sc.nextInt();

        int b = a % 400;
        int c = a % 100;
        int d = a % 4;
        if (d < 1 && c >= 1) {
            System.out.println("leap year, 366 days");
        } else if (b < 1) {
            System.out.println("leap year, 366 days");
        } else {
            System.out.println("common year, 365 days");
        }
    }
}

