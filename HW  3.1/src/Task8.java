import java.util.Scanner;


public class Task8 {
    public static void main(String[] args) {

        System.out.print("Enter X ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter Y ");
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();
        int a = x%2;
        int b = y%2;

        if (a>0 && b>0){
            System.out.println("YES");
        }
        else if (a==0 && b==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
