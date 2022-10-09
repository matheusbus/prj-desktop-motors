/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class VeiculoDAO implements VeiculoRepositorio{

    private static List<Veiculo> veiculos;
    
    @Override
    public List<Veiculo> getVeiculos() {
        return VeiculoDAO.veiculos;
    }

    @Override
    public Veiculo buscarVeiculo(String placa) {
        for(Veiculo veic : veiculos){
            if(veic.getPlaca().equals(placa)){
                return veic;
            }
        }
        return null;
    }

    @Override
    public boolean adicionarVeiculo(Veiculo veic) {
        return veiculos.add(veic);
    }
    
    
    
}
