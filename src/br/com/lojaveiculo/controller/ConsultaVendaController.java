package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import br.com.lojaveiculo.view.ConsultaVendaView;
import java.awt.event.ActionEvent;

public class ConsultaVendaController extends BaseConsultaController {

    private ConsultaVendaView consultaVendaView;
    private VendaRepositorio vendaRepositorio;
    private Venda venda;

    public ConsultaVendaController() {
        this.consultaVendaView = new ConsultaVendaView();
        this.vendaRepositorio = new VendaDAO();
        this.venda = null;
        popularTabela();
        inicializarBotoes();
    }

    @Override
    public void popularTabela() {
        limparTabela();
        consultaVendaView.popularTabela(vendaRepositorio.getVenda());
    }

    @Override
    public void inicializarBotoes() {
        consultaVendaView.adicionaAcaoAoBtnCadastrar((ActionEvent e) -> {
            acaoCadastrar();
        });

        consultaVendaView.adicionaAcaoAoBtnRemover((ActionEvent e) -> {
            acaoRemover();
        });

        consultaVendaView.adicionaAcaoAoBtnBuscar((ActionEvent e) -> {
            acaoBuscar();
        });

        consultaVendaView.adicionaAcaoAoBtnOrdenar((ActionEvent e) -> {
            acaoOrdenar();
        });
    }

    @Override
    public void exibirTela() {
        consultaVendaView.exibirTela();
    }

    @Override
    public void fecharTela() {
        consultaVendaView.fecharTela();
    }

    public void limparTabela() {
        consultaVendaView.limparTabela();
    }

    public void ordenaPlaca() {
        vendaRepositorio.ordenaPlaca();
        limparTabela();
        popularTabela();
    }

    public void ordenaPreco() {
        vendaRepositorio.ordenaPreco();
        limparTabela();
        popularTabela();
    }

    public void acaoCadastrar() {
        CadastroVendaController cadastroVendaContoller = new CadastroVendaController();
        cadastroVendaContoller.exibirTela();
    }

    public void acaoRemover() {
        try {
            if (0 == consultaVendaView.criaQuestaoPrgunta("Tem certeza que deseja remover o registro selecionado?", "Confirmação de exclusão")) {
                vendaRepositorio.removeVenda(consultaVendaView.getIDTabelaRegistro());
                limparTabela();
                popularTabela();
                apresentarMensagem("Registro removido com sucesso", "Êxito");
            }
        } catch (Exception e) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro");
        }
    }

    public void acaoOrdenar() {
        if (consultaVendaView.getOrdena().equalsIgnoreCase("Placa")) {
            vendaRepositorio.ordenaPlaca();
            popularTabela();
        } else {
            vendaRepositorio.ordenaPreco();
            popularTabela();
        }
    }

    public void acaoBuscar() {
        try {
            consultaVendaView.limpaSelecao();
            if (consultaVendaView.getFiltro().equals("")) {
                apresentarMensagem("Digite um ID valído", "Erro");
            } else {
                int idVenda = Integer.parseInt(consultaVendaView.getFiltro());
                if (consultaVendaView.BuscaTabela(idVenda)) {
                } else {
                    apresentarMensagem("Não foi encontrado nenhuma venda com esse ID", "Venda não encontrada");
                }
            }
        } catch (Exception e) {
            apresentarMensagem("ID inválido", "Erro");
        }
    }
}
