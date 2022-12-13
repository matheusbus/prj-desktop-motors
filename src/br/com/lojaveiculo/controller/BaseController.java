/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.abstractview.TelaBaseView;


/**
 *
 * @author Matheus
 */
public abstract class BaseController {

    private TelaBaseView telaBase;
    public abstract void inicializarBotoes();
    public abstract void exibirTela();
    
    
    public void apresentarMensagem(String mensagem, String titulo){
        telaBase.apresentaMensagem(mensagem, titulo);
    }
    
    public abstract void fecharTela();
    
}
