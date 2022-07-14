import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        System.out.print("Enter X1 coordinate ");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.print("Enter Y1 coordinate ");
        Scanner sc2 = new Scanner(System.in);
        int y1 = sc2.nextInt();
        System.out.print("Enter X2 coordinate ");
        Scanner scanner3 = new Scanner(System.in);
        int x2 = sc.nextInt();
        System.out.print("Enter Y2 coordinate ");
        Scanner scanner4 = new Scanner(System.in);
        int y2 = sc2.nextInt();

        if (x2 > x1 && y2 > y1) {
            System.out.println("Up");
        } else if (x2 > x1 && y2 < y1) {
            System.out.println("Down");
        } else if (x2 >= x1 && y2 == y1) {
            System.out.println("Flat");
        } else if (x2 < x1) {
            System.out.println("Sheer");
        }
    }
}
