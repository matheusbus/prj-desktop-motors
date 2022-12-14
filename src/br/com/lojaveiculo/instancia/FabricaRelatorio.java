package br.com.lojaveiculo.instancia;

import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Venda;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FabricaRelatorio implements Comparator<Venda> {

    public List<Venda> listaOrdenada;

    public FabricaRelatorio() {

        VendaDAO vendas = new VendaDAO();
        List<Venda> listaVendas = vendas.getVenda();

        Collections.sort(listaVendas, new Comparator<Venda>() {
            @Override
            public int compare(Venda v1, Venda v2) {
                return v1.getVeiculo().getPlaca().compareTo(v2.getVeiculo().getPlaca());
            }
        });
        listaOrdenada = listaVendas;
    }

    public List<Venda> getListaOrdenada() {
        return listaOrdenada;
    }

    @Override
    public int compare(Venda v1, Venda v2) {
        return v1.getVendedor().getNome().compareTo(v2.getVendedor().getNome());
    }

}
