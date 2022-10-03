package Task1;

public class Stavka extends Oplata {

    public Stavka(double day) {
        super(day);
        double s = day + paymentOfDay;
        salaryStavka = s;
    }


    @Override
    public String toString() {
        return "Payment for " + day + " day = " + salaryStavka;
    }
}
