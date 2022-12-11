/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.PessoaDAO;
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

    private ConsultaClienteView consultaClienteView;
    private CadastroVendaController cadastroVendaController;
    private Cliente modeloCliente;
    private final PessoaRepositorio pessoaRepositorio = new PessoaDAO();
    
    public ConsultaClienteController() {
        this.consultaClienteView = new ConsultaClienteView();
        inicializarBotoes();
         popularTabela();
        setBotaoSelecionar(false);
    }

    public ConsultaClienteController(CadastroVendaController cadastroVendaController) {
        this.consultaClienteView = new ConsultaClienteView();
        this.cadastroVendaController = cadastroVendaController;
        inicializarBotoes();
        popularTabela();
        setBotaoSelecionar(true);
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
        consultaClienteView.buscaNaTabela(); 
    }
   
    public void acaoAlterar(){
        try {
            CadastroClienteController cadastroClienteController = new CadastroClienteController(this, new CadastroClienteView(), getClienteSelecionado());
            cadastroClienteController.exibirTela();
            consultaClienteView.limparTabela();
            consultaClienteView.popularTabela(pessoaRepositorio.getClientes());
        } catch (Exception e){
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro");
        }
    }
    
    public void acaoCadastrar(){
        CadastroClienteController cadastroClienteController = new CadastroClienteController(this);
        cadastroClienteController.exibirTela();
    }
    
    public void acaoRemover(){
        try {
            if(0 == consultaClienteView.criaQuestaoPrgunta("Tem certeza que deseja remover o registro selecionado?", "Confirmação de exclusão")){
                   // Pegar o registro que está na tabela
                   modeloCliente = getClienteSelecionado();
                   // Remover da tabela
                   pessoaRepositorio.removerPessoa(modeloCliente.getCpf());
                   // Atualizar a tabela com o popula
                   consultaClienteView.limparTabela();
                   popularTabela();
                   apresentarMensagem("Registro removido com sucesso", "Êxito");
               }
               consultaClienteView.limpaSelecao();           
        } catch (Exception e) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro");
        }
    }
    
    public void acaoSelecionar(){
        cadastroVendaController.setCliente((Cliente) pessoaRepositorio.buscarPessoaPorCPF(consultaClienteView.getCpfClienteSelecionado()));
        cadastroVendaController.populaListaCliente();
        fecharTela();
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
    
    public void setBotaoSelecionar(boolean bool){
        consultaClienteView.setBotaoSelecionar(bool);
    }
    
}
