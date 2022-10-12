/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;
import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rafael
 */
public final class ConsultaFuncionariosView extends TelaBaseConsultaView {

    private final PessoaRepositorio repositorioDePessoas = new PessoaDAO();
    private DefaultTableModel grid;
    private VendaView venda;
    private PessoaRepositorio pessoas;

    public ConsultaFuncionariosView(VendaView venda) {
        organizaLayout();
        this.btnSelecionarFuncionario.setEnabled(true);
        this.venda = venda;
        pessoas = new PessoaDAO();
    }

    public ConsultaFuncionariosView() {
        organizaLayout();
        this.btnSelecionarFuncionario.setEnabled(false);
    }
    
    @Override
    public void organizaLayout() {
        initComponents(); 
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        grid = (DefaultTableModel) tblFuncionarios.getModel();
        repositorioDePessoas.ordenaOrdemAlfabetica();
        popularTabela();
        
    }
           
    public void selecionaItem(String cpf){
       venda.vendedor = pessoas.buscarPessoaPorCPF(cpf); 
       venda.VendedorSelecionado = true;
       setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFundo = new javax.swing.JDesktopPane();
        btnCadastrarVendedor = new javax.swing.JButton();
        btnBuscarFuncionario = new javax.swing.JButton();
        txtCPFBuscado = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        btnCadastrarGerente = new javax.swing.JButton();
        btnRemoverFuncionario = new javax.swing.JButton();
        btnSelecionarFuncionario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(940, 464));
        setResizable(false);

        dkpFundo.setPreferredSize(new java.awt.Dimension(940, 464));

        btnCadastrarVendedor.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarVendedor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarVendedor.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarVendedor.setText("Cadastrar Vendedor");
        btnCadastrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVendedorActionPerformed(evt);
            }
        });

        btnBuscarFuncionario.setBackground(new java.awt.Color(82, 148, 226));
        btnBuscarFuncionario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarFuncionario.setText("Buscar");
        btnBuscarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFuncionarioActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF:");

        btnCadastrarGerente.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarGerente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarGerente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarGerente.setText("Cadastrar Gerente");
        btnCadastrarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarGerenteActionPerformed(evt);
            }
        });

        btnRemoverFuncionario.setBackground(new java.awt.Color(82, 148, 226));
        btnRemoverFuncionario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRemoverFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverFuncionario.setText("Remover");
        btnRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFuncionarioActionPerformed(evt);
            }
        });

        btnSelecionarFuncionario.setBackground(new java.awt.Color(82, 148, 226));
        btnSelecionarFuncionario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSelecionarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarFuncionario.setText("Selecionar");
        btnSelecionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarFuncionarioActionPerformed(evt);
            }
        });

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "CPF", "Telefone", "Salário", "Data Admissão", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblFuncionarios.setToolTipText("");
        tblFuncionarios.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(tblFuncionarios);

        dkpFundo.setLayer(btnCadastrarVendedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnBuscarFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(txtCPFBuscado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(lblCPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnCadastrarGerente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnRemoverFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(btnSelecionarFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpFundoLayout = new javax.swing.GroupLayout(dkpFundo);
        dkpFundo.setLayout(dkpFundoLayout);
        dkpFundoLayout.setHorizontalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dkpFundoLayout.createSequentialGroup()
                        .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPFBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelecionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dkpFundoLayout.createSequentialGroup()
                        .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPFBuscado, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarFuncionario))
                    .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnCadastrarGerente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelecionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dkpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dkpFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFuncionarioActionPerformed
        limpaSelecao();
        buscaNaTabela(txtCPFBuscado.getText().toUpperCase());
    }//GEN-LAST:event_btnBuscarFuncionarioActionPerformed

    private void btnCadastrarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarGerenteActionPerformed
        CadastroGerenteView cadastroGerente = new CadastroGerenteView(this);
        cadastroGerente.setVisible(true);
    }//GEN-LAST:event_btnCadastrarGerenteActionPerformed

    private void btnSelecionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarFuncionarioActionPerformed
        if (grid.getValueAt(tblFuncionarios.getSelectedRow(), 5).equals("Vendedor")) {
        String cpf = (String) grid.getValueAt(tblFuncionarios.getSelectedRow(), 1);
        selecionaItem(cpf);
        }
        else
            apresentaMensagem("Selecione um vendedor", "ERRO");
    }//GEN-LAST:event_btnSelecionarFuncionarioActionPerformed

    private void btnRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFuncionarioActionPerformed
        removerDaTabela();
    }//GEN-LAST:event_btnRemoverFuncionarioActionPerformed

    private void btnCadastrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVendedorActionPerformed
        CadastroVendedorView cadastroVendedor = new CadastroVendedorView(this);
        cadastroVendedor.setVisible(true);
    }//GEN-LAST:event_btnCadastrarVendedorActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFuncionario;
    private javax.swing.JButton btnCadastrarGerente;
    private javax.swing.JButton btnCadastrarVendedor;
    private javax.swing.JButton btnRemoverFuncionario;
    private javax.swing.JButton btnSelecionarFuncionario;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtCPFBuscado;
    // End of variables declaration//GEN-END:variables

    @Override
    public void abrirTelaCadastro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void limpaSelecao() {
        // Limpar seleção da linha atual na tabela
        tblFuncionarios.clearSelection();
    }

    @Override
    public void removerDaTabela() {
        if (!(tblFuncionarios.getSelectedRow() == -1)) {
            String CPF = (String) grid.getValueAt(tblFuncionarios.getSelectedRow(), 1);
            repositorioDePessoas.removerPessoa(CPF);
            limparTabela();
            popularTabela();
        } else {
            apresentaMensagem("Nenhum funcionário foi selecionado.", "Erro de exclusão");
        }
    }

    @Override
    public void apresentaMensagem(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }

 

    @Override
    public void popularTabela() {
        limparTabela();
        tblFuncionarios.getModel();
        Set<Pessoa> funcionarios = repositorioDePessoas.getFuncionarios();

        for (Pessoa func :funcionarios) {
                grid.addRow(func.obterDados());

            }
        }


    @Override
    public void limparTabela() {
        grid.setRowCount(0);
    }

    @Override
    public void buscaNaTabela(String cpf) {
        int incidencia = -1;
        if (cpf.length() == 11) {
            for (int i = 0; i <= tblFuncionarios.getRowCount() - 1; i++) {
                if (grid.getValueAt(i, 1).equals(cpf)) {
                    incidencia = i;
                }
            }
            if (incidencia != -1) {
                tblFuncionarios.setRowSelectionInterval(incidencia, incidencia);
            } else {
                apresentaMensagem("Não foi encontrado nenhum funcionário com o '" + cpf + "'.", "Funcionário não encontrado");
            }
        } else {
            apresentaMensagem("Digite um CPF válido!", "CPF inválido");
        }

    }

    @Override
    public void abrirTelaAlterarCadastro(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
