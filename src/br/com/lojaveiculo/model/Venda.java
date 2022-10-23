/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

import java.time.LocalDate;

/**
 *
 * @author Rafael
 */

public class Venda implements Comparable<Venda> {
    
    private final int idVenda;
    private final LocalDate dataVenda;
    private final Veiculo veiculo;
    private final Pessoa cliente;
    private final Pessoa vendedor;
    private static int GeradorID = 1;

    public Venda(Veiculo veiculo, Pessoa cliente, Pessoa vendedor) {
        idVenda = GeradorID++;
        this.dataVenda = LocalDate.now();      
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public Pessoa getVendedor() {
        return vendedor;
    }

    public int getIdVenda() {
        return idVenda;
    }
    
     public Object[] obterDados() {
        return new Object[]{this.idVenda, this.dataVenda, this.veiculo.getPlaca(), this.cliente.getCpf(), this.vendedor.getCpf()};
    }

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + ", dataVenda=" + dataVenda + ", veiculo=" + veiculo + ", cliente=" + cliente + ", vendedor=" + vendedor + '}';
    }
    
    @Override
    public int compareTo(Venda o) {
   //Aqui estou usando o compareTo(método da interface comparable) e usando o getNome de Pessoa para ordenar por nome (ordem alfabética).
   return cliente.getNome().compareTo(o.cliente.getNome());
}
}

