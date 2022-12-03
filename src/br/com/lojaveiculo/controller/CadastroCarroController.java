package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.view.CadastroCarroView;

public class CadastroCarroController extends BaseController{

    private CadastroCarroView cadastroCarroView;
    private Carro modeloCarro;

    public CadastroCarroController() {
        this.cadastroCarroView = new CadastroCarroView();
        inicializarBotoes();
    }

    public CadastroCarroController(CadastroCarroView cadastroCarroView, Carro modeloCarro) {
        this.cadastroCarroView = cadastroCarroView;
        this.modeloCarro = modeloCarro;
        inicializarBotoes();
    }
       
    @Override
    public void inicializarBotoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void exibirTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}