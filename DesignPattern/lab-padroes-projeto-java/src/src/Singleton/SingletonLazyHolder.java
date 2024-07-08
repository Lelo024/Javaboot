package src.Singleton;

public class SingletonLazyHolder {
    
    private static class InstanceLazyHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstancia() {
        return InstanceLazyHolder.instancia;
    }
}
