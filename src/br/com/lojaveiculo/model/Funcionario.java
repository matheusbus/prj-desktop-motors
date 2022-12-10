/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;

import java.time.LocalDate;

/**
 *
 * @author Rafael
 */
public abstract class Funcionario extends Pessoa {

    protected double salario;
    protected LocalDate dataAdmissao;
    protected String banco;
    protected int agencia;
    protected int contaCorrente;

    public Funcionario(String nome, String cpf, long rg, String cep, String endereco, String bairro, String cidade, String estado, String telefone, String email, double salario, String banco, int agencia, int contaCorrente) {
        super(nome, cpf, rg, cep, endereco, bairro, cidade, estado, telefone, email);
        this.salario = salario;
        this.dataAdmissao = LocalDate.now();
        this.banco = banco;
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(int contaCorrente) {
        this.contaCorrente = contaCorrente;
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
    public String toString() {
        return super.toString()
                + "Salário: R$" + this.salario + "\n"
                + "Admissão: " + this.dataAdmissao + "\n"
                + "Banco: " + this.banco + "\n"
                + "Agência: " + this.agencia + "\n"
                + "Conta Corrente: " + this.contaCorrente + "\n";
    }

    @Override
    public Object[] obterDados() {
        return new Object[]{super.nome, super.cpf, super.rg, super.cep, super.endereco, super.bairro, super.cidade, super.estado, super.telefone, super.email, this.salario, this.dataAdmissao, this.banco, this.agencia, this.contaCorrente};
    }

}
