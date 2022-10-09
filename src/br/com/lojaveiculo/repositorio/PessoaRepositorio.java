/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.lojaveiculo.repositorio;

import br.com.lojaveiculo.model.Pessoa;
import java.util.List;

/**
 *
 * @author Matheus
 */
public interface PessoaRepositorio {
    
    public List<Pessoa> getPessoas();
    public void adicionarPessoa(Pessoa p);
    public Pessoa buscarPessoaPorNome(String nome);
    public Pessoa buscarPessoaPorCPF(String cpf);
    
}
