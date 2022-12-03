/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controlador;

import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.view.CadastroCarroView;

/**
 *
 * @author Matheus
 */
public class ControladorCadastroCarro {
    
    private CadastroCarroView cadastroCarroView;
    private Carro modeloCarro;

    public ControladorCadastroCarro() {
        this.cadastroCarroView = new CadastroCarroView();
        this.modeloCarro = null;
    }
    
    public void inicializarBotoes(){
        
    }
    
    public void exibirTela(){
        cadastroCarroView.exibirTela();
    }
    
}
