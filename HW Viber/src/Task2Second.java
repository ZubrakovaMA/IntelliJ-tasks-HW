import java.util.Random;

public class  Task2Second {

    public static void main(String[] args) {

        Random rand = new Random();
        int i = rand.nextInt(2);
        System.out.println(i);

        if (i==1) {
            System.out.println ( "front");
        }
        else if (i==0) {
            System.out.println ( "backside");
        }
    }
}
