package br.com.desafio.dio.singleton;

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstacia() {
            return instancia;
    }
}
