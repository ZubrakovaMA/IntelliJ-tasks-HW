public class Task3_4 {
    public static void main(String[] args) {
        Task3_4 obj = new Task3_4();
        int[] arrayNumber = new int[25];
        //obj.showArray(arrayNumber);
        obj.fillArray(arrayNumber);

        System.out.println();

        obj.numbers(arrayNumber);

    }

    public void numbers(int[] array) {
        for (int i = 2; i < array.length; i++) {
            int n = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    n++;
                }
            }
            if (n < 2) {
                System.out.print(i + " - simple \n");
            }
        }
    }

    public int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

