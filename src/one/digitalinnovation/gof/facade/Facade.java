package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome , String cep ) {
        String cidade = CepApi.getInstancia().recuperarCidade(CepApi);
        String cidade = CepApi.getInstancia().recuperarCidade(CepApi);

        CrmService.gravarCliente( nome, estado, cidade, cep);

    }
}
