package creational.singleton;

public class OnDemandSingleton {

    private static OnDemandSingleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    private static class SingletonHolder {
        private static final OnDemandSingleton HOLDER_INSTANCE = new OnDemandSingleton();
    }

}
