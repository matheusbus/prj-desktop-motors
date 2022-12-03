/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.lojaveiculo.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public abstract class BaseController {

    public abstract void inicializarBotoes();
    public abstract void exibirTela();
    
    public void apresentarMensagem(String mensagem, String titulo){
        JOptionPane.showMessageDialog(null, mensagem, titulo, 0);
    }
    
    public abstract void fecharTela();
    
}
