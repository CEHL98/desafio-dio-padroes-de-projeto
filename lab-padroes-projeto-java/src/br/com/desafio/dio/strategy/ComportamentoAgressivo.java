package br.com.desafio.dio.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("mover agressivamente");
    }
    
}
