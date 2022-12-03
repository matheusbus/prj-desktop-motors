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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Matheus
 */
public final class CadastroClienteController extends BaseCadastroController{

    private CadastroClienteView cadastroClienteView;
    private Cliente modeloCliente;
    
    public CadastroClienteController() {
        this.cadastroClienteView = new CadastroClienteView();
        inicializarBotoes();
    }

    public CadastroClienteController(CadastroClienteView cadastroClienteView, Cliente modeloCliente) {
        this.cadastroClienteView = cadastroClienteView;
        this.modeloCliente = modeloCliente;
        popularCamposDoClienteAlterar();
        inicializarBotoes();
    }
    
    @Override
    public void inicializarBotoes() {
        if(this.modeloCliente == null){
            cadastroClienteView.adicionaAcaoAoBotaoCadastrar(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Ação cadastrar
                }
            });
        } else {
            cadastroClienteView.adicionaAcaoAoBotaoCadastrar(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Ação alterar
                }            
            });                
        }
        
        cadastroClienteView.adicionaAcaoAoBotaoCancelar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoCancelar();
            }
        });
    }
    
    public void acaoCancelar(){
        cadastroClienteView.dispose();
    }
    
    public void acaoCadastrar(){
        // Implementar acao e exceção
        
        // 1 - Recuperar dados
        String sNome = cadastroClienteView.getNome();
        String sCpf = cadastroClienteView.getCpf();
        long iRg = 0;
        try {
            iRg = Integer.parseInt(cadastroClienteView.getRg());
        } catch (NumberFormatException ex){
            apresentarMensagem("Erro de conversão de valores", "O campo RG deve ser um número inteiro.");
        }
        String sCnh = cadastroClienteView.getCNH();
        String sCatCnh = cadastroClienteView.getCategoriaCNH().toUpperCase();
        String sCep = cadastroClienteView.getCep();
        String sEndereco = cadastroClienteView.getEndereco();
        String sBairro = cadastroClienteView.getBairro();
        String sCidade = cadastroClienteView.getCidade();
        String sEstado = cadastroClienteView.getEstado();
        String sTelefone = cadastroClienteView.getTelefone();
        String sEmail = cadastroClienteView.getEmail();
        String sWhatsapp = cadastroClienteView.getWhatsapp();

        try {
            // 3 - Verificar existencia cpf
            verificaExistenciaCPF(sCpf);
        } catch (ClienteException ex) {
            apresentarMensagem(ex.getMessage(), "Erro");
        }
        
        // 2 - Criar o novo cliente
        this.modeloCliente = new Cliente(sNome, sCpf, iRg, sCnh, sCatCnh, sCep, sEndereco, sBairro, sCidade, sEstado, sTelefone, sEmail, sWhatsapp);
        
        // 3 - Recuperar BD de clientes e adicionar novo cliente ao BD
        PessoaRepositorio pessoaRepositorio = new PessoaDAO();
        pessoaRepositorio.adicionarPessoa(modeloCliente);
        
        // 4 - Mensagem
        apresentarMensagem("Êxito", "Cliente cadastrado com sucesso.");
        
        // 5 - Fechar tela
        fecharTela();
        
    }
    
    public void acaoAlterar(){
        // Implementar acao e exceção
        
        
        
    }
    
    public void popularCamposDoClienteAlterar(){
        
    }
    
    public boolean verificaExistenciaCPF(String cpf) throws ClienteException{
        PessoaRepositorio pessoaRepositorio = new PessoaDAO();
        if(pessoaRepositorio.buscarPessoaPorCPF(cpf) == null){
            return true;
        } else {
            throw new ClienteException("CPF já consta no sistema.");
        }
    }

    @Override
    public void exibirTela() {
        cadastroClienteView.exibirTela();
    }

    @Override
    public boolean verificaCamposNulos(){
        return cadastroClienteView.verificaCamposNulos();
    }

    @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        cadastroClienteView.apresentaMensagem(mensagem, titulo);
    }

    @Override
    public void fecharTela() {
        cadastroClienteView.dispose();
    }
    
}
