package projectException;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(){
        super("Массив не того размера");
    }

}
