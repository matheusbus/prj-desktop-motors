/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.view.CadastroMotoView;
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
        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoConsultaFuncionario();
        });

        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoConsultaCarro();
        });

        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoConsultaMoto();
        });

        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoRelatorio();
        });

        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoCadastroCarro();
        });

        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoCadastroMoto();
        });

        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoCadastroCliente();
        });

        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoConsultaCliente();
        });
        
          principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoCadastroVenda();
        });
          
            principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoConsultaVenda();
        });
            
              principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoCadastroFuncionario();
        });
              
                principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoCadastroFuncionario();
        });

    }

    // Inicializar Controladores
    public void acaoBotaoConsultaFuncionario() {
        ConsultaFuncionarioController consultaFuncionarioController = new ConsultaFuncionarioController();
        consultaFuncionarioController.exibirTela();
    }

    public void acaoBotaoConsultaCarro() {
        ConsultaCarroController consultaCarroControler = new ConsultaCarroController();
        consultaCarroControler.exibirTela();
    }

    public void acaoBotaoConsultaMoto() {
        ConsultaMotoController consultaMotoController = new ConsultaMotoController();
        consultaMotoController.exibirTela();
    }

    public void acaoBotaoRelatorio() {
        RelatorioController relatorioController = new RelatorioController();
        relatorioController.exibirTela();
    }

    public void acaoBotaoCadastroCarro() {
        CadastroCarroController cadastroCarroControler = new CadastroCarroController();
        cadastroCarroControler.exibirTela();
    }

    public void acaoBotaoCadastroMoto() {
        CadastroMotoController cadastroMotoController = new CadastroMotoController();
        cadastroMotoController.exibirTela();
    }

    public void acaoBotaoCadastroCliente() {
        CadastroClienteController cadastroClienteController = new CadastroClienteController();
        cadastroClienteController.exibirTela();
    }

    public void acaoBotaoConsultaCliente() {
        ConsultaClienteController consultaClienteController = new ConsultaClienteController();
        consultaClienteController.exibirTela();
    }

    public void acaoBotaoCadastroVenda() {
        CadastroVendaController cadastroVendaController = new CadastroVendaController();
        cadastroVendaController.exibirTela();
    }

    public void acaoBotaoConsultaVenda() {
        ConsultaVendaController consultaVendaController = new ConsultaVendaController();
        consultaVendaController.exibirTela();
    }

    public void acaoBotaoCadastroFuncionario() {
        CadastroFuncionarioController cadastroFuncionarioController = new CadastroFuncionarioController();
        cadastroFuncionarioController.exibirTela();
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
