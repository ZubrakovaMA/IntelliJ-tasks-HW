import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2First {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Task2First obj = new Task2First();
        obj.storage();
        System.out.println(obj.storage());
    }

    private int storage() {
        System.out.print("Fill in the word ");
        String s = sc.next();
        return s.length() * 2;
    }
}