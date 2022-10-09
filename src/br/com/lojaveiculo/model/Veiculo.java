/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

import java.util.HashMap;

/**
 *
 * @author Matheus
 */
public abstract class Veiculo {
    
    protected String placa;
    protected String modelo;
    protected Marca marca;
    protected int ano;
    protected double preco;
    protected String tipoCombustivel;


    public Veiculo(String placa, String modelo, Marca marca, int ano, double preco, String tipoCombustivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.tipoCombustivel = tipoCombustivel;
        
    }

    public String getPlaca() {
        return placa;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    
    
}
