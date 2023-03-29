import br.com.desafio.dio.facade.Facade;
import br.com.desafio.dio.singleton.*;
import br.com.desafio.dio.strategy.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Singleton 

        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println(eager);
        eager = SingletonEager.getInstacia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstacia();
        System.out.println(holder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNomal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo ();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Eduardo", "58450000");



        
    }
}
