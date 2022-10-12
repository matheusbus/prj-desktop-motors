package br.com.lojaveiculo.instancia;

import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.model.Venda;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FabricaRelatorio implements Comparator<Veiculo> {

    public List<Venda> listaOrdenada;
    
    public FabricaRelatorio() {
        
        VendaDAO vendas = new VendaDAO();
        List<Venda> listaVendas = vendas.getVenda();
        Collections.sort(listaVendas, new Comparator<Venda>(){
            @Override
            public int compare(Venda v1, Venda v2){
                return v1.getVeiculo().getModelo().compareTo(v1.getVeiculo().getModelo());
            }
    });
        listaOrdenada = listaVendas;
    }

    @Override
    public int compare(Veiculo o1, Veiculo o2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Venda> getListaOrdenada() {
        return listaOrdenada;
    }

    
}
