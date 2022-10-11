/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;


import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public abstract class Funcionario extends Pessoa {
    
    protected double salario;
    protected LocalDate dataAdmissao;

    public Funcionario(double salario, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.salario = salario;
        this.dataAdmissao = LocalDate.now();             
    }
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario) {
        this.salario = Salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public Object[] obterDados() {
         return new Object[] {super.nome, super.cpf, super.telefone, this.salario, this.dataAdmissao};
 
    
    }
    
}

