/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.controller;

import br.com.lojaveiculo.comparator.ComparadorPrecoVenda;
import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.report.ReportMachine;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import br.com.lojaveiculo.view.EmissaoRelatorioView;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Matheus
 */
public final class EmissaoRelatorioController extends BaseController{

    private final EmissaoRelatorioView emissaoRelatorioView;
    private final VendaRepositorio vendaRepositorio;
    private final ReportMachine geradorRelatorio;

    public EmissaoRelatorioController() {
        this.emissaoRelatorioView = new EmissaoRelatorioView();
        inicializarBotoes();
        vendaRepositorio = new VendaDAO();
        geradorRelatorio = new ReportMachine();
    }
    
    @Override
    public void inicializarBotoes() {
        emissaoRelatorioView.adicionaAcaoAoBotaoEmitir((ActionEvent e) -> {
            acaoEmitirRelatorio();
        });
        emissaoRelatorioView.adicionaAcaoAoBotaoLimpar((ActionEvent e) -> {
            limparRelatorioEmitido();
        });
        emissaoRelatorioView.adicionaAcaoAoBotaoExportar((ActionEvent e) -> {
            try {
                exportaRelatorio();
            } catch (JRException ex) {
                apresentarMensagem("Erro ao gerar relatório: " + ex.getMessage(), "Erro");
            } catch (FileNotFoundException ex) {
                apresentarMensagem("Arquivo do relatório não encontrado. Diretório que está tentando pegar: " + geradorRelatorio.getDiretorio(), "Erro");
            }
        });
    }
    
    public void acaoEmitirRelatorio() {
        limparRelatorioEmitido();
        chamaOrdenacaoEImprime();
    }
    
    public void limparRelatorioEmitido(){
        emissaoRelatorioView.limparDadosEmitidos();
    }
    
    public void exportaRelatorio() throws JRException, FileNotFoundException{
        geradorRelatorio.gerarRelatorioVendas(vendaRepositorio.getVenda());
        //apresentarMensagem("A função de exportação de relatórios ainda não foi totalmente implementada. Será ajustada posteriormente.", "Função não implementada");
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
    
    public void chamaOrdenacaoEImprime(){
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

    @Override
    public void apresentarMensagem(String mensagem, String titulo) {
        emissaoRelatorioView.apresentaMensagem(mensagem, titulo);
    }
    
}
