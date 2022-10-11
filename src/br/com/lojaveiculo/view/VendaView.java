/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseView;
import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.model.Vendedor;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;

/**
 *
 * @author eduar
 */
public final class VendaView extends TelaBaseView {

    protected Pessoa vendedor;
    protected Veiculo veiculo;
    protected boolean selecionado;
    private PessoaRepositorio pessoas;
    private VeiculoRepositorio veiculos;
    protected String sCpf;
    protected boolean VeiculoSelecionado;
    protected boolean VendedorSelecionado;
  
    
    public VendaView() {
        organizaLayout();
        vendedor = new Vendedor(0.0, 0.0, "", "", "");
        veiculo = new Carro("", "", null, 0, 0, "", 0);
        pessoas = new PessoaDAO();
        veiculos = new VeiculoDAO();
        VendedorSelecionado = false;
        VeiculoSelecionado = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSelecionaVeiculo = new javax.swing.JButton();
        btnEfetuarVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaVeiculoSelecionado = new javax.swing.JTextArea();
        txtVendedorSelecionado = new javax.swing.JTextField();
        btnSelecionaVendedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        btnSelecionaVeiculo.setText("Selecionar Veículo");
        btnSelecionaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaVeiculoActionPerformed(evt);
            }
        });

        btnEfetuarVenda.setText("Efetuar Venda");

        txtaVeiculoSelecionado.setColumns(20);
        txtaVeiculoSelecionado.setRows(5);
        jScrollPane1.setViewportView(txtaVeiculoSelecionado);

        btnSelecionaVendedor.setText("Selecionar Vendedor");
        btnSelecionaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEfetuarVenda)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSelecionaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelecionaVendedor)
                        .addComponent(txtVendedorSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnSelecionaVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionaVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVendedorSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaVeiculoActionPerformed
        ConsultaCarroView consultaCarro = new ConsultaCarroView(this);
        consultaCarro.setVisible(true);
    }//GEN-LAST:event_btnSelecionaVeiculoActionPerformed

    private void btnSelecionaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaVendedorActionPerformed
        ConsultaFuncionariosView consultaVendedor = new ConsultaFuncionariosView(this);
        consultaVendedor.setVisible(true);
    }//GEN-LAST:event_btnSelecionaVendedorActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
     if(VendedorSelecionado){
        txtVendedorSelecionado.setText(vendedor.getNome());
     }
     if(VeiculoSelecionado){
       txtaVeiculoSelecionado.setText(veiculo.toString());
     }
    }//GEN-LAST:event_formMouseMoved



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEfetuarVenda;
    private javax.swing.JButton btnSelecionaVeiculo;
    private javax.swing.JButton btnSelecionaVendedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtVendedorSelecionado;
    private javax.swing.JTextArea txtaVeiculoSelecionado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void apresentaMensagem(String mensagem, String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void organizaLayout() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(400, 400);
    }
}
