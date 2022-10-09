/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public abstract class Funcionario extends Pessoa {
    
    private double salario;
    private Date dataAdmissao;

    public Funcionario(double salario, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.salario = salario;
        this.dataAdmissao = new Date();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario) {
        this.salario = Salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public Object[] obterDados() {
         return new Object[] {super.nome, super.cpf, super.telefone, this.salario, this.dataAdmissao};
    }
 
    
    
    
}

