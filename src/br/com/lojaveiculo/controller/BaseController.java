/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.lojaveiculo.controller;

/**
 *
 * @author Matheus
 */
public abstract class BaseController {

    public abstract void inicializarBotoes();
    public abstract void exibirTela();
    
    
    public abstract void apresentarMensagem(String mensagem, String titulo);
    
    public abstract void fecharTela();
    
}
