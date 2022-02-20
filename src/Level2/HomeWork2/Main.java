package Level2.HomeWork2;

public class Main {
    static int SIZE = 4;

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "d7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            System.out.println(sum(arr));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getCol());
            System.out.println(arr[e.getRow()][e.getCol()]);
        }
        System.out.println("end");
    }
    static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != SIZE) {
            throw new MyArraySizeException();
    }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }

            }

        }
        return sum;

        }
//        static boolean isNumber(String s) {
//            return s.matches("^[-+]?[0-9]+");
//        }
}
