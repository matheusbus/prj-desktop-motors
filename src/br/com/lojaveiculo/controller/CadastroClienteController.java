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

/**
 *
 * @author Matheus
 */
public final class CadastroClienteController extends BaseCadastroController{

    private CadastroClienteView cadastroClienteView;
    private Cliente modeloCliente;
    private PessoaRepositorio pessoaRepositorio = new PessoaDAO();
    
    public CadastroClienteController() {
        this.cadastroClienteView = cadastroClienteView;
        this.modeloCliente = null;
        inicializarBotoes();
    }

    public CadastroClienteController(CadastroClienteView cadastroClienteView, Cliente modeloCliente) {
        this.cadastroClienteView = cadastroClienteView;
        this.modeloCliente = modeloCliente;
        this.cadastroClienteView.setTitulosTela("Alterar");
        popularCamposDoClienteAlterar();
        inicializarBotoes();
    }
    
    @Override
    public void inicializarBotoes() {
        if(this.modeloCliente == null){
            cadastroClienteView.adicionaAcaoAoBotaoCadastrar((ActionEvent e) -> {
                acaoCadastrar();
            });
        } else {
            cadastroClienteView.adicionaAcaoAoBotaoCadastrar((ActionEvent e) -> {
                acaoAlterar();            
            });                
        }
        cadastroClienteView.adicionaAcaoAoBotaoCancelar((ActionEvent e) -> {
            acaoCancelar();
        });
    }
    
    public void acaoCancelar(){
        cadastroClienteView.fecharTela();
    }
    
    public void acaoCadastrar(){
        // Implementar acao e exceção
        if(verificaCamposNulos()){
            // 1 - Recuperar dados
            String sNome = cadastroClienteView.getNome();
            String sCpf = cadastroClienteView.getCpf();
            long iRg = 0;
            try {
                iRg = Integer.parseInt(cadastroClienteView.getRg());
            } catch (NumberFormatException ex){
                apresentarMensagem("O campo RG deve ser um número inteiro.", "Erro de conversão de valores");
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
            pessoaRepositorio.adicionarPessoa(modeloCliente);

            // 4 - Mensagem
            apresentarMensagem("Cliente cadastrado com sucesso.", "Êxito");
            
            // 5 - Fechar tela
            fecharTela();
        }
 
    }
    
    public void acaoAlterar(){
        // Implementar acao e exceção
        
        if(verificaCamposNulos()){
            try {
                verificaExistenciaCPF(modeloCliente.getCpf());
                verificaLengthCpf();
            } catch (ClienteException ex) {
                apresentarMensagem(ex.getMessage(), "Erro");
            }
            
            pessoaRepositorio.removerPessoa(modeloCliente.getCpf());
            modeloCliente.setNome(cadastroClienteView.getNome());
            modeloCliente.setCpf(cadastroClienteView.getCpf());
            
            try {
                modeloCliente.setRg(Long.parseLong(cadastroClienteView.getRg()));
            } catch (NumberFormatException ex){
                apresentarMensagem("O campo RG deve ser um número inteiro.", "Erro de conversão de valores");
            }
            
            modeloCliente.setCnh(cadastroClienteView.getCNH());
            modeloCliente.setCategoriaCnh(cadastroClienteView.getCategoriaCNH().toUpperCase());
            modeloCliente.setCep(cadastroClienteView.getCep());
            modeloCliente.setEndereco(cadastroClienteView.getEndereco());
            modeloCliente.setBairro(cadastroClienteView.getBairro());
            modeloCliente.setCidade(cadastroClienteView.getCidade());
            modeloCliente.setEstado(cadastroClienteView.getEstado());
            modeloCliente.setTelefone(cadastroClienteView.getTelefone());
            modeloCliente.setEmail(cadastroClienteView.getEmail());
            pessoaRepositorio.adicionarPessoa(modeloCliente);
            
            // chamar o método de popula do controlador de consulta de cliente
            apresentarMensagem("Cliente alterado com sucesso.", "Alteração realizada");
        }
        
    }
    
    public void popularCamposDoClienteAlterar(){
        cadastroClienteView.setNome(modeloCliente.getNome());
        cadastroClienteView.setCpf(modeloCliente.getCpf());
        cadastroClienteView.setRg(String.valueOf(modeloCliente.getRg()));
        cadastroClienteView.setCNH(modeloCliente.getCnh());
        cadastroClienteView.setCategoriaCNH(modeloCliente.getCnh());
        cadastroClienteView.setCep(modeloCliente.getCep());
        cadastroClienteView.setEndereco(modeloCliente.getEndereco());
        cadastroClienteView.setBairro(modeloCliente.getBairro());
        cadastroClienteView.setCidade(modeloCliente.getCidade());
        cadastroClienteView.setEstado(modeloCliente.getEstado());
        cadastroClienteView.setTelefone(modeloCliente.getTelefone());
        cadastroClienteView.setEmail(modeloCliente.getEmail());
        cadastroClienteView.setWhatsapp(modeloCliente.getWhatsapp());
    }
    
    public boolean verificaExistenciaCPF(String cpf) throws ClienteException{
        if(pessoaRepositorio.buscarPessoaPorCPF(cpf) == null){
            return true;
        } else {
            throw new ClienteException("CPF já consta no sistema.");
        }
    }
    
    public boolean verificaLengthCpf() throws ClienteException{
        if(cadastroClienteView.getCpf().length() == 11){
            return true;
        } else {
            throw new ClienteException("O CPF deve conter 11 dígitos.");
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
        cadastroClienteView.fecharTela();
    }
    
}
