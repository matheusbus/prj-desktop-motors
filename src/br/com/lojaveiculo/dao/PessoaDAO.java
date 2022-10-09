/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Matheus
 */
public class PessoaDAO implements PessoaRepositorio{

    private static Set<Pessoa> pessoas;
    
    public PessoaDAO(){
        if(PessoaDAO.pessoas == null){
            pessoas = new ArrayList<>();
        }
    }
    
    @Override
    public List<Pessoa> getPessoas() {
        return PessoaDAO.pessoas;
    }

    @Override
    public void adicionarPessoa(Pessoa p) {
        PessoaDAO.pessoas.add(p);
    }

    @Override
    public Pessoa buscarPessoaPorNome(String nome) {
        for(Pessoa p : pessoas){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Pessoa buscarPessoaPorCPF(String cpf) {
        for(Pessoa p : pessoas){
            if(p.getCpf().equals(cpf)){
                return p;
            }
        }
        return null;
    }
    
    
}
