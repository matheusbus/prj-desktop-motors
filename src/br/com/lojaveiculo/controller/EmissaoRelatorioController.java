/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.comparator.ComparadorPrecoVenda;
import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import br.com.lojaveiculo.view.EmissaoRelatorioView;
import java.awt.event.ActionEvent;
import java.util.Collections;

/**
 *
 * @author Matheus
 */
public final class EmissaoRelatorioController extends BaseController{

    private final EmissaoRelatorioView emissaoRelatorioView;
    private final VendaRepositorio vendaRepositorio;

    public EmissaoRelatorioController() {
        this.emissaoRelatorioView = new EmissaoRelatorioView();
        inicializarBotoes();
        vendaRepositorio = new VendaDAO();
    }
    
    @Override
    public void inicializarBotoes() {
        emissaoRelatorioView.adicionaAcaoAoBotaoEmitir((ActionEvent e) -> {
            acaoEmitirRelatorio();
        });
        emissaoRelatorioView.adicionaAcaoAoBotaoLimpar((ActionEvent e) -> {
            limparRelatorioEmitido();
        });
    }
    
    public void acaoEmitirRelatorio(){
        limparRelatorioEmitido();
        
    }
    
    public void limparRelatorioEmitido(){
        emissaoRelatorioView.limparDadosEmitidos();
    }
    
    public void ordenaPorVendedor(){
        Collections.sort(vendaRepositorio.getVenda(), (Venda v1, Venda v2) -> v1.getVendedor().getNome().compareTo(v2.getVendedor().getNome()));        
    }
    
    public void ordenaPorNomeCliente(){
        Collections.sort(vendaRepositorio.getVenda(), (Venda v1, Venda v2) -> v1.getCliente().getNome().compareTo(v2.getCliente().getNome()));
    }
    
    public void ordenaPorPlaca(){
        Collections.sort(vendaRepositorio.getVenda(), (Venda v1, Venda v2) -> v1.getVeiculo().getPlaca().compareTo(v2.getVeiculo().getPlaca()));
    }
    
    public void ordenaPorModelo(){
        Collections.sort(vendaRepositorio.getVenda(), (Venda v1, Venda v2) -> v1.getVeiculo().getModelo().compareTo(v2.getVeiculo().getModelo()));
    }
    
    public void ordenaPorPreco(){
        Collections.sort(vendaRepositorio.getVenda(), new ComparadorPrecoVenda());
    }    
    
    public void chamaOrdenacao(){
        switch(emissaoRelatorioView.getTipoRelatorioSelecionado()){
            case 0 -> {
                ordenaPorNomeCliente();
                emissaoRelatorioView.imprimeDados(vendaRepositorio.getVenda());
            }
            case 1 -> {
                ordenaPorVendedor();
                emissaoRelatorioView.imprimeDados(vendaRepositorio.getVenda());
            }
            case 2 -> {
                ordenaPorPlaca();
                emissaoRelatorioView.imprimeDados(vendaRepositorio.getVenda());
            }
            case 3 -> {
                ordenaPorModelo();
                emissaoRelatorioView.imprimeDados(vendaRepositorio.getVenda());
            }
            case 4 -> {
                ordenaPorPreco();
                emissaoRelatorioView.imprimeDados(vendaRepositorio.getVenda());
            }
        }
    }

    @Override
    public void exibirTela() {
        emissaoRelatorioView.exibirTela();
    }

    @Override
    public void fecharTela() {
        emissaoRelatorioView.fecharTela();
    }
    
}
