package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.view.CadastroMotoView;
import br.com.lojaveiculo.view.ConsultaMotoView;
import java.awt.event.ActionEvent;

public class ConsultaMotoController extends BaseConsultaController {

    private ConsultaMotoView consultaMotoView;
    private Moto modeloMoto;
    private VeiculoRepositorio veiculoRepositorio;
    private CadastroVendaController cadastroVendaController;

    public ConsultaMotoController() {
        this.consultaMotoView = new ConsultaMotoView();
        this.modeloMoto = null;
        this.veiculoRepositorio = new VeiculoDAO();
        inicializarBotoes();
        setBotaoSelecionar(false);
        popularTabela();
    }

    public ConsultaMotoController(CadastroVendaController cadastroVendaController) {
        this.consultaMotoView = new ConsultaMotoView();
        this.modeloMoto = null;
        this.veiculoRepositorio = new VeiculoDAO();
        this.cadastroVendaController = cadastroVendaController;
        inicializarBotoes();
        setBotaoSelecionar(true);
        popularTabela();
    }

    @Override
    public void popularTabela() {
        consultaMotoView.limparTabela();
        consultaMotoView.popularTabela(veiculoRepositorio.getMotos());
    }

    @Override
    public void inicializarBotoes() {
        consultaMotoView.adicionaAcaoAoBtnCadastrar((ActionEvent e) -> {
            acaoCadastrar();
        });

        consultaMotoView.adicionaAcaoAoBtnAlterar((ActionEvent e) -> {
            acaoAlterar();
        });

        consultaMotoView.adicionaAcaoAoBtnBuscar((ActionEvent e) -> {
            acaoBuscar();
        });

        consultaMotoView.adicionaAcaoAoBtnRemover((ActionEvent e) -> {
            acaoRemover();
        });

        consultaMotoView.adicionaAcaoAoBtnSelecionar((ActionEvent e) -> {
            acaoSelecionar();
        });
    }

    @Override
    public void exibirTela() {
        consultaMotoView.exibirTela();
        popularTabela();
    }

    @Override
    public void fecharTela() {
        consultaMotoView.fecharTela();
    }

    @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        consultaMotoView.apresentaMensagem(mensagem, titulo);
    }

    public void limparTabela() {
        consultaMotoView.limparTabela();
    }

    public void acaoAlterar() {
        try {
            String sPlaca = consultaMotoView.getPlacaTabelaRegistro();
            Moto moto = (Moto) veiculoRepositorio.buscarVeiculo(sPlaca);
            CadastroMotoController cadastroMotoController = new CadastroMotoController(new CadastroMotoView(), moto, this);
            cadastroMotoController.exibirTela();
        } catch (Exception e) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro de alteração");
        }
    }

    public void acaoRemover() {
        try {
            if (0 == consultaMotoView.criaQuestaoPrgunta("Tem certeza que deseja remover o registro selecionado?", "Confirmação de exclusão")) {
                veiculoRepositorio.removeVeiculo(consultaMotoView.getPlacaTabelaRegistro());
                limparTabela();
                popularTabela();
                apresentarMensagem("Registro removido com sucesso", "Êxito");
            }
        } catch (Exception e) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro");
        }
    }

    public void acaoCadastrar() {
        CadastroMotoController cadastroMotoContoller = new CadastroMotoController();
        cadastroMotoContoller.exibirTela();
    }

    public void acaoSelecionar() {
        String sPlaca = consultaMotoView.getSelecionaItem();
        cadastroVendaController.setVeiculo(veiculoRepositorio.buscarVeiculo(sPlaca));
        cadastroVendaController.populaListaVeiculo();
        fecharTela();
    }

    public void acaoBuscar() {
        consultaMotoView.limpaSelecao();
        String sPlaca = consultaMotoView.getFiltro();
        if (sPlaca.length() == 7) {
            if (consultaMotoView.BuscaTabela(sPlaca)) {
                apresentarMensagem("Sucesso", "Sucesso");
            } else {
                apresentarMensagem("Não foi encontrado nenhum veículo com a placa", "Veículo não Encontrado");
            }
        } else {
            apresentarMensagem("Digite uma placa válida!", "Placa inválida");
        }
    }

    public void setBotaoSelecionar(Boolean bool) {
        consultaMotoView.setBotaoSelecionar(bool);
    }

}
