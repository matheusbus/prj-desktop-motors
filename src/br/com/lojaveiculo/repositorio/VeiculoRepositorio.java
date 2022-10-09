/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.lojaveiculo.repositorio;

import br.com.lojaveiculo.model.Veiculo;
import java.util.List;

/**
 *
 * @author Matheus
 */
public interface VeiculoRepositorio {
    
    public List<Veiculo> getVeiculos();
    public Veiculo buscarVeiculo(String placa);
    public boolean adicionarVeiculo(Veiculo veic);
    
}
