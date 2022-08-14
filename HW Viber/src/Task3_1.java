public class Task3_1 {
    public static void main(String[] args) {

        double pos = 1.0 / 0.0;
        double neg = - 1.0 / 0.0;

        float posit = 1.0f / 0.0f;
        float negat = - 1.0f / 0.0f;

        boolean positive = 0.0 < pos;
        boolean negative = neg < -0.0;
        boolean equals = negative == positive;


        System.out.println(neg < -0.0);
        System.out.println(-0.0 == 0.0);
        System.out.println(0.0 < posit);
        System.out.println(equals);
    }
}
