/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Cliente;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.model.Vendedor;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import br.com.lojaveiculo.view.CadastroVendaView;
import java.awt.event.ActionEvent;

public class CadastroVendaController extends BaseCadastroController {

    private CadastroVendaView cadastroVendaView;
    private Veiculo veiculo;
    private Cliente cliente;
    private Vendedor vendedor;
    private VeiculoRepositorio veiculoRepositorio;
    private VendaRepositorio vendaRepositorio;
    private ConsultaVendaController consultaVendaController;

    public CadastroVendaController() {
        this.cadastroVendaView = new CadastroVendaView();
        this.veiculo = null;
        this.cliente = null;
        this.vendedor = null;
        this.veiculoRepositorio = new VeiculoDAO();
        this.vendaRepositorio = new VendaDAO();
        this.consultaVendaController = new ConsultaVendaController();
        inicializarBotoes();
    }

    @Override
    public boolean verificaCamposNulos() {
        if (!((this.veiculo == null || (this.cliente == null) || (this.vendedor == null)))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void inicializarBotoes() {

        cadastroVendaView.adicionaAcaoAoBtnSelecionarVeiculo((ActionEvent e) -> {
            acaoSelecionarVeiculo();
        });

        cadastroVendaView.adicionaAcaoAoBtnSelecionarVendedor((ActionEvent e) -> {
            acaoSelecionarVendedor();
        });

        cadastroVendaView.adicionaAcaoAoBtnSelecionarCliente((ActionEvent e) -> {
            acaoSelecionarCliente();
        });

        cadastroVendaView.adicionaAcaoAoBtnEfetuarVenda((ActionEvent e) -> {
            acaoEfetuarVenda();
        });

        cadastroVendaView.adicionaAcaoAoBtnCancelarVenda((ActionEvent e) -> {
            acaoCancelarVenda();
        });
    }

    @Override
    public void exibirTela() {
        cadastroVendaView.exibirTela();
    }

    @Override
    public void fecharTela() {
        cadastroVendaView.fecharTela();
    }

    public void setVeiculo(Veiculo veic) {
        this.veiculo = veic;
    }

    public void setVendedor(Vendedor vend) {
        this.vendedor = vend;
    }

    public void setCliente(Cliente clien) {
        this.cliente = clien;
    }

    public void populaListaVeiculo() {
        cadastroVendaView.populaListaVeiculo(veiculo.toString());
    }

    public void populaListaVendedor() {
        cadastroVendaView.populaListaVendedor(vendedor.toString());
    }

    public void populaListaCliente() {

        cadastroVendaView.populaListaCliente(cliente.toString());
    }

    public void acaoSelecionarVeiculo() {
        if (cadastroVendaView.getTipoVeiculo()== 0){//equalsIgnoreCase("Carro")) {
            ConsultaCarroController consultaCarroController = new ConsultaCarroController(this);
            consultaCarroController.exibirTela();
        } else {
            ConsultaMotoController consultaMotoController = new ConsultaMotoController(this);
            consultaMotoController.exibirTela();
        }

    }

    public void acaoSelecionarVendedor() {
        ConsultaFuncionarioController consultaFuncionarioController = new ConsultaFuncionarioController(this);
        consultaFuncionarioController.exibirTela();
    }

    public void acaoSelecionarCliente() {
        ConsultaClienteController consultaClienteController = new ConsultaClienteController(this);
        consultaClienteController.exibirTela();
    }

    public void acaoEfetuarVenda() {

        if (verificaCamposNulos()) {       
            Venda venda = new Venda(this.veiculo, this.cliente, this.vendedor);
            if (vendaRepositorio.adicionarVenda(venda) == true) {
                veiculoRepositorio.removeVeiculo(veiculo.getPlaca());
                consultaVendaController.popularTabela();
                apresentarMensagem("Venda Efetuada", "Sucesso");
                
            }
        }

    }

    public void acaoCancelarVenda() {

    }

}
