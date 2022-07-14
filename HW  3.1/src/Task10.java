import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        System.out.print("enter the flat number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("enter the number of flat on the floor ");
        Scanner sc2 = new Scanner(System.in);
        int m = sc2.nextInt();
        System.out.println("Entrance " + (n/(9*m)+1));
    }
}
