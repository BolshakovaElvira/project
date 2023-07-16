package projectThread;

public class MyThread extends Thread {
    private float[] arr;

    MyThread(float[] arr) {
        this.arr = arr;
    }

    float[] get() {
        return arr;
    }

    @Override
    public void run() {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

}
