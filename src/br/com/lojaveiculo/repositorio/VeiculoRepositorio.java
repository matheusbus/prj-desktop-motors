/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.lojaveiculo.repositorio;

import br.com.lojaveiculo.model.Veiculo;
import java.util.Map;


/**
 *
 * @author Matheus
 */
public interface VeiculoRepositorio {
    
 public boolean addVeiculo(Veiculo vei);
 public boolean removeVeiculo(String placa);
 public Map<String, Veiculo> getVeiculos();
 public String  listarTodos();
 public String listarPorPreco(double preco);
 public String listarPorModelo(String modelo);
 public boolean verificaPlacaExistente(String placa);
 
    
}
