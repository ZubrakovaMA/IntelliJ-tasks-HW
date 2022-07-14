import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();


        switch (number){
            case ("1") : {
                System.out.println("Today is monday");
                break;
            }
            case ("2") : {
                System.out.println("Today is thursday");
                break;
            }
            case ("3") : {
                System.out.println("Today is wednesday");
                break;
            }
            case ("4") : {
                System.out.println("Today is thursday");
                break;
            }
            case ("5") : {
                System.out.println("Today is friday");
                break;
            }
            case ("6") : {
                System.out.println("saturday");
                break;
            }
            case ("7") : {
                System.out.println("Today is sunday");
                break;
            }
            default:{
                System.out.println("number isn't a week's day number");
            }
        }

    }
}
