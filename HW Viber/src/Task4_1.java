import java.util.Random;

public class Task4_1 {
    public static void main(String[] args) {

        Random rand = new Random();
        int mass [] = new int[15];

        for (int i = 0; i <15 ; i++) {
            mass [i] = rand.nextInt(25);
            System.out.print(mass[i] + " ");
        }
    }
}
