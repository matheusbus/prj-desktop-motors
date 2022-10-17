/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

/**
 *
 * @author Matheus
 */

public final class Marca {
    
    private String nome;
    private int codigoMarca;
    private static int geradorCodigoMarca = 0;
    
    
    public Marca(String nome){
        this.codigoMarca = geradorCodigoMarca++;
        this.nome = nome;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Marca:" + this.nome;
    }
}
