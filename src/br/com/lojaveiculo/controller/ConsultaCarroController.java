package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.view.CadastroCarroView;
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
    private CadastroVendaController cadastroVendaController;

    public ConsultaCarroController() {
        this.consultaCarroView = new ConsultaCarroView();
        this.modeloCarro = null;
        this.veiculoRepositorio = new VeiculoDAO();
        inicializarBotoes();
        setBotaoSelecionar(false);
    }

    public ConsultaCarroController(CadastroVendaController cadastroVendaController) {
        this.consultaCarroView = new ConsultaCarroView();
        this.modeloCarro = null;
        this.veiculoRepositorio = new VeiculoDAO();
        this.cadastroVendaController = cadastroVendaController;
        inicializarBotoes();
        setBotaoSelecionar(true);
    }

    @Override
    public void popularTabela() {
        consultaCarroView.limparTabela();
        consultaCarroView.popularTabela(veiculoRepositorio.getCarros());
    }

    @Override
    public void inicializarBotoes() {
        consultaCarroView.adicionaAcaoAoBtnCadastrar((ActionEvent e) -> {
            acaoCadastrar();
        });

        consultaCarroView.adicionaAcaoAoBtnAlterar((ActionEvent e) -> {
            acaoAlterar();
        });
        
        consultaCarroView.adicionaAcaoAoBtnAlterar((ActionEvent e) -> {
            acaoBuscar();
        });
        
        consultaCarroView.adicionaAcaoAoBtnAlterar((ActionEvent e) -> {
            acaoRemover();
        });
        
        consultaCarroView.adicionaAcaoAoBtnAlterar((ActionEvent e) -> {
            acaoSelecionar();
        });
    }
    
    @Override
    public void exibirTela() {
        consultaCarroView.exibirTela();
        popularTabela();
    }

    @Override
    public void fecharTela() {
        consultaCarroView.fecharTela();
    }

    @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        consultaCarroView.apresentaMensagem(mensagem, titulo);
    }

    public void limparTabela() {
        consultaCarroView.limparTabela();
    }

    public void acaoAlterar() {
        try {
            String sPlaca = consultaCarroView.getPlacaTabelaRegistro();
            Carro carro = (Carro) veiculoRepositorio.buscarVeiculo(sPlaca);
            CadastroCarroController cadastroCarroController = new CadastroCarroController(new CadastroCarroView(), carro, this);
            cadastroCarroController.exibirTela();
        } catch (Exception e) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro de alteração");
        }
    }
    
    public void acaoRemover() {
        veiculoRepositorio.removeVeiculo(consultaCarroView.getPlacaTabelaRegistro());
        limparTabela();
        popularTabela();
    }

    public void acaoCadastrar() {
        CadastroCarroController cadastroCarroController = new CadastroCarroController();
        cadastroCarroController.exibirTela();
    }
    
    public void acaoSelecionar() {
        String sPlaca = consultaCarroView.getSelecionaItem();
        cadastroVendaController.setVeiculo(veiculoRepositorio.buscarVeiculo(sPlaca));
        cadastroVendaController.populaListaVeiculo();
        fecharTela();
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

    public void setBotaoSelecionar(Boolean bool) {
        consultaCarroView.setBotaoSelecionar(bool);
    }

}
