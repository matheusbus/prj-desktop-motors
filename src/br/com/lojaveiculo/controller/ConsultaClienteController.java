/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.view.ConsultaClienteView;

/**
 *
 * @author Rafael
 */
public class ConsultaClienteController extends BaseConsultaController{

    private ConsultaClienteView consultaClienteView;
    
    public ConsultaClienteController() {
        this.consultaClienteView = new ConsultaClienteView();
    }

    @Override
    public void inicializarBotoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void popularTabela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
