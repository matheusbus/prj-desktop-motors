package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;
import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.model.Funcionario;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import javax.swing.JTable;
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

    // Construtor chamado na tela inicial
    public ConsultaFuncionariosView() {
        organizaLayout();
        this.btnSelecionarFuncionario.setEnabled(false);
    }    
    
    // Construtor chamado na tela de venda
    public ConsultaFuncionariosView(VendaView venda) {
        organizaLayout();
        this.btnSelecionarFuncionario.setEnabled(true);
        this.venda = venda;
        pessoas = new PessoaDAO();
    }

    @Override
    public void organizaLayout() {
        initComponents();
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(1500, 700);
        grid = (DefaultTableModel) tblFuncionarios.getModel();
        popularTabela(repositorioDePessoas, 3, tblFuncionarios, grid);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFundo = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFuncionarios = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnSelecionarFuncionario = new javax.swing.JButton();
        btnCadastrarFuncionário = new javax.swing.JButton();
        btnBuscarFuncionario = new javax.swing.JButton();
        txtCPFBuscado = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        btnRemoverFuncionario = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conulta de Funcionários");
        setPreferredSize(new java.awt.Dimension(940, 464));
        setResizable(false);

        dkpFundo.setPreferredSize(new java.awt.Dimension(1800, 800));
        dkpFundo.setRequestFocusEnabled(false);

        tblFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "CEP", "Endereço", "Bairro", "Cidade", "Estado", "Telefone", "Email", "Salário", "Data Admissão", "Banco", "Agencia", "Conta Corrente", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFuncionarios.setToolTipText("");
        tblFuncionarios.setSelectionBackground(new java.awt.Color(34, 110, 157));
        tblFuncionarios.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblFuncionarios);
        if (tblFuncionarios.getColumnModel().getColumnCount() > 0) {
            tblFuncionarios.getColumnModel().getColumn(0).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(180);
            tblFuncionarios.getColumnModel().getColumn(1).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(2).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(3).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblFuncionarios.getColumnModel().getColumn(4).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(5).setResizable(false);
            tblFuncionarios.getColumnModel().getColumn(5).setPreferredWidth(120);
        }

        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSelecionarFuncionario.setBackground(new java.awt.Color(82, 148, 226));
        btnSelecionarFuncionario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSelecionarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarFuncionario.setText("Selecionar");
        btnSelecionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarFuncionarioActionPerformed(evt);
            }
        });

        btnCadastrarFuncionário.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarFuncionário.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarFuncionário.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionário.setText("Cadastrar");
        btnCadastrarFuncionário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionárioActionPerformed(evt);
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

        btnRemoverFuncionario.setBackground(new java.awt.Color(82, 148, 226));
        btnRemoverFuncionario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRemoverFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverFuncionario.setText("Remover");
        btnRemoverFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFuncionarioActionPerformed(evt);
            }
        });

        btnAlterarFuncionario.setBackground(new java.awt.Color(82, 148, 226));
        btnAlterarFuncionario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAlterarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarFuncionario.setText("Alterar");
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPFBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnCadastrarFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSelecionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(882, Short.MAX_VALUE))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCPFBuscado)
                            .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSelecionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrarFuncionário, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRemoverFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        dkpFundo.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(pnlBotoes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpFundoLayout = new javax.swing.GroupLayout(dkpFundo);
        dkpFundo.setLayout(dkpFundoLayout);
        dkpFundoLayout.setHorizontalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 1849, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFuncionarioActionPerformed
        limpaSelecao(tblFuncionarios);
        buscaNaTabela(txtCPFBuscado.getText().toUpperCase());
    }//GEN-LAST:event_btnBuscarFuncionarioActionPerformed

    private void btnSelecionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarFuncionarioActionPerformed
        if (grid.getValueAt(tblFuncionarios.getSelectedRow(), 15).equals("Vendedor")) {
            String cpf = (String) grid.getValueAt(tblFuncionarios.getSelectedRow(), 1);
            selecionaItem(cpf);
        } else
            apresentaMensagem("Selecione um vendedor", "ERRO");
    }//GEN-LAST:event_btnSelecionarFuncionarioActionPerformed

    private void btnRemoverFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFuncionarioActionPerformed
        validaRemocao();
    }//GEN-LAST:event_btnRemoverFuncionarioActionPerformed

    private void btnCadastrarFuncionárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionárioActionPerformed
        abrirTelaCadastro();
    }//GEN-LAST:event_btnCadastrarFuncionárioActionPerformed

    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed
        try {
            abrirTelaAlterarCadastro(repositorioDePessoas.buscarPessoaPorCPF((String) grid.getValueAt(tblFuncionarios.getSelectedRow(), 1)));
        } catch (Exception ex){
            apresentaMensagem("Nenhum funcionário foi selecionado.", "Erro ao alterar");
        }
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed

    @Override
    public void abrirTelaCadastro() {
        CadastroFuncionariosView cadastroVendedor = new CadastroFuncionariosView(this);
        cadastroVendedor.setVisible(true);
    }    
    
    public void validaRemocao(){
        if (!(tblFuncionarios.getSelectedRow() != -1)) {
            apresentaMensagem("Nenhum registro foi selecionado.", "Erro de exclusão");
        } else {
            if (0 == criaQuestaoPrgunta("Tem certeza que deseja excluir o registro da lista?", "Confirmar remoção")) {
                removerDaTabela(repositorioDePessoas, 3, tblFuncionarios, grid);
            }
        }
    }
    
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
        CadastroFuncionariosView altFunc = new CadastroFuncionariosView(this, (Funcionario) obj);
        altFunc.setVisible(true);
    }
    
    public void selecionaItem(String cpf) {
        venda.vendedor = pessoas.buscarPessoaPorCPF(cpf);
        venda.VendedorSelecionado = true;
        setVisible(false);
    }

    public DefaultTableModel getGrid() {
        return grid;
    }
    
    public PessoaRepositorio getRepositorioDePessoas() {
        return repositorioDePessoas;
    }

    public JTable getTblFuncionarios() {
        return tblFuncionarios;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnBuscarFuncionario;
    private javax.swing.JButton btnCadastrarFuncionário;
    private javax.swing.JButton btnRemoverFuncionario;
    private javax.swing.JButton btnSelecionarFuncionario;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JTable tblFuncionarios;
    private javax.swing.JTextField txtCPFBuscado;
    // End of variables declaration//GEN-END:variables

}
