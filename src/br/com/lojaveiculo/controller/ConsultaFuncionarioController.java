/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.excecoes.VendaException;
import br.com.lojaveiculo.model.Vendedor;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.view.ConsultaFuncionariosView;
import java.awt.event.ActionEvent;

public class ConsultaFuncionarioController extends BaseConsultaController {

    private ConsultaFuncionariosView ConsultaFuncionariosView;
    private PessoaRepositorio pessoasRepositorio;
    private CadastroVendaController cadastroVendaController;

    public ConsultaFuncionarioController() {
        this.ConsultaFuncionariosView = new ConsultaFuncionariosView();
        this.pessoasRepositorio = new PessoaDAO();
        inicializarBotoes();
        popularTabela();
        setBotaoSelecionar(false);
    }

    public ConsultaFuncionarioController(CadastroVendaController cadastroVendaController) {
        this.ConsultaFuncionariosView = new ConsultaFuncionariosView();
        this.pessoasRepositorio = new PessoaDAO();
        this.cadastroVendaController = cadastroVendaController;
        inicializarBotoes();
        popularTabela();
        setBotaoSelecionar(true);
    }

    @Override
    public void popularTabela() {
        ConsultaFuncionariosView.limparTabela();
        ConsultaFuncionariosView.popularTabela(pessoasRepositorio.getFuncionarios());
    }

    @Override
    public void inicializarBotoes() {
        ConsultaFuncionariosView.adicionarAcaoAoBtnBuscar((ActionEvent e) -> {
            acaoBuscar();
        });
        ConsultaFuncionariosView.adicionarAcaoAoBtnCadastrar((ActionEvent e) -> {
            acaoCadastrar();
        });

        ConsultaFuncionariosView.adicionarAcaoAoBtnRemover((ActionEvent e) -> {
            acaoRemover();
        });

        ConsultaFuncionariosView.adicionarAcaoAoBtnSelecionar((ActionEvent e) -> {
            acaoSelecionar();
        });

    }

    @Override
    public void exibirTela() {
        ConsultaFuncionariosView.exibirTela();
        popularTabela();
    }

    @Override
    public void fecharTela() {
        ConsultaFuncionariosView.fecharTela();
    }

    @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        ConsultaFuncionariosView.apresentaMensagem(mensagem, titulo);
    }

    public void limparTabela() {
        ConsultaFuncionariosView.limparTabela();
    }

    public void acaoRemover() {
        try {
            if (0 == ConsultaFuncionariosView.criaQuestaoPrgunta("Tem certeza que deseja remover o registro selecionado?", "Confirmação de exclusão")) {
                pessoasRepositorio.removerPessoa(ConsultaFuncionariosView.getCPFTabelaRegistro());
                limparTabela();
                popularTabela();
                apresentarMensagem("Registro removido com sucesso", "Êxito");
            }
        } catch (Exception e) {
            apresentarMensagem("Nenhum registro foi selecionado.", "Erro");
        }
    }

    public void acaoCadastrar() {
        CadastroFuncionarioController cadastroFuncionarioController = new CadastroFuncionarioController(this);
        cadastroFuncionarioController.exibirTela();
    }

    public void acaoSelecionar() {
        try {
            verificaVendedorSelecionado();
            String sCPF = ConsultaFuncionariosView.getSelecionaItem();
            cadastroVendaController.setVendedor((Vendedor) pessoasRepositorio.buscarPessoaPorCPF(sCPF));
            cadastroVendaController.populaListaVendedor();
            fecharTela();
        } catch (VendaException ex) {
            apresentarMensagem(ex.getMessage(), "Erro");
        }

    }

    public void acaoBuscar() {
        ConsultaFuncionariosView.limpaSelecao();
        String sCPF = ConsultaFuncionariosView.getFiltro();
        if (sCPF.length() == 11) {
            if (ConsultaFuncionariosView.BuscaTabela(sCPF)) {
                apresentarMensagem("Sucesso", "Sucesso");
            } else {
                apresentarMensagem("Não foi encontrado nenhum funcionário com o CPF", "Funcionário não Encontrado");
            }
        } else {
            apresentarMensagem("Digite um CPF válido!", "CPF inválido");
        }
    }

    public void setBotaoSelecionar(Boolean bool) {
        ConsultaFuncionariosView.setBotaoSelecionar(bool);
    }

    public boolean verificaVendedorSelecionado() throws VendaException {
        if (pessoasRepositorio.buscarPessoaPorCPF(ConsultaFuncionariosView.getCPFTabelaRegistro()) instanceof Vendedor) {
            return true;
        } else {
            throw new VendaException("Selecione um vendedor");
        }

    }

}
