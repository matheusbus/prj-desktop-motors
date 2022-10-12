/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.lojaveiculo.repositorio;

import br.com.lojaveiculo.model.Venda;
import java.util.List;

/**
 *
 * @author Rafael
 */
public interface VendaRepositorio {
    
    public List<Venda> getVenda();
    public boolean adicionarVenda(Venda v);
    public boolean removeVenda(int id);
    public Venda buscaVenda(int id);
    
}
