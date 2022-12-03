/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.excecoes.ClienteException;
import br.com.lojaveiculo.model.Cliente;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.view.CadastroClienteView;
import br.com.lojaveiculo.view.ConsultaClienteView;
import java.awt.event.ActionEvent;

/**
 *
 * @author Rafael
 */
public final class ConsultaClienteController extends BaseConsultaController{

    private final ConsultaClienteView consultaClienteView;
    private Cliente modeloCliente;
    private final PessoaRepositorio pessoaRepositorio = new PessoaDAO();
    
    public ConsultaClienteController() {
        this.consultaClienteView = new ConsultaClienteView();
        inicializarBotoes();
        popularTabela();
    }

    @Override
    public void inicializarBotoes() {
        consultaClienteView.adicionarAcaoAoBotaoBuscarCliente((ActionEvent e) -> {
            acaoBuscar();
        });
        consultaClienteView.adicionarAcaoAoBotaoCadastrarCliente((ActionEvent e) -> {
            acaoCadastrar();
        });
        consultaClienteView.adicionarAcaoAoBotaoRemvoerCliente((ActionEvent e) -> {
            try {
                acaoRemover();
            } catch (ClienteException ex) {
                apresentarMensagem(ex.getMessage(), "Erro");
            }
        });
        consultaClienteView.adicionarAcaoAoBotaoAlterarCliente((ActionEvent e) -> {
            acaoAlterar();
        });
        consultaClienteView.adicionarAcaoAoBotaoSelecionar((ActionEvent e) -> {
            acaoSelecionar();
        });
    }
    
    public void acaoBuscar(){
        consultaClienteView.limpaSelecao();
        consultaClienteView.buscaNaTabela(consultaClienteView.getFiltroPesquisa()); 
    }
   
    public void acaoAlterar(){
        if(getClienteSelecionado() != null){
            CadastroClienteController cadastroClienteController = new CadastroClienteController(this, new CadastroClienteView(), getClienteSelecionado());
            cadastroClienteController.exibirTela();
            consultaClienteView.limparTabela();
            consultaClienteView.popularTabela(pessoaRepositorio.getClientes());
        } else {
            apresentarMensagem("Nenhum cliente selecionado.", "Erro");
        }
    }
    
    public void acaoCadastrar(){
        CadastroClienteController cadastroClienteController = new CadastroClienteController();
        cadastroClienteController.exibirTela();
    }
    
    public void acaoRemover() throws ClienteException{
        if(getClienteSelecionado() != null){
            if(0 == consultaClienteView.criaQuestaoPrgunta("Tem certeza que deseja remover o registro selecionado?", "Confirmação de exclusão")){
                // Pegar o registro que está na tabela
                modeloCliente = getClienteSelecionado();
                // Remover da tabela
                pessoaRepositorio.removerPessoa(modeloCliente.getCpf());
                // Atualizar a tabela com o popula
                consultaClienteView.limparTabela();
                popularTabela();
            }
            consultaClienteView.limpaSelecao();
        } else {
            throw new ClienteException("Nenhum cliente foi selecionado.");
        }

    }
    
    public void acaoSelecionar(){
        // Implementar
    }

    @Override
    public void exibirTela() {
        consultaClienteView.exibirTela();
    }

    @Override
    public void fecharTela() {
        consultaClienteView.fecharTela();
    }

    @Override
    public void popularTabela() {
        consultaClienteView.popularTabela(pessoaRepositorio.getClientes());
    }
    
    public Cliente getClienteSelecionado(){
        return (Cliente) pessoaRepositorio.buscarPessoaPorCPF(consultaClienteView.getCpfClienteSelecionado());
    }

    public ConsultaClienteView getConsultaClienteView() {
        return consultaClienteView;
    }

    public Cliente getModeloCliente() {
        return modeloCliente;
    }

    public PessoaRepositorio getPessoaRepositorio() {
        return pessoaRepositorio;
    }
    
    
    
}
