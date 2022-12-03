/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.view.CadastroCarroView;
import br.com.lojaveiculo.view.CadastroMotoView;
import br.com.lojaveiculo.view.ConsultaCarroView;
import java.awt.event.ActionEvent;

/**
 *
 * @author Rafael
 */
public class ConsultaCarroController extends BaseConsultaController {

    private ConsultaCarroView consultaCarroView;
    private Carro modeloCarro;
    private VeiculoRepositorio veiculoRepositorio;

    public ConsultaCarroController() {
        this.consultaCarroView = new ConsultaCarroView();
        this.modeloCarro = null;
        this.veiculoRepositorio = new VeiculoDAO();
        inicializarBotoes();
    }

    @Override
    public void popularTabela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void inicializarBotoes() {
        consultaCarroView.adicionarAcaoBtnCadastrar((ActionEvent e) -> {
            acaoCadastrar();
        });

        consultaCarroView.adicionarAcaoBtnAlterar((ActionEvent e) -> {
            acaoAlterar();
        });
        consultaCarroView.adicionarAcaoBtnAlterar((ActionEvent e) -> {
            acaoSelecionar();
        });
        consultaCarroView.adicionarAcaoBtnAlterar((ActionEvent e) -> {
            acaoBuscar();
        });
        consultaCarroView.adicionarAcaoBtnAlterar((ActionEvent e) -> {
            acaoRemover();
        });
    }

    public void acaoCadastrar() {
        CadastroCarroController cadastroCarroController = new CadastroCarroController();
        cadastroCarroController.exibirTela();
    }

    public void buscarTabela() {

    }

    public void acaoAlterar() {
        try {
            String sPlaca = consultaCarroView.getPlacaTabelaRegistro();
            Carro carro = (Carro) veiculoRepositorio.buscarVeiculo(sPlaca);
            CadastroCarroController cadastroCarroController = new CadastroCarroController(new CadastroCarroView(), carro);
            cadastroCarroController.exibirTela();
        } catch (Exception e) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro de alteração");
        }
    }

    public void acaoSelecionar() {
        String sPlaca = consultaCarroView.getSelecionaItem();
        cadastroVendaController.setVeiculo(veiculoRepositorio.buscarVeiculo(sPlaca));
    }

    public void acaoBuscar() {
        consultaCarroView.limpaSelecao();
        String sPlaca = consultaCarroView.getFiltro();
        if (sPlaca.length() == 7) {
            if (consultaCarroView.BuscaTabela(sPlaca)) {
                apresentarMensagem("Sucesso", "Sucesso");
            } else {
                apresentarMensagem("Não foi encontrado nenhum veículo com a placa", "Veículo não Encontrado");
            }
        } else {
            apresentarMensagem("Digite uma placa válida!", "Placa inválida");
        }
    }

    public void acaoRemover() {
        veiculoRepositorio.removeVeiculo(consultaCarroView.getPlacaTabelaRegistro());
        limparTabela();
        popularTabela();
    }

    @Override
    public void exibirTela() {
        consultaCarroView.exibirTela();
    }

    @Override
    public void fecharTela() {
        consultaCarroView.fecharTela();
    }

    public void apresentaMensagem(String mensagem, String titulo) {
        consultaCarroView.apresentaMensagem(mensagem, titulo);
    }

    public void limparTabela() {
        consultaCarroView.limparTabela();

    }

}
