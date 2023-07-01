package projectException;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(String[][] ar, int i, int j) {
        super("в ячейке "+(i+1)+" строка и "+(j+1)+" столбец значение: "+ar[i][j]);
    }
}
