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
    
    private double Salario;
    private Date dataAdmissao;

    public Funcionario(double Salario, Date dataAdmissao, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.Salario = Salario;
        this.dataAdmissao = new Date();
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
 
    
    
    
}

