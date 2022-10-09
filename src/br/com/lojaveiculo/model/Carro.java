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
    
    public Carro(String placa, String modelo, Marca marca, int ano, double preco, String tipoCombustivel, int portas){
        super(placa, modelo, marca, ano, preco, tipoCombustivel);
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
        return super.toString() + "\nCarro{" + "portas=" + portas + '}';
    }
    
    public Object[] obterDados(){
        return new Object[] {super.placa, super.modelo, super.marca.getNome(), super.ano, super.preco, super.tipoCombustivel, this.portas};
    }
    
}
