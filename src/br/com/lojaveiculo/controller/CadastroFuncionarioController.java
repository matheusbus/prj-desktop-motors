/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.model.Funcionario;
import br.com.lojaveiculo.model.Gerente;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.model.Vendedor;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.view.CadastroFuncionariosView;
import java.awt.event.ActionEvent;

/**
 *
 * @author Rafael
 */
public class CadastroFuncionarioController extends BaseCadastroController {

    private CadastroFuncionariosView cadastroFuncionariosView;
    private Funcionario modeloFuncionario;
    private PessoaRepositorio pessoasRepositorio;
    private ConsultaFuncionarioController consultaFuncionarioController;

    public CadastroFuncionarioController() {
        this.cadastroFuncionariosView = new CadastroFuncionariosView();
        this.pessoasRepositorio = new PessoaDAO();
        inicializarBotoes();
    }

    public CadastroFuncionarioController(ConsultaFuncionarioController consultaFuncionarioController) {
        this.cadastroFuncionariosView = new CadastroFuncionariosView();
        this.pessoasRepositorio = new PessoaDAO();
        this.consultaFuncionarioController = consultaFuncionarioController;
        inicializarBotoes();
    }

    @Override
    public void inicializarBotoes() {
        cadastroFuncionariosView.adicionaAcaoAoBotaoCadastrar((ActionEvent e) -> {
            acaoCadastrar();
        });
        cadastroFuncionariosView.adicionarAcaoAoBotaoCancelar((ActionEvent e) -> {
            acaoCancelar();
        });
    }

    @Override
    public boolean verificaCamposNulos() {
        return cadastroFuncionariosView.verificaCamposNulos();
    }

    @Override
    public void exibirTela() {
        cadastroFuncionariosView.exibirTela();
    }

    @Override
    public void fecharTela() {
        cadastroFuncionariosView.fecharTela();
    }

    @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        cadastroFuncionariosView.apresentaMensagem(mensagem, titulo);
    }

    public void acaoCadastrar() {

        String sCPF = cadastroFuncionariosView.getCPF();

        if (verificaExistenciaCPF(sCPF)) {
            if (verificaLengthCPF(sCPF)) {
                if (!verificaCamposNulos()) {
                    try {
                        String sNome = cadastroFuncionariosView.getNome();
                        String sCpf = cadastroFuncionariosView.getCPF();
                        String sTelefone = cadastroFuncionariosView.getTelefone();
                        Double dSalario = Double.parseDouble(cadastroFuncionariosView.getSalario());
                        Double dComissao = Double.parseDouble(cadastroFuncionariosView.getComissao());
                        long lRg = Long.parseLong(cadastroFuncionariosView.getRG());
                        String sCep = cadastroFuncionariosView.getCEP();
                        String sEndereco = cadastroFuncionariosView.getEndereco();
                        String sBairro = cadastroFuncionariosView.getBairro();
                        String sCidade = cadastroFuncionariosView.getCidade();
                        String sEstado = cadastroFuncionariosView.getEstado();
                        String sEmail = cadastroFuncionariosView.getEmail();
                        String sBanco = cadastroFuncionariosView.getBanco();
                        int iAgencia = Integer.parseInt(cadastroFuncionariosView.getAgencia());
                        int iContaCorrente = Integer.parseInt(cadastroFuncionariosView.getContaCorrente());

                        if (cadastroFuncionariosView.getTipoFuncionario() == 0) {
                            Pessoa p = new Gerente(sNome, sCpf, lRg, sCep, sEndereco, sBairro, sCidade, sEstado, sTelefone, sEmail, dSalario, sBanco, iAgencia, iContaCorrente);
                            pessoasRepositorio.adicionarPessoa(p);
                            apresentarMensagem("Gerente cadastrado com sucesso", "Sucesso");
                            fecharTela();
                        } else {
                            Pessoa p = new Vendedor(sNome, sCpf, lRg, sCep, sEndereco, sBairro, sCidade, sEstado, sTelefone, sEmail, dSalario, sBanco, iAgencia, iContaCorrente, dComissao);
                            pessoasRepositorio.adicionarPessoa(p);
                            apresentarMensagem("Vendedor cadastrado com sucesso", "Sucesso");
                            fecharTela();
                        }
                        if (consultaFuncionarioController != null) {
                            consultaFuncionarioController.limparTabela();
                            consultaFuncionarioController.popularTabela();
                        }
                    } catch (NumberFormatException ex) {
                        apresentarMensagem("Algum campo está com formato diferente do solicitado.", "Erro");
                    }

                } else {
                    apresentarMensagem("Preencha todos os campos", "Erro");
                }
            } else {
                apresentarMensagem("CPF inválido, digite novamente", "Erro");
            }
        } else {
            apresentarMensagem("CPF já consta no sistema", "Erro");
        }
    }

    public void acaoCancelar() {
        cadastroFuncionariosView.fecharTela();
    }

    public boolean verificaExistenciaCPF(String cpf) {
        if (pessoasRepositorio.buscarPessoaPorCPF(cpf) == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaLengthCPF(String cpf) {
        return cadastroFuncionariosView.verificaLengthCpf(cpf);
    }

}
