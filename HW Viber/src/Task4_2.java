public class Task4_2 {
    public static void main(String[] args) {
        Task4_2 obj = new Task4_2();
        String[][] arrayMarks = new String[][]{
                {"AA", "10"},
                {"BB", "9"},
                {"CC", "8"},
                {"DD", "7"},
                {"EE", "6"},
        };
        obj.showArray(arrayMarks);
        System.out.println();

        obj.showResults(arrayMarks);
        String mark10Max = "10";
        System.out.println();

        for (int i = 0; i < arrayMarks.length; i++) {
            for (int j = 1; j < arrayMarks[i].length; j++) {
                if (arrayMarks[i][j].equals(mark10Max)) {
                    System.out.println("MaxMark " + mark10Max);
                }
            }
        }
    }

    public void showResults(String[][] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 2; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
