/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.view.ConsultaClienteView;
import java.awt.event.ActionEvent;

/**
 *
 * @author Rafael
 */
public final class ConsultaClienteController extends BaseConsultaController{

    private final ConsultaClienteView consultaClienteView;
    private final PessoaRepositorio pessoaRepositorio = new PessoaDAO();
    
    public ConsultaClienteController() {
        this.consultaClienteView = new ConsultaClienteView();
        inicializarBotoes();
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
            acaoRemover();
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
        
    }
    
    public void acaoCadastrar(){
        
    }
    
    public void acaoRemover(){
        
    }
    
    public void acaoSelecionar(){
        
    }
    
    /*public void validaRemocao(){
        if (!(consultaClienteView.getTblClientes().getSelectedRow() != -1)) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro de exclusão");
        } else {
            if (0 == consultaClienteView.criaQuestaoPrgunta("Tem certeza que deseja excluir o registro da lista?", "Confirmar remoção")) {
                removerDaTabela(pessoaRepositorio, 0, , consultaClienteView.getGrid());
            }
        }
    }*/

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
    
}
