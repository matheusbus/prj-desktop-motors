package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.view.CadastroCarroView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCarroController extends BaseCadastroController {

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
        if (this.modeloCarro == null) {
            cadastroCarroView.adicionaAcaoAoBotaoCadastrar(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        } else {
            cadastroCarroView.adicionaAcaoAoBotaoCadastrar(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }

        cadastroCarroView.adicionaAcaoAoBotaoCadastrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoCancelar();
            }
        });

    }
    
    public void acaoCadastrar(){
        if(verificarPlaca(cadastroCarroView.getTxtPlaca())){
            if(verificaCamposNulos()){
            String sPlaca = cadastroCarroView.
                
            } 
        }
           
    }

    public void acaoCancelar() {
        fecharTela();
    }
    
    @Override
    public void exibirTela() {
    cadastroCarroView.setVisible(true);
    }

    @Override
    public boolean verificaCamposNulos() {
        cadastroCarroView.verificaCamposNulos();
        return cadastroCarroView.verificaCamposNulos();
    }

    @Override
    public void apresentarMensagem(String titulo, String mensagem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void fecharTela() {
        
    }
    
    public boolean verificarPlaca(String placa){
        return cadastroCarroView.verificaLengthPlaca(placa);
    }
    
    
    
}
