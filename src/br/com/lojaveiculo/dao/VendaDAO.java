/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;

/**
 *
 * @author Rafael
 */


public class VendaDAO implements VendaRepositorio {

    private static List<Venda> vendas;

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

    public void ordena(){
        Collections.sort(vendas);
    }      

}
