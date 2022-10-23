/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

/**
 *
 * @author Matheus
 */
public class Carro extends Veiculo {
    
    protected int portas;
    
    public Carro(String placa, String modelo, Marca marca, String chassi, String cor, String tipoCarroceria, int ano, double preco, String tipoCombustivel, int portas){
        super(placa, modelo, marca, chassi, cor, tipoCarroceria, ano, preco, tipoCombustivel);
        this.portas = portas;
    }
    
    
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + "Portas: " + portas;
    }
    
    /**
     *
     * @return
     */
    @Override
    public Object[] obterDados(){
        return new Object[] {super.placa, super.modelo, super.marca.getNome(), super.chassi, super.cor, super.tipoCarroceria, super.ano, super.preco, super.tipoCombustivel, this.portas};
    }
}


