package br.com.desafio.dio.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("mover defensivamente");
    }
    
}
