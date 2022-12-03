/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;
import br.com.lojaveiculo.dao.VendaDAO;
import br.com.lojaveiculo.repositorio.VendaRepositorio;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public final class ConsultaVendaView extends TelaBaseConsultaView {

    private final VendaRepositorio repositorioDeVendas = new VendaDAO();
    private DefaultTableModel grid;
    private CadastroVendaView venda;
    private VendaRepositorio vendas;
    private int numeroVenda;

    // Construtor chamado na tela inicial
    public ConsultaVendaView() {
        organizaLayout();
    }

    // Construtor chamado na tela de venda
    public ConsultaVendaView(CadastroVendaView venda) {
        organizaLayout();
        this.venda = venda;
        this.vendas = new VendaDAO();
    }

    @Override
    public void organizaLayout() {
        initComponents();
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        grid = (DefaultTableModel) tblVendas.getModel();
        popularTabela(repositorioDeVendas, 4, tblVendas, grid);
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
        btnAlterarVenda1 = new javax.swing.JButton();
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
        btnBuscarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendaActionPerformed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Nº Venda");

        btnCadastrarVenda.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarVenda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarVenda.setText("Cadastrar");
        btnCadastrarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVendaActionPerformed(evt);
            }
        });

        btnRemoverVenda.setBackground(new java.awt.Color(82, 148, 226));
        btnRemoverVenda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRemoverVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverVenda.setText("Remover");
        btnRemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverVendaActionPerformed(evt);
            }
        });

        btnAlterarVenda1.setBackground(new java.awt.Color(82, 148, 226));
        btnAlterarVenda1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAlterarVenda1.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarVenda1.setText("Ordena");
        btnAlterarVenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVenda1ActionPerformed(evt);
            }
        });

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
                .addGap(184, 184, 184)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAlterarVenda1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(cbOrdena, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
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
                        .addComponent(btnAlterarVenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnCadastrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVendaActionPerformed
        abrirTelaCadastro();
    }//GEN-LAST:event_btnCadastrarVendaActionPerformed

    private void btnRemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVendaActionPerformed
        validaRemocao();
    }//GEN-LAST:event_btnRemoverVendaActionPerformed

    private void btnBuscarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendaActionPerformed
        limpaSelecao(tblVendas);
        buscaNaTabela(txtNumeroVenda.getText().toUpperCase());
    }//GEN-LAST:event_btnBuscarVendaActionPerformed

    private void btnAlterarVenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVenda1ActionPerformed
        switch(cbOrdena.getSelectedIndex()){
            case 0 -> {
                ordenaPlaca();   
            }
            case 1 -> {
                ordenaPreco();
            }
        }
    }//GEN-LAST:event_btnAlterarVenda1ActionPerformed

    @Override
    public void abrirTelaCadastro() {
        CadastroVendaView cadVenda = new CadastroVendaView(this);
        cadVenda.setVisible(true);
    }

    public void validaRemocao(){
        if (!(tblVendas.getSelectedRow() != -1)) {
            apresentaMensagem("Nenhum registro foi selecionado.", "Erro de exclusão");
        } else {
            if (0 == criaQuestaoPrgunta("Tem certeza que deseja excluir o registro da lista?", "Confirmar remoção")) {
                removerDaTabela(repositorioDeVendas, 4, tblVendas, grid);
            }
        }
    }
    
    
    @Override
    public void abrirTelaAlterarCadastro(Object obj) {
        //CadastroMotoView altMoto = new CadastroMotoView((Moto) obj);
        //altMoto.setVisible(true);
    }

    public void buscaNaTabela(String placa) {
        int incidencia = -1;
        if (placa.length() == 7) {
            for (int i = 0; i <= tblVendas.getRowCount() - 1; i++) {
                if (grid.getValueAt(i, 0).equals(placa)) {
                    incidencia = i;
                }
            }
            if (incidencia != -1) {
                tblVendas.setRowSelectionInterval(incidencia, incidencia);
            } else {
                apresentaMensagem("Não foi encontrado nenhuma venda com o número'" + numeroVenda + "'.", "Venda não encontrado");
            }
        } else {
            apresentaMensagem("Digite uma placa válida!", "Placa inválida");
        }
    }

    public void ordenaPlaca() {
        repositorioDeVendas.ordenaPlaca();
        limparTabela(grid);
        popularTabela(repositorioDeVendas, 4, tblVendas, grid);
    }

    public void ordenaPreco() {
        repositorioDeVendas.ordenaPreco();
        limparTabela(grid);
        popularTabela(repositorioDeVendas, 4, tblVendas, grid);
    }

    public VendaRepositorio getRepositorioDeVendas() {
        return repositorioDeVendas;
    }

    public DefaultTableModel getGrid() {
        return grid;
    }

    public JTable getTblVendas() {
        return tblVendas;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarVenda1;
    private javax.swing.JButton btnBuscarVenda;
    private javax.swing.JButton btnCadastrarVenda;
    private javax.swing.JButton btnRemoverVenda;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtNumeroVenda;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpaSelecao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void limparTabela() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
