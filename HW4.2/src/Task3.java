import java.util.Scanner;

public class Task3 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Fillin the number of rows ");
            System.out.print("");
            int rows = sc.nextInt() - 1;

            for (int i = -1; i < rows; i++) {
                for (int j = -rows; j <= rows; j++) {
                    if (i == rows - 1 || j == -1 - i || j == i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println(" ");

            int a, b, c, d;
            d = rows + 0;
            a = d;
            while ( a >= 0) {
                b = 1;
                while (b <= a) {
                    System.out.print(" ");
                    b++;
                }
                c = d * 2 ;
                while (c / 2 >= a) {
                    System.out.print("*");
                    --c;
                }
                System.out.println(" ");
                a--;
            }


            System.out.println(" ");
        }

    }

