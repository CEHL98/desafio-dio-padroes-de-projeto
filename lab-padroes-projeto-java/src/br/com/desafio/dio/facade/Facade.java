package br.com.desafio.dio.facade;

import br.com.desafio.dio.subsistemas.sistemaCep.CepApi;
import br.com.desafio.dio.subsistemas.sistemaCrm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
