import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.print("Enter the Day ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day <= 0 || day >= 32) {
            System.err.println("Incorrect day input");
            System.exit(1);
        }
        System.out.print("Enter the Month ");
        Scanner sc2 = new Scanner(System.in);
        int month = sc2.nextInt();

        System.out.print("Enter the Year ");
        Scanner sc3 = new Scanner(System.in);
        int year = sc2.nextInt();
        int yeartype =year%12;

        if (day >= 20 && day <= 31 && month == 1) {
            System.out.println("Aquarius");
        } else if (day >=1 && day <= 18 && month == 2) {
            System.out.println("Aquarius");
        } else if (day >=19 && day <=29 && month == 2) {
            System.out.println("Pisces");
        } else if (day>=1 && day<=20 && month ==3){
            System.out.println("Pisces");
        } else if (day >=21 && day <=31 && month == 3) {
            System.out.println("Aries");
        } else if (day>=1 && day<=19 && month ==4){
            System.out.println("Aries");
        } else if (day >=20 && day <=30 && month == 4) {
            System.out.println("Taurus");
        } else if (day>=1 && day<=20 && month ==5){
            System.out.println("Taurus");
        } else if (day >=21 && day <=31 && month == 5) {
            System.out.println("Gemini");
        } else if (day>=1 && day<=21 && month ==6){
            System.out.println("Gemini");
        } else if (day >=22 && day <=30 && month == 6) {
            System.out.println("Cancer");
        } else if (day>=1 && day<=22 && month ==7){
            System.out.println("Cancer");
        } else if (day >=23 && day <=31 && month == 7) {
            System.out.println("Leo");
        } else if (day>=1 && day<=22 && month ==8){
            System.out.println("Leo");
        } else if (day >=23 && day <=31 && month == 8) {
            System.out.println("Virgo");
        } else if (day>=1 && day<=22 && month ==9){
            System.out.println("Virgo");
        } else if (day >=23 && day <=30 && month == 9) {
            System.out.println("Libra");
        } else if (day>=1 && day<=22 && month ==10){
            System.out.println("Libra");
        } else if (day >=23 && day <=31 && month == 10) {
            System.out.println("Scorpio");
        } else if (day>=1 && day<=21 && month ==11){
            System.out.println("Scorpio");
        } else if (day >=22 && day <=30 && month == 11) {
            System.out.println("Sagittarius");
        } else if (day>= 1 && day<=21 && month ==12){
            System.out.println("Sagittarius");
        } else if (day >=22 && day <=31 && month == 12) {
            System.out.println("Capricorn");
        } else if (day>=1 && day<=19 && month ==1){
            System.out.println("Capricorn");
        }
        switch (yeartype) {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Bull");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Hare");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            case 11:
                System.out.println("Sheep");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
