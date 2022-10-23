/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.model.Venda;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import java.util.Comparator;


/**
 *
 * @author Matheus
 */
public class RelatorioView extends javax.swing.JFrame {

    private final VendaRepositorio RepositorioDeVendas;
    
    /**
     * Creates new form RelatorioView
     */
    public RelatorioView() {
        initComponents();
        setContentPane(pblFundo);
        setSize(800, 650);
        setLocationRelativeTo(null);
        RepositorioDeVendas = new VendaDAO();
        
        RepositorioDeVendas.getVenda().stream().sorted((Venda v1, Venda v2) -> v1.getCliente().getCpf().compareTo(v2.getCliente().getCpf()));
        
        for(Venda v : RepositorioDeVendas.getVenda()){
            txtDados.append("ID Venda: " + v.getIdVenda() + "\n");
            txtDados.append("Cliente: " + v.getCliente().getNome() + "\n");
            txtDados.append("CPF: " + v.getCliente().getCpf()+ "\n");
            txtDados.append("----------------" + "\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pblFundo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDados.setColumns(20);
        txtDados.setRows(5);
        jScrollPane1.setViewportView(txtDados);

        javax.swing.GroupLayout pblFundoLayout = new javax.swing.GroupLayout(pblFundo);
        pblFundo.setLayout(pblFundoLayout);
        pblFundoLayout.setHorizontalGroup(
            pblFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );
        pblFundoLayout.setVerticalGroup(
            pblFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblFundoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pblFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pblFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pblFundo;
    private javax.swing.JTextArea txtDados;
    // End of variables declaration//GEN-END:variables
}
