/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.dao;

import br.com.lojaveiculo.model.Cliente;
import br.com.lojaveiculo.model.Funcionario;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Matheus
 */
public class PessoaDAO implements PessoaRepositorio {

    private static Set<Pessoa> pessoas;

    public PessoaDAO() {
        if (PessoaDAO.pessoas == null) {
            pessoas = new HashSet<>();
        }
    }

    @Override
    public Set<Pessoa> getPessoas() {
        return PessoaDAO.pessoas;
    }

    @Override
    public boolean adicionarPessoa(Pessoa p) {
        PessoaDAO.pessoas.add(p);
        return true;
    }

    @Override
    public Pessoa buscarPessoaPorNome(String nome) {
        for (Pessoa p : pessoas) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public Pessoa buscarPessoaPorCPF(String cpf) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean removerPessoa(String cpf) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                pessoas.remove(p);
                return true;
            }
        }
        return false;
    }

    
    // Tirar dúvida com professor - método de filtrar a lista e não de adicionar (o adicionar é na nova lista filtrada)
    @Override
    public Set<Pessoa> getClientes() {
        Set<Pessoa> clientes = new HashSet<>();
        for (Pessoa p : pessoas) {
            if (p instanceof Cliente) {
                clientes.add(p);
            }
        }
        return clientes;
    }

    @Override
    public Set<Pessoa> getFuncionarios() {
        Set<Pessoa> funcionarios = new HashSet<>();
        for (Pessoa p : pessoas) {
            if (p instanceof Funcionario) {
                funcionarios.add(p);
            }
        }
        return funcionarios;
    }

    @Override
    public void ordenaNome() {
        List<Pessoa> sortedList = new ArrayList<>(pessoas);
        Collections.sort(sortedList);
    }
}
