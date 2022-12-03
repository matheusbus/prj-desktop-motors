/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.model.Funcionario;
import br.com.lojaveiculo.view.CadastroFuncionariosView;
import java.awt.event.ActionEvent;

/**
 *
 * @author Rafael
 */
public class CadastroFuncionarioController extends BaseCadastroController{

    private CadastroFuncionariosView cadastroFuncionariosView;
    private Funcionario modeloFuncionario;

    public CadastroFuncionarioController() {
        this.cadastroFuncionariosView = new CadastroFuncionariosView();
    }
    
    @Override
    public void inicializarBotoes() {
        cadastroFuncionariosView.adicionaAcaoAoBotaoCadastrar((ActionEvent e) -> {
            acaoCadastrar();
        });
        cadastroFuncionariosView.adicionarAcaoAoBotaoCancelar((ActionEvent e) -> {
            acaoCancealar();
        });
    }  
    
    public void acaoCadastrar(){
        
    }
    
    public void acaoCancealar(){
        cadastroFuncionariosView.fecharTela();
    }
    
    @Override
    public boolean verificaCamposNulos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void exibirTela() {
        cadastroFuncionariosView.exibirTela();
    }

    @Override
    public void fecharTela() {
        cadastroFuncionariosView.fecharTela();
    }
    
}
