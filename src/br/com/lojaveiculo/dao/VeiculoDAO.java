/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Matheus
 */
public class VeiculoDAO implements VeiculoRepositorio {

    private static Map<String, Veiculo> veiculos;

    public VeiculoDAO() {
        if (veiculos == null) {
            this.veiculos = new HashMap<>();
        }
    }

    @Override
    public boolean addVeiculo(Veiculo vei) {
        veiculos.put(vei.getPlaca(), vei);
        return true;
    }

    @Override
    public boolean removeVeiculo(String placa) {
        // Tirar dúvida com professor - retorno boolean para confirmação.
        for (Map.Entry<String, Veiculo> entry : veiculos.entrySet()) {
            String key = entry.getKey();
            if (key.equals(placa)) {
                veiculos.remove(key);
                return true;
            }
        }
        return false;
    }

    @Override
    public Map<String, Veiculo> getVeiculos() {
        return this.veiculos;
    }

    @Override
    public String listarTodos() {
        String texto = "";
        for (Map.Entry<String, Veiculo> entry : veiculos.entrySet()) {
            texto += entry.getValue().toString() + "\n";
        }
        return texto;
    }

    @Override
    public String listarPorPreco(double preco) {
        for (Map.Entry<String, Veiculo> entry : veiculos.entrySet()) {
            if (entry.getValue().getPreco() == preco) {
                return entry.getValue().toString();
            }
        }
        return null;
    }

    @Override
    public String listarPorModelo(String modelo) {
        for (Map.Entry<String, Veiculo> entry : veiculos.entrySet()) {
            if (entry.getValue().getModelo().equalsIgnoreCase(modelo)) {
                return entry.getValue().toString();
            }
        }
        return null;
    }

    @Override
    public boolean verificaPlacaExistente(String placa) {
        for (Map.Entry<String, Veiculo> entry : veiculos.entrySet()) {
            if (entry.getValue().getPlaca().equalsIgnoreCase(placa)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Map<String, Veiculo> ordenaPreço() {
        Map<String, Veiculo> veiculosOrdenados = new HashMap<>();
        return veiculosOrdenados;
    }

    @Override
    public Veiculo buscarVeiculo(String placa) {
        return veiculos.get(placa);
    }

    @Override
    public Map<String, Moto> getMotos() {
        Map<String, Moto> motos = new HashMap();
        for (Map.Entry<String, Veiculo> entry : veiculos.entrySet()) {
            if (entry.getValue() instanceof Moto moto) {
                motos.put(entry.getKey(), (Moto) entry.getValue());
            }

        }
        return motos;
    }

    @Override
    public Map<String, Carro> getCarros() {
          Map<String, Carro> carros = new HashMap();
        for (Map.Entry<String, Veiculo> entry : veiculos.entrySet()) {
            if (entry.getValue() instanceof Carro carro) {
                carros.put(entry.getKey(), (Carro) entry.getValue());
            }

        }
        return carros; 
    }

}
