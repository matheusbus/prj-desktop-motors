/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.lojaveiculo.report;

import br.com.lojaveiculo.model.Venda;
import java.io.FileNotFoundException;
import java.io.InputStream;
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
 */
public class RelatorioMachine {
    
    private Map<String, Object> parametros = new HashMap<>();
    private JasperDesign jasperDesign = null;
    private JasperReport jasperReport = null;
    private JasperPrint jasperPrint = null;
    private InputStream inputStream = null;
    
    public void gerarRelatorio(List<Venda> vendas) throws JRException{
        
        /*InputStream fonte = RelatorioMachine.class.getResourceAsStream("/report/relatorio_vendas.jrxml");
        JasperReport report = JasperCompileManager.compileReport(fonte);
        JasperPrint print = JasperFillManager.fillReport(report, parametros, collectionVendas);
        //JasperPrint print = JasperFillManager.fillReport(report, null, new JREmptyDataSource());
        JasperViewer.viewReport(print, false);*/
        
        
        JRBeanCollectionDataSource collectionVendas = new JRBeanCollectionDataSource(vendas);
        parametros.put("CollectionVendas", collectionVendas);
        
        // ENTRADA ARQUIVO REPORT
        inputStream = RelatorioMachine.class.getResourceAsStream("/report/relatorio_vendas.jrxml");
        
        // GERAR PAGINA REPORT
        jasperDesign = JRXmlLoader.load(inputStream);
        
        jasperReport = JasperCompileManager.compileReport(jasperDesign);
        
        jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, new JREmptyDataSource());
        
        JasperViewer.viewReport(jasperPrint, false);
            
    }
    
}
