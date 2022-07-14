import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Choose the animal to see the sound\s
                Cow\s
                Cat\s
                Dog\s
                Horse\s
                Pig\s
                """);
        String word = sc.nextLine();
        System.out.println(word);

        switch (word) {
            case ("Cow") -> {
                System.out.println("Mooo");
                break;
            }
            case ("Cat") -> {
                System.out.println("Meow");
                break;
            }
            case ("Dog") -> {
                System.out.println("Woof");
                break;
            }
            case ("Horse") -> {
                System.out.println("Neigh");
                break;
            }
            case ("Pig") -> {
                System.out.println("Oink");
                break;
            }
            default ->{
                System.out.println("not correct");
                break;

            }
        }
    }

}
