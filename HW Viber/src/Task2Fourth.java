public class Task2Fourth {

    public static void main(String[] args) {

        int randomlimit = 11;
        int random;
        do {
            random = (int) (Math.random() * randomlimit);
        } while (random == 0);
        int summ = 0;
        int counterNum = 0;
        float midleSum;
        System.out.println("Random sequence:");

        while (random != 0) {
            System.out.printf("%2d,", random);
            summ += random;
            counterNum++;
            random = (int) (Math.random() * randomlimit);
        }
        System.out.printf("%s middle value %.4f", "\n", (float) summ / counterNum);
    }
}


