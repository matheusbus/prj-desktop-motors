/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package br.com.lojaveiculo.controller;


import br.com.lojaveiculo.view.PrincipalView;
import java.awt.event.ActionEvent;

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
        principalView.adicionarAcaoAoBotaoCadastroFuncionario((ActionEvent e) -> {
            acaoBotaoConsultaFuncionario();
        });

        principalView.adicionarAcaoAoBotaoConsultaCarro((ActionEvent e) -> {
            acaoBotaoConsultaCarro();
        });

        principalView.adicionarAcaoAoBotaoConsultaMoto((ActionEvent e) -> {
            acaoBotaoConsultaMoto();
        });

        principalView.adicionarAcaoAoBotaoRelatorio((ActionEvent e) -> {
            acaoBotaoRelatorio();
        });

        principalView.adicionarAcaoAoBotaoCadastroCarro((ActionEvent e) -> {
            acaoBotaoCadastroCarro();
        });

        principalView.adicionarAcaoAoBotaoCadastroMoto((ActionEvent e) -> {
            acaoBotaoCadastroMoto();
        });

        principalView.adicionarAcaoAoBotaoCadastroCliente((ActionEvent e) -> {
            acaoBotaoCadastroCliente();
        });

        principalView.adicionarAcaoAoBotaoConsultaCliente((ActionEvent e) -> {
            acaoBotaoConsultaCliente();
        });
        
        principalView.adicionarAcaoAoBotaoCadastroVenda((ActionEvent e) -> {
            acaoBotaoCadastroVenda();
        });
          
        principalView.adicionarAcaoAoBotaoConsultaVenda((ActionEvent e) -> {
            acaoBotaoConsultaVenda();
        });
            
        principalView.adicionarAcaoAoBotaoCadastroFuncionario((ActionEvent e) -> {
            acaoBotaoCadastroFuncionario();
        });
              
        principalView.adicionarAcaoAoBotaoCadastroFuncionario((ActionEvent e) -> {
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
        EmissaoRelatorioController emissaoRelatorioController= new EmissaoRelatorioController();
        emissaoRelatorioController.exibirTela();
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
    public void fecharTela() {}

}
