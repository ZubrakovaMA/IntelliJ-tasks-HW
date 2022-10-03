package Task1;

public class Main {
    public static void main(String[] args) {
        Stavka stavka = new Stavka(5);
        Employee employer1 = new Employee("Petya", "Petrov", "Petrovich");
        System.out.println(employer1.toString() + " " + stavka.toString());
    }
}
