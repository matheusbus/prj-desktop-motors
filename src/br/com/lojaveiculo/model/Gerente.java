/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.model;


/**
 *
 * @author Rafael
 */
public class Gerente extends Funcionario {



    public Gerente(String nome, String cpf, long rg, String cep, String endereco, String bairro, String cidade, String estado, String telefone, String email, double salario, String pisPasep, String banco, int agencia, int contaCorrente) {
        super(nome, cpf, rg, cep, endereco, bairro, cidade, estado, telefone, email, salario, pisPasep, banco, agencia, contaCorrente);

    }

    @Override
    public String toString() {
        return super.toString(); 
    }    
    
    @Override
    public Object[] obterDados() {
        return new Object[]{super.nome, super.cpf, super.rg, super.cep, super.endereco, super.bairro, super.cidade, super.estado, super.telefone, super.email, super.salario, super.dataAdmissao, super.banco, super.agencia, super.contaCorrente, this.getClass().getSimpleName()};
    }
}
