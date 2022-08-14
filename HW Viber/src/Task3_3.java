public class Task3_3 {
    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("0123456789");

        System.out.println(a);
        System.out.println(a.delete(0, 4));
        System.out.println(a.insert(1, 2));
        System.out.println(a.replace(2, 7, "4"));
        System.out.println(a.append(7));

        System.out.println();

        String string = "0123456789";
        System.out.println("Task 2 - Methods append, insert, delete - at the  String class don't work now. ");
    }
}
