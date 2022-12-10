/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;

import br.com.lojaveiculo.model.Venda;

import java.awt.event.ActionListener;

import java.util.List;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public final class ConsultaVendaView extends TelaBaseConsultaView {

    private DefaultTableModel grid;

    // Construtor chamado na tela inicial
    public ConsultaVendaView() {
        organizaLayout();
    }

    // Construtor chamado na tela de venda
    public ConsultaVendaView(CadastroVendaView venda) {
        organizaLayout();

    }

    @Override
    public void organizaLayout() {
        initComponents();
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        grid = (DefaultTableModel) tblVendas.getModel();
    }

    public void adicionaAcaoAoBtnCadastrar(ActionListener acao) {
        btnCadastrarVenda.addActionListener(acao);
    }

    public void adicionaAcaoAoBtnBuscar(ActionListener acao) {
        btnBuscarVenda.addActionListener(acao);
    }

    public void adicionaAcaoAoBtnOrdenar(ActionListener acao) {
        btnOrdenaVenda.addActionListener(acao);
    }

    public void adicionaAcaoAoBtnRemover(ActionListener acao) {
        btnRemoverVenda.addActionListener(acao);
    }

    public void popularTabela(List<Venda> vendas) {
        for (Venda vend : vendas) {
            grid.addRow(vend.obterDados());
        }

    }

    public int getIDTabelaRegistro() {
        return (Integer) grid.getValueAt(tblVendas.getSelectedRow(), 0);
    }

    public String getFiltro() {
        return txtNumeroVenda.getText();
        
    }
    
    public String getOrdena(){
        return cbOrdena.getSelectedItem().toString();
    }

    public boolean BuscaTabela(int idVenda) {
        int incidencia = -1;
        for (int i = 0; i <= tblVendas.getRowCount() - 1; i++) {
            if (grid.getValueAt(i, 0).equals(idVenda)) {
                incidencia = i;
            }
        }
        if (incidencia != -1) {
            tblVendas.setRowSelectionInterval(incidencia, incidencia);
            return true;
        } else {
            return false;
        }
    }
    
      @Override
    public void limpaSelecao() {
       tblVendas.clearSelection();
    }

    @Override
    public void limparTabela() {
      grid.setRowCount(0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFundo = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnBuscarVenda = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        txtNumeroVenda = new javax.swing.JTextField();
        btnCadastrarVenda = new javax.swing.JButton();
        btnRemoverVenda = new javax.swing.JButton();
        btnOrdenaVenda = new javax.swing.JButton();
        cbOrdena = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Vendas");

        tblVendas.setForeground(new java.awt.Color(255, 255, 255));
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nº Venda", "Data da Venda", "Placa do Veículo", "CPF do Cliente", "CPF do Vendedor", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendas.setToolTipText("");
        tblVendas.setSelectionBackground(new java.awt.Color(34, 110, 157));
        tblVendas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblVendas.setShowGrid(true);
        jScrollPane1.setViewportView(tblVendas);

        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(82, 148, 226))); // NOI18N
        pnlBotoes.setForeground(new java.awt.Color(82, 148, 226));

        btnBuscarVenda.setBackground(new java.awt.Color(82, 148, 226));
        btnBuscarVenda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVenda.setText("Buscar");

        lblPlaca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Nº Venda");

        btnCadastrarVenda.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarVenda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarVenda.setText("Cadastrar");

        btnRemoverVenda.setBackground(new java.awt.Color(82, 148, 226));
        btnRemoverVenda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRemoverVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverVenda.setText("Remover");

        btnOrdenaVenda.setBackground(new java.awt.Color(82, 148, 226));
        btnOrdenaVenda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnOrdenaVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenaVenda.setText("Ordena");

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Placa", "Preço" }));

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(lblPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrdenaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoverVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBotoesLayout.createSequentialGroup()
                            .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNumeroVenda)
                                .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarVenda)))
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(btnOrdenaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        dkpFundo.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(pnlBotoes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpFundoLayout = new javax.swing.GroupLayout(dkpFundo);
        dkpFundo.setLayout(dkpFundoLayout);
        dkpFundoLayout.setHorizontalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFundo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFundo, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVenda;
    private javax.swing.JButton btnCadastrarVenda;
    private javax.swing.JButton btnOrdenaVenda;
    private javax.swing.JButton btnRemoverVenda;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtNumeroVenda;
    // End of variables declaration//GEN-END:variables



}
