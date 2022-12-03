package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.view.ConsultaMotoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

/**
 *
 * @author Rafael
 */
public class ConsultaMotoController extends BaseConsultaController {

    private ConsultaMotoView consultaMotoView;
    private Moto modeloMoto;
    private VeiculoRepositorio veiculoRepositorio;

    public ConsultaMotoController() {
        this.consultaMotoView = new ConsultaMotoView();
        this.modeloMoto = null;
        this.veiculoRepositorio = new VeiculoDAO();
        inicializarBotoes();
    }

    public ConsultaMotoController(ConsultaMotoView consultaMotoView, Moto modeloMoto) {
        this.consultaMotoView = consultaMotoView;
        this.modeloMoto = modeloMoto;
        this.veiculoRepositorio = new VeiculoDAO();
        inicializarBotoes();
    }

    @Override
    public void popularTabela() {
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

    }

    public void acaoRemover() {
        veiculoRepositorio.removeVeiculo(consultaMotoView.getPlacaTabelaRegistro());
        limparTabela();
        popularTabela();
    }

    public void acaoCadastrar() {
        CadastroMotoController cadastroMotoContoller = new CadastroMotoController();
        cadastroMotoContoller.exibirTela();
    }

    public void acaoSelecionar() {

    }

    public void acaoBuscar() {

    }

}
