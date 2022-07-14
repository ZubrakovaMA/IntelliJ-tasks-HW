import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter A ");
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        System.out.print("Enter B ");
        Scanner sc2 = new Scanner(System.in);
        Double b = sc2.nextDouble();
        System.out.print("Enter C ");
        Scanner scanner3 = new Scanner(System.in);
        Double c = scanner3.nextDouble();
        Double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            Double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Root: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            Double x;
            x = -b / (2 * a);
            System.out.println("Have an 1 root : x = " + x);
        }
        else {
            System.out.println("No any roots");
        }

    }
}
