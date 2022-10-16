/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

/**
 *
 * @author Matheus
 */
public abstract class Veiculo  {

    protected String placa;
    protected String modelo;
    protected Marca marca;
    protected String chassi;
    protected String cor;
    protected String tipoCarroceria;
    protected int ano;
    protected double preco;
    protected String tipoCombustivel;

    public Veiculo(String placa, String modelo, Marca marca, String chassi, String cor, String tipoCarroceria, int ano, double preco, String tipoCombustivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.chassi = chassi;
        this.cor = cor;
        this.tipoCarroceria = tipoCarroceria;
        this.ano = ano;
        this.preco = preco;
        this.tipoCombustivel = tipoCombustivel;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    
    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
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

    public Object[] obterDados() {
        return new Object[]{this.placa, this.modelo, this.marca.getNome(), this.chassi, this.cor, this.tipoCarroceria, this.ano, this.preco, this.tipoCombustivel};
    }

    public Marca getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Veiculo: " + "\n"
                + "Placa: " + this.placa + "\n"
                + "Modelo: " + this.modelo + "\n"
                + "Marca: " + this.marca.getNome() + "\n"
                + "Chassi: " + this.chassi + "\n"
                + "Cor: " + this.cor + "\n"
                + "Tipo: " + this.tipoCarroceria + "\n"
                + "Ano: " + this.ano + "\n"
                + "Preço: R$" + this.preco + "\n"
                + "Combustível: " + this.tipoCombustivel + "\n";
    }
}
 