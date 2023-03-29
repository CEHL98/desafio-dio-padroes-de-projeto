package br.com.desafio.dio.strategy;

public class ComportamentoNomal implements Comportamento {

    @Override
    public void mover() {
       System.out.println("mover normalmente");
    }

    
}
