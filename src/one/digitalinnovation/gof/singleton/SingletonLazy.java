package one.digitalinnovation.gof.singleton;

/**
 * one.digitalinnovation.gof.singleton.SingletonLazy " preguiçoso "
 *
 * @author MaDuNa
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
