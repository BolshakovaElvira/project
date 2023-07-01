package projectException;

public class Runner {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] array = new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15s", "16"}};

        System.out.println(sumArray(array));
    }

    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (!(array.length == 4 && array[0].length == 4)) {
            throw new MyArraySizeException();
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    try {
                        int test = Integer.parseInt(array[i][j]);
                        sum += test;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(array, i, j);
                    }
                }
            }
        }
        return sum;
    }

}
