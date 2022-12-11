/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.report;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Matheus
 */
public class ReportMachine {
    
    JasperDesign jasperDesign = null;
    JasperReport jasperReport = null;
    JasperPrint jasperPrint = null;
    InputStream entradaArquivo = null;
    
    Map<String, Object> parametros = new HashMap<>();
    
    String diretorio = "";

    public ReportMachine() {
        
        this.diretorio = System.getProperty("user.dir") + "\\src\\report\\relatorio_vendas.jrxml";
        
        // Entrada do arquivo report
        
        try {
            entradaArquivo = new FileInputStream(new File(diretorio));
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado: " + ex.getMessage(), "Erro", 0);
        }

        // Gerar página do relatório
        
        try {
            jasperDesign = JRXmlLoader.load(entradaArquivo);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar arquivo XML: " + ex.getMessage(), "Erro", 0);
        }
        
        try {
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao compilar relatório: " + ex.getMessage(), "Erro", 0);
        }
        
        try {
            jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, new JREmptyDataSource());
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a página do relatório: " + ex.getMessage(), "Erro", 0);
        }
        
        // Exibir o relatório
        
        JasperViewer.viewReport(jasperPrint, false);
    }
    
    
}
