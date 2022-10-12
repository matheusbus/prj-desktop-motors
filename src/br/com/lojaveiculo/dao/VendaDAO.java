/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
<<<<<<< HEAD
=======

>>>>>>> bb9008c67d9f1093f9165c3d895def17ba4ccc9e
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

public class VendaDAO implements VendaRepositorio, Comparator<Venda> {
=======

public class VendaDAO implements VendaRepositorio {
>>>>>>> bb9008c67d9f1093f9165c3d895def17ba4ccc9e

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
<<<<<<< HEAD
    
    
    @Override
    public int compare(Venda v1, Venda v2) {
        return v1.getVeiculo().getModelo().compareTo(v2.getVeiculo().getModelo());
    
    @Override
    public void ordena(){
        Collections.sort(vendas);
    }

    
                
    
        
  
   
=======

    
   public void ordena(){
        Collections.sort(vendas);
    }      

>>>>>>> bb9008c67d9f1093f9165c3d895def17ba4ccc9e
}


