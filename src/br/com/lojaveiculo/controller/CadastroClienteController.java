/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.model.Cliente;
import br.com.lojaveiculo.view.CadastroClienteView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Matheus
 */
public final class CadastroClienteController extends BaseController{

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
        // 2 - Criar o novo usuário (fazer uso de exception)
        // 3 - Recuperar BD de clientes e adicionar novo cliente ao BD
        // 4 - Mensagem
        // 5 - Limpar tela
    }
    
    public void acaoAlterar(){
        // Implementar acao e exceção
    }
    
    public void popularCamposDoClienteAlterar(){
        
    }

    @Override
    public void exibirTela() {
        cadastroClienteView.exibirTela();
    }
    
}
