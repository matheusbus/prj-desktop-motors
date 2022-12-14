/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.report;

import br.com.lojaveiculo.model.Venda;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Matheus
 * 
 * Falta implementações para o relatório funcionar.
 */
public class ReportMachine {
    
    JasperDesign jasperDesign = null;
    JasperReport jasperReport = null;
    JasperPrint jasperPrint = null;
    InputStream entradaArquivo = null;
    
    private String diretorio;

    public ReportMachine() {
        this.diretorio = System.getProperty("user.dir") + "\\report\\Venda_report.jrxml";
    }

    public String getDiretorio() {
        return diretorio;
    }

    public void setDiretorio(String diretorio) {
        this.diretorio = diretorio;
    }
    
    public void gerarRelatorioVendas(List<Venda> vendas) throws FileNotFoundException{
        
        List<Object[]> listaVendas = new ArrayList<>();
        
        for(Venda v : vendas){
            Object[] obj = new Object[]{v.getIdVenda(), 
                                        v.getDataVenda(), 
                                        v.getVeiculo().getPlaca(), 
                                        v.getCliente().getCpf(), 
                                        v.getVendedor().getCpf(), 
                                        v.getVeiculo().getPreco()};
            listaVendas.add(obj);
        }
        
        for(Object[] obj : listaVendas){
            System.out.println(obj[0] + " | " + obj[1]+ " | " + obj[2]+ " | " + obj[3]+ " | " + obj[4]+ " | " + obj[5]);
        }
        
        // Convertendo a lista para JRBeanCollectionDataSource
        JRBeanCollectionDataSource vendasJRBean = new JRBeanCollectionDataSource(listaVendas);
        
        // Map que espera os parametros do jasper
        Map<String, Object> parametros = new HashMap<>();
        parametros.put("Parametro1", vendasJRBean);
        
        // Entrada do arquivo report
        try {
            entradaArquivo = new FileInputStream(new File(diretorio));
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado: " + ex.getMessage(), "Erro", 0);
        }
        /*
        // Gerar página do relatório
        try {
            jasperDesign = JRXmlLoader.load(entradaArquivo);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar arquivo XML: " + ex.getMessage(), "Erro", 0);
        }*/
        
        try {
            jasperReport = JasperCompileManager.compileReport(entradaArquivo);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao compilar relatório: " + ex.getMessage(), "Erro", 0);
        }
        
        try {
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, new JREmptyDataSource());
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a página do relatório: " + ex.getMessage(), "Erro", 0);
        }
        
        // Exibir o relatório
        JasperViewer.viewReport(jasperPrint, false);
    }
    
    
}
