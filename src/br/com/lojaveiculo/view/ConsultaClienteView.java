/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;
import br.com.lojaveiculo.model.Pessoa;
import java.awt.event.ActionListener;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public final class ConsultaClienteView extends TelaBaseConsultaView {

    private DefaultTableModel grid;
    
    // Construtor chamado na tela inicial
    public ConsultaClienteView() {
        organizaLayout();
        this.btnSelecionarCliente.setEnabled(false);
    }

    // Construtor chamado na tela de venda
    public ConsultaClienteView(CadastroVendaView venda) {
        organizaLayout();
        this.btnSelecionarCliente.setEnabled(true);
    }

    @Override
    public void organizaLayout() {
        initComponents();
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        grid = (DefaultTableModel) tblClientes.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFundo = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSelecionarCliente = new javax.swing.JButton();
        btnRemoverCliente = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        txtCPFBuscado = new javax.swing.JTextField();
        lblCPFCliente = new javax.swing.JLabel();
        btnAlterarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Clientes");

        dkpFundo.setPreferredSize(new java.awt.Dimension(940, 464));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "RG", "CNH", "Categoria CNH", "CEP", "Endereço", "Bairro", "Cidade", "Estado", "Telefone", "E-mail", "Whatsapp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setToolTipText("");
        tblClientes.setSelectionBackground(new java.awt.Color(34, 110, 157));
        tblClientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setMinWidth(250);
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(250);
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(250);
            tblClientes.getColumnModel().getColumn(1).setMinWidth(100);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(1).setMaxWidth(100);
            tblClientes.getColumnModel().getColumn(2).setMinWidth(100);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(2).setMaxWidth(100);
            tblClientes.getColumnModel().getColumn(3).setMinWidth(100);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(3).setMaxWidth(100);
            tblClientes.getColumnModel().getColumn(4).setMinWidth(100);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(4).setMaxWidth(100);
            tblClientes.getColumnModel().getColumn(5).setMinWidth(100);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(5).setMaxWidth(100);
            tblClientes.getColumnModel().getColumn(6).setMinWidth(250);
            tblClientes.getColumnModel().getColumn(6).setPreferredWidth(250);
            tblClientes.getColumnModel().getColumn(6).setMaxWidth(250);
            tblClientes.getColumnModel().getColumn(7).setMinWidth(150);
            tblClientes.getColumnModel().getColumn(7).setPreferredWidth(150);
            tblClientes.getColumnModel().getColumn(7).setMaxWidth(150);
            tblClientes.getColumnModel().getColumn(8).setMinWidth(150);
            tblClientes.getColumnModel().getColumn(8).setPreferredWidth(150);
            tblClientes.getColumnModel().getColumn(8).setMaxWidth(150);
            tblClientes.getColumnModel().getColumn(9).setMinWidth(50);
            tblClientes.getColumnModel().getColumn(9).setPreferredWidth(50);
            tblClientes.getColumnModel().getColumn(9).setMaxWidth(50);
            tblClientes.getColumnModel().getColumn(11).setMinWidth(200);
            tblClientes.getColumnModel().getColumn(11).setPreferredWidth(200);
            tblClientes.getColumnModel().getColumn(11).setMaxWidth(200);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setPreferredSize(new java.awt.Dimension(912, 102));

        btnSelecionarCliente.setBackground(new java.awt.Color(82, 148, 226));
        btnSelecionarCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSelecionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarCliente.setText("Selecionar");

        btnRemoverCliente.setBackground(new java.awt.Color(82, 148, 226));
        btnRemoverCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRemoverCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverCliente.setText("Remover");

        btnCadastrarCliente.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setText("Cadastrar ");

        btnBuscarCliente.setBackground(new java.awt.Color(82, 148, 226));
        btnBuscarCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar");

        lblCPFCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCPFCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblCPFCliente.setText("CPF:");

        btnAlterarCliente.setBackground(new java.awt.Color(82, 148, 226));
        btnAlterarCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAlterarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarCliente.setText("Alterar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPFBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(884, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPFBuscado)
                            .addComponent(lblCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemoverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        dkpFundo.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpFundoLayout = new javax.swing.GroupLayout(dkpFundo);
        dkpFundo.setLayout(dkpFundoLayout);
        dkpFundoLayout.setHorizontalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1788, Short.MAX_VALUE))
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 1800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void adicionarAcaoAoBotaoBuscarCliente(ActionListener acao){
        btnBuscarCliente.addActionListener(acao);
    }
    
    public void adicionarAcaoAoBotaoCadastrarCliente(ActionListener acao){
        btnCadastrarCliente.addActionListener(acao);
    }
    
    public void adicionarAcaoAoBotaoRemvoerCliente(ActionListener acao){
        btnRemoverCliente.addActionListener(acao);
    }
    
    public void adicionarAcaoAoBotaoSelecionar(ActionListener acao){
        btnSelecionarCliente.addActionListener(acao);
    }
    
    public void adicionarAcaoAoBotaoAlterarCliente(ActionListener acao){
        btnAlterarCliente.addActionListener(acao);
    }
    
    public void popularTabela(Set<Pessoa> clientes){
        grid.setRowCount(0);
        for (Pessoa cliente : clientes) {
            grid.addRow(cliente.obterDados());
        }
    }

    public void buscaNaTabela() {
        int incidencia = -1;
        if (getFiltroPesquisa().length() == 11) {
            for (int i = 0; i <= tblClientes.getRowCount() - 1; i++) {
                if (grid.getValueAt(i, 1).equals(getFiltroPesquisa())) {
                    incidencia = i;
                }
            }
            if (incidencia != -1) {
                tblClientes.setRowSelectionInterval(incidencia, incidencia);
            } else {
                apresentaMensagem("Não foi encontrado nenhum cliente com o CPF '" + getFiltroPesquisa() + "'.", "Cliente não encontrado");
            }
        } else {
            apresentaMensagem("Digite um CPF válido!", "CPF inválido");
        }
    }

    public DefaultTableModel getGrid() {
        return grid;
    }

    public JTable getTblClientes() {
        return tblClientes;
    }
    
    public String getFiltroPesquisa(){
        return txtCPFBuscado.getText().toUpperCase();
    }
    
    public String getCpfClienteSelecionado(){
        return (String) grid.getValueAt(tblClientes.getSelectedRow(), 1);
    }
    
    public void setBotaoSelecionar(boolean bool){
        btnSelecionarCliente.setEnabled(bool);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnRemoverCliente;
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCPFCliente;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCPFBuscado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpaSelecao() {
        tblClientes.clearSelection();
    }

    @Override
    public void limparTabela() {
        grid.setRowCount(0);
    }

}
