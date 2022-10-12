/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import java.util.ArrayList;
import java.util.Collections;
<<<<<<< HEAD
=======
import java.util.Comparator;
>>>>>>> cfc62eec89df42e12c94ac98d5e63deb230ca2ed
import java.util.List;

/**
 *
 * @author Rafael
 */
<<<<<<< HEAD
public class VendaDAO implements VendaRepositorio{
    
    private static List<Venda> vendas;
    
    
    public VendaDAO() { 
        if(vendas == null){
        this.vendas = new ArrayList<>();
    }
=======
public class VendaDAO implements VendaRepositorio, Comparator<Venda> {

    private static List<Venda> vendas;

    public VendaDAO() {
        if (vendas == null) {
            this.vendas = new ArrayList<>();
        }
>>>>>>> cfc62eec89df42e12c94ac98d5e63deb230ca2ed
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
<<<<<<< HEAD
    
    @Override
    public int compare(Venda v1, Venda v2) {
        return v1.getVeiculo().getModelo().compareTo(v2.getVeiculo().getModelo());
=======
<<<<<<< HEAD
    
    @Override
    public void ordena(){
        Collections.sort(vendas);
    }
       
=======

    Collections.sort(veiculos,(v1, v2) -> {
        return v1.getVeiculo().getMarca().getNome().compareTo
                (v2.getVeiculo().getMarca().getNome()});
                
    Collections.sort(veiculos, new Comparator<Veiculo>() {        
        @Override
        public int compare(Venda v1, Venda v2) {

        return v1.getVeiculo().getMarca().getNome().compareTo
                (v2.getVeiculo().getMarca().getNome()});
>>>>>>> 9b3ebc591dc50a7a1b822bafa524dc43a1e2070a
    }
                
    
    
    
    
>>>>>>> cfc62eec89df42e12c94ac98d5e63deb230ca2ed
}
