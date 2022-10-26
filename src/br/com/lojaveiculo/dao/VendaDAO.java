package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.comparator.ComparadorPreçoVenda;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

/**
 *
 * @author Rafael
 */
public class VendaDAO implements VendaRepositorio {

    private static List<Venda> vendas = new ArrayList<>();

    public VendaDAO() {
        if (vendas == null) {
            this.vendas = new ArrayList<>();
        }
    }

    @Override
    public List<Venda> getVenda() {
        return vendas;
    }

    @Override
    public boolean adicionarVenda(Venda v) {
        if (vendas.add(v)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeVenda(int id) {
        for (Venda v : vendas) {
            if (v.getIdVenda() == id) {
                vendas.remove(v);
                return true;
            }
        }
        return false;
    }

    @Override
    public Venda buscaVenda(int id) {
        for (Venda v : vendas) {
            if (v.getIdVenda() == id) {
                return v;
            }
        }
        return null;
    }

    @Override
    public void ordenaPlaca() {
        Collections.sort(vendas);
    }

    @Override
    public void ordenaPreco() {
        Collections.sort(vendas, new ComparadorPreçoVenda());
    }
}
