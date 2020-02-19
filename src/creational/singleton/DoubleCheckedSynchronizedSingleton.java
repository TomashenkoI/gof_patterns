package creational.singleton;

public class DoubleCheckedSynchronizedSingleton {

    private static volatile DoubleCheckedSynchronizedSingleton instance;

    private DoubleCheckedSynchronizedSingleton() {
    }

    public static DoubleCheckedSynchronizedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSynchronizedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
