package projectThread;

import java.util.Arrays;

public class Runner {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args) {
        Arrays.fill(arr, 1);
        method1(arr);
        method2(arr);
    }

    private static void method1(float[] arr) {
        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);
    }

    private static void method2(float[] arr) {
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        MyThread t1 = new MyThread(arr1);
        MyThread t2 = new MyThread(arr2);

        t1.start();
        t2.start();

        arr1 = t1.get();
        arr2 = t2.get();

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);

        System.out.println(System.currentTimeMillis() - a);
    }
}
