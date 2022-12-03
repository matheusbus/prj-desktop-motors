/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import br.com.lojaveiculo.view.ConsultaVendaView;

/**
 *
 * @author Rafael
 */
public class ConsultaVendaController extends BaseConsultaController {

    private ConsultaVendaView consultaVendaView;
    private VendaRepositorio vendaRepositorio;
    private Venda venda;

    public ConsultaVendaController() {
        this.consultaVendaView = new ConsultaVendaView();
        this.vendaRepositorio = new VendaDAO();
        this.venda = null;
        popularTabela();
    }

    @Override
    public void popularTabela() {
      consultaVendaView.popularTabela(vendaRepositorio.getVenda());
    }

    @Override
    public void inicializarBotoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void exibirTela() {
      consultaVendaView.exibirTela();
    }

    @Override
    public void fecharTela() {
      consultaVendaView.fecharTela();
    }
    
    public void limparTabela(){
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

}
