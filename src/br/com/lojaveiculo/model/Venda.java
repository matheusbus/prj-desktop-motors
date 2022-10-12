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

public class Venda {
    
    private int idVenda;
    private LocalDate dataVenda;
    private Veiculo veiculo;
    private Pessoa cliente;
    private Pessoa vendedor;
    private static int GeradorID;

    public Venda(Veiculo veiculo, Pessoa cliente, Pessoa vendedor) {
        idVenda = GeradorID ++;
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
     
}
