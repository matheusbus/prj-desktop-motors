/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Estoque {
    
    private Map<String, Veiculo> veiculos;
    
    public Estoque(){
        this.veiculos = new HashMap<>();
    }
    
    public boolean adicionaVeiculo(Veiculo v){
        try {
            this.veiculos.put(v.getPlaca(), v);
            return true;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao adicionar o veículo: " + v.toString() + " no estoque.", "Erro", 0);
            return false;
        }
    }
    
}
