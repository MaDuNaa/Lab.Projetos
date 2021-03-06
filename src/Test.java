import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strartegy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton:

        SingletonLazy Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);
        Lazy = SingletonLazy.getInstancia();
        System.out.println(Lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager= SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder LazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(LazyHolder);
        LazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(LazyHolder);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //facade

        Facade facade = new Facade();
        facade.migrarCliente("Matheus" , "18300800");



    }
}
