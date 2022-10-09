/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.lojaveiculo.repositorio;

import br.com.lojaveiculo.model.Pessoa;
import java.util.Set;

/**
 *
 * @author Matheus
 */
public interface PessoaRepositorio {
    
    public Set<Pessoa> getPessoas();
    public boolean adicionarPessoa(Pessoa p);
    public boolean removerPessoa(String cpf);
    public Pessoa buscarPessoaPorNome(String nome);
    public Pessoa buscarPessoaPorCPF(String cpf);

    public void add(Pessoa pessoa1);
}
