package Task1;

public class Employee {
    public String name;
    public String surname;
    public String nameOfFather;

    public Employee (String name, String surname, String nameOfFather){
        this.name = name;
        this.surname = surname;
        this.nameOfFather = nameOfFather;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + " Name: " + name + " FatherName: " + nameOfFather;
    }
}
