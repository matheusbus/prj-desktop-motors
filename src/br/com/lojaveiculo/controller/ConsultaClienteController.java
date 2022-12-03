/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.view.ConsultaClienteView;

/**
 *
 * @author Rafael
 */
public class ConsultaClienteController extends BaseConsultaController{

    private ConsultaClienteView consultaClienteView;
    private PessoaRepositorio pessoaRepositorio = new PessoaDAO();
    
    public ConsultaClienteController() {
        this.consultaClienteView = new ConsultaClienteView();
    }

    @Override
    public void inicializarBotoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void acaoBuscar(){
        
    }
    
    public void acaoAlterar(){
        
    }
    
    public void acaoCadastrar(){
        
    }
    
    public void acaoRemover(){
        
    }
    
    public void acaoSelecionar(){
        
    }
    
    public void validaRemocao(){
        if (!(consultaClienteView.getTblClientes().getSelectedRow() != -1)) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro de exclusão");
        } else {
            if (0 == consultaClienteView.criaQuestaoPrgunta("Tem certeza que deseja excluir o registro da lista?", "Confirmar remoção")) {
                removerDaTabela(pessoaRepositorio, 0, , consultaClienteView.getGrid());
            }
        }
    }
    
    @Override
    public void popularTabela() {
        consultaClienteView.popularTabelaDados();
    }

    @Override
    public void exibirTela() {
        consultaClienteView.exibirTela();
    }

    @Override
    public void fecharTela() {
        consultaClienteView.fecharTela();
    }
    
}
