/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

import java.util.Comparator;

/**
 *
 * @author Rafael
 */
public class ComparadorPreçoVenda implements Comparator<Venda> {

    @Override
    public int compare(Venda v1, Venda v2) {
          if(v1.getVeiculo().getPreco() > v2.getVeiculo().getPreco())
            return 1;
        else
            return -1;
    }
    }
   
