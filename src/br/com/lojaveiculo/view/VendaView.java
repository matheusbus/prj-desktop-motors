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
    protected Pessoa cliente;
    protected boolean selecionado;
    private PessoaRepositorio pessoas;
    private VeiculoRepositorio veiculos;
    protected String sCpf;
    protected boolean VeiculoSelecionado;
    protected boolean VendedorSelecionado;
    protected boolean ClienteSelecionado;
  
    
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

        jLabel1 = new javax.swing.JLabel();
        btnSelecionaVeiculo = new javax.swing.JButton();
        btnEfetuarVenda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaVeiculoSelecionado = new javax.swing.JTextArea();
        btnSelecionaVendedor = new javax.swing.JButton();
        lblVenderVeiculo = new javax.swing.JLabel();
        btnSelecionaCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaClienteSelecionado = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaVendedorSelecionado = new javax.swing.JTextArea();
        cbTipoVeiculo = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Carro");

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

        btnEfetuarVenda.setBackground(new java.awt.Color(82, 148, 226));
        btnEfetuarVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEfetuarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnEfetuarVenda.setText("Efetuar Venda");

        txtaVeiculoSelecionado.setEditable(false);
        txtaVeiculoSelecionado.setColumns(20);
        txtaVeiculoSelecionado.setRows(5);
        jScrollPane1.setViewportView(txtaVeiculoSelecionado);

        btnSelecionaVendedor.setText("Selecionar Vendedor");
        btnSelecionaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaVendedorActionPerformed(evt);
            }
        });

        lblVenderVeiculo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblVenderVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        lblVenderVeiculo.setText("Vender Veiculo");

        btnSelecionaCliente.setText("Selecionar Cliente");
        btnSelecionaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionaClienteActionPerformed(evt);
            }
        });

        txtaClienteSelecionado.setColumns(20);
        txtaClienteSelecionado.setRows(5);
        jScrollPane2.setViewportView(txtaClienteSelecionado);

        txtaVendedorSelecionado.setColumns(20);
        txtaVendedorSelecionado.setRows(5);
        jScrollPane3.setViewportView(txtaVendedorSelecionado);

        cbTipoVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carro", "Moto" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(btnEfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(lblVenderVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelecionaVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelecionaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(cbTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVenderVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionaVeiculo)
                    .addComponent(cbTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionaVendedor)
                    .addComponent(btnSelecionaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEfetuarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaVeiculoActionPerformed
        if (cbTipoVeiculo.getSelectedIndex() == 0 ) {
        ConsultaCarroView consultaCarro = new ConsultaCarroView(this);
        consultaCarro.setVisible(true);
    }
        else {
        ConsultaMotoView consultaMoto = new ConsultaMotoView(this);
        consultaMoto.setVisible(true);
        }
    }//GEN-LAST:event_btnSelecionaVeiculoActionPerformed

    private void btnSelecionaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaVendedorActionPerformed
        ConsultaFuncionariosView consultaVendedor = new ConsultaFuncionariosView(this);
        consultaVendedor.setVisible(true);
    }//GEN-LAST:event_btnSelecionaVendedorActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
     if(VendedorSelecionado){
        txtaVendedorSelecionado.setText(vendedor.toString());
     }
     if(VeiculoSelecionado){
       txtaVeiculoSelecionado.setText(veiculo.toString());
     }
     if(ClienteSelecionado){
         txtaClienteSelecionado.setText(cliente.toString());
     }
    }//GEN-LAST:event_formMouseMoved

    private void btnSelecionaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionaClienteActionPerformed
        ConsultaClientesView consultaCliente = new ConsultaClientesView(this);
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_btnSelecionaClienteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEfetuarVenda;
    private javax.swing.JButton btnSelecionaCliente;
    private javax.swing.JButton btnSelecionaVeiculo;
    private javax.swing.JButton btnSelecionaVendedor;
    private javax.swing.JComboBox<String> cbTipoVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblVenderVeiculo;
    private javax.swing.JTextArea txtaClienteSelecionado;
    private javax.swing.JTextArea txtaVeiculoSelecionado;
    private javax.swing.JTextArea txtaVendedorSelecionado;
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
        this.setSize(500, 600);
    }
}