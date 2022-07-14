import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int x = sc.nextInt();
        System.out.println("Enter Y");
        int y = sc.nextInt();

        if (x>0 && y>0){
            System.out.println("You are in 1 quarter");
        } else if (x>0 && y<0){
            System.out.println("You are in 4 quarter");
        } else if (x<0 && y<0){
            System.out.println("You are in 3 quarter");
        } else if (x<0 && y>0){
            System.out.println("You are in 2 quarter");
        }
    }

}
