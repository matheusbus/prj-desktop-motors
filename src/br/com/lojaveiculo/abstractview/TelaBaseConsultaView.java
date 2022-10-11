/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.abstractview;

/**
 *
 * @author Matheus
 */
public abstract class TelaBaseConsultaView extends TelaBaseView {

    public TelaBaseConsultaView() {
        initComponents();
    }
    
    // Método que faz a organização do layout e é chamado no construtor.
    public abstract void organizaLayout();
    
    // Método que é sobrescrito para abrir as telas de cadastro em qualquer tela de consulta
    public abstract void abrirTelaCadastro();
    
    // Métodos comuns para manipulação da tabela na tela de consultas
    public abstract void limpaSelecao();
    public abstract void popularTabela();
    public abstract void removerDaTabela();
    public abstract void limparTabela();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
