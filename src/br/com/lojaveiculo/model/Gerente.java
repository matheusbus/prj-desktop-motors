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
public class Gerente extends Funcionario implements Autenticavel{
    
        private String departamento;

    public Gerente(double Salario, Date dataAdmissao, String nome, String cpf, String telefone, String departamento) {
        super(Salario, dataAdmissao, nome, cpf, telefone);
    }

    @Override
    public boolean AutenticaVenda() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    
}