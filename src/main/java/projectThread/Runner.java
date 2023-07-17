package projectThread;

import java.util.Arrays;

public class Runner {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args) {
        
        method1(arr);
        method2(arr);

    }

    private static void method1(float[] arr) {
        long a = System.currentTimeMillis();
        Arrays.fill(arr, 1);
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);
    }

    public static void method2(float[] arr) {

        long a = System.currentTimeMillis();
        Arrays.fill(arr, 1);
        Runnable runnable1 = new Runnable() {
            @Override
            synchronized public void run() {
                float[] arr1 = new float[h];
                System.arraycopy(arr, 0, arr1, 0, h);
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(arr1, 0, arr, 0, h);
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            synchronized public void run() {
                float[] arr2 = new float[h];
                System.arraycopy(arr, h, arr2, 0, h);
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(arr2, 0, arr, h, h);
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();



        System.out.println(System.currentTimeMillis()-a);


    }
}
