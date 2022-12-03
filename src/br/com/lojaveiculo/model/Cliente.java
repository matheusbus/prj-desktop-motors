/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

import br.com.lojaveiculo.excecoes.PessoaException;

/**
 *
 * @author Rafael
 */
public class Cliente extends Pessoa {

    private String cnh;
    private String categoriaCnh;
    private String whatsapp;

    public Cliente(String nome, String cpf, long rg, String cnh, String categoriaCnh, String cep, String endereco, String bairro, String cidade, String estado, String telefone, String email, String whatsapp) {
        super(nome, cpf, rg, cep, endereco, bairro, cidade, estado, telefone, email);
        this.cnh = cnh;
        this.categoriaCnh = categoriaCnh;
        this.whatsapp = whatsapp;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n"
                + "CPF: " + this.cpf + "\n"
                + "CNH: " + this.cnh + "\n"
                + "Cat. CNH: " + this.categoriaCnh + "\n"
                + "Telefone: " + this.telefone + "\n"
                + "RG: " + this.rg + "\n"
                + "Cep: " + this.cep + "\n"
                + "Endereço: " + this.endereco + "\n"
                + "Bairro: " + this.bairro + "\n"
                + "Cidade: " + this.cidade + ", " + this.estado + "\n"
                + "E-mail: " + this.email + "\n"
                + "Whasapp: " + this.whatsapp + "\n";
    }

    @Override
    public Object[] obterDados() {
        return new Object[]{this.nome, this.cpf, this.rg, this.cnh, this.categoriaCnh, this.cep, this.endereco, this.bairro, this.cidade, this.estado, this.telefone, this.email, this.whatsapp};
    }
}
