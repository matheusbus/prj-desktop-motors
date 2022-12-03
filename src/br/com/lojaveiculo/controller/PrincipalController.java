/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.view.PrincipalView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Matheus
 */
public final class PrincipalController extends BaseController {

    private PrincipalView principalView;

    public PrincipalController() {
        this.principalView = new PrincipalView();
        inicializarBotoes();
    }

    @Override
    public void inicializarBotoes() {
        principalView.adicionarAcaoAoBotaoCadastroCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBotaoCadastroCliente();
            }
        });
        // Chamar todas as funções
    }

    // Inicializar Controladores
    public void acaoBotaoConsultaFuncionario() {

    }

    public void acaoBotaoConsultaCarro() {

    }

    public void acaoBotaoConsultaMoto() {

    }

    public void acaoBotaoRelatorio() {

    }

    public void acaoBotaoCadastroCarro() {

    }

    public void acaoBotaoCadastroMoto() {

    }

    public void acaoBotaoCadastroCliente() {
        CadastroClienteController cadastroClienteController = new CadastroClienteController();
        cadastroClienteController.exibirTela();
    }

    public void acaoBotaoConsultaCliente() {

    }

    public void acaoBotaoCadastroVenda() {

    }

    public void acaoBotaoConsultaVenda() {

    }

    public void acaoBotaoCadastroFuncionario() {

    }

    @Override
    public void exibirTela() {
        principalView.exibirTela();
    }

    @Override
    public void fecharTela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
