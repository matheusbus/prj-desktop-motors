
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.view.CadastroMotoView;


public class CadastroMotoController extends BaseCadastroController {
    
    private CadastroMotoView cadastroMotoView;
    private Moto modeloMoto;

    public CadastroMotoController(CadastroMotoView cadastroMotoView, Moto modeloMoto) {
        this.cadastroMotoView = cadastroMotoView;
        this.modeloMoto = modeloMoto;
    }
    
    @Override
    public boolean verificaCamposNulos() {
      return cadastroMotoView.verificaCamposNulos();
    }

    @Override
    public void inicializarBotoes() {
            
    }

    @Override
    public void exibirTela() {
       cadastroMotoView.exibirTela();
    }
    
     @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        cadastroMotoView.apresentaMensagem(mensagem, titulo);
    }
    
    
    public void acaoCadastrar(){
        
    }

   
    
}
