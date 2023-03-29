package br.com.desafio.dio.subsistemas.sistemaCep;

public class CepApi {
    
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Boqueirão";
    }

    public String recuperarEstado(String cep){
        return "PB";
    }
}
