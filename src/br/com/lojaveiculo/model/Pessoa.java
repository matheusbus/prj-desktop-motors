/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

/**
 *
 * @author Matheus
 */
public abstract class Pessoa implements Comparable<Pessoa>{
    
    protected String nome;
    protected String cpf;
    protected long rg;
    protected String cep;
    protected String endereco;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String telefone;
    protected String email;

    public Pessoa(String nome, String cpf, long rg, String cep, String endereco, String bairro, String cidade, String estado, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cep = cep;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }
    
    public void setRg(long rg) {
        this.rg = rg;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getRg() {
        return rg;
    }

    public String getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return  "Nome: " + this.nome + "\n" +
                "CPF: " + this.cpf + "\n" +
                "Telefone: " + this.telefone + "\n" + 
                "RG: " + this.rg + "\n" + 
                "Cep: " + this.cep + "\n" + 
                "Endereço: " + this.endereco + "\n" + 
                "Bairro: " + this.bairro + "\n" + 
                "Cidade: " + this.cidade + ", " + this.estado + "\n" + 
                "E-mail: " + this.email + "\n";
    }
    
    public Object[] obterDados(){
        return new Object[] {this.nome, this.cpf, this.rg, this.cep, this.endereco, this.bairro, this.cidade, this.estado, this.telefone, this.email};
    } 
     
    @Override
    public int compareTo(Pessoa p) {
        return nome.compareTo(getNome());
    }

}
