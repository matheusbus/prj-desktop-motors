/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseCadastroView;
import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.model.Vendedor;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public final class CadastroVendedorView extends TelaBaseCadastroView {

    private final PessoaRepositorio pessoas = new PessoaDAO();
    private ConsultaFuncionariosView consulta;

    /**
     * Creates new form CadastroFuncionario
     *
     * @param consultaFuncView
     */
    public CadastroVendedorView(ConsultaFuncionariosView consultaFuncView) {
        organizaLayout();
        consulta = consultaFuncView;
    }

    public CadastroVendedorView() {
        organizaLayout();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadFuncionario = new javax.swing.JButton();
        lblCadastrarGerente1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtSalario = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtComissao = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        btnCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(82, 148, 226));

        btnCadFuncionario.setBackground(new java.awt.Color(82, 148, 226));
        btnCadFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadFuncionario.setText("Cadastrar");
        btnCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadFuncionarioActionPerformed(evt);
            }
        });

        lblCadastrarGerente1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblCadastrarGerente1.setForeground(new java.awt.Color(255, 255, 255));
        lblCadastrarGerente1.setText("Cadastrar Vendedor");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        lblSalario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(255, 255, 255));
        lblSalario.setText("Salário");

        lblCpf.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("CPF");

        lblNome.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome");

        lblCargo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Comissão (%)");

        lblTelefone.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(txtTelefone))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtComissao))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))))
                .addGap(30, 30, 30)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnCancela.setBackground(new java.awt.Color(75, 83, 101));
        btnCancela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancela.setForeground(new java.awt.Color(255, 255, 255));
        btnCancela.setText("Cancelar");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCadastrarGerente1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCadFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrarGerente1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancela, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFuncionarioActionPerformed
        cadastrarVendedor();
    }//GEN-LAST:event_btnCadFuncionarioActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    public void cadastrarVendedor() {
        if (verificaExistenciaCPF(txtCpf.getText())) {
            if (verificaIntegridadeCPF(txtCpf.getText())) {
                if (verificaCamposNulos()) {
                    String sCpf = txtCpf.getText();
                    String sNome = txtNome.getText();
                    String sTelefone = txtTelefone.getText();
                    String sSalario = txtSalario.getText();
                    String sComissao = txtComissao.getText();

                    Double dSalario = Double.parseDouble(sSalario);
                    Double dComissao = Double.parseDouble(sComissao);

                    Pessoa p = new Vendedor(dComissao, dSalario, sNome, sCpf, sTelefone);
                    pessoas.adicionarPessoa(p);
                    if (consulta != null) {
                        consulta.limparTabela();
                        consulta.popularTabela();
                    }
                    apresentaMensagem("Vendedor cadastrado com sucesso", "Sucesso");
                    this.dispose();
                } else {
                    apresentaMensagem("Preencha todos os campos", "Erro");
                }
            } else {
                apresentaMensagem("CPF inválido, digite novamente", "Erro");
            }
        }
        else
            apresentaMensagem("CPF já consta no sistema", "Erro");
    }

    public boolean verificaExistenciaCPF(String cpf) {
        if (pessoas.buscarPessoaPorCPF(cpf) == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificaIntegridadeCPF(String cpf) {
        if (cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadFuncionario;
    private javax.swing.JButton btnCancela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastrarGerente1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtComissao;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    @Override
    public void apresentaMensagem(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }

    @Override
    public void limparCampos() {
        txtCpf.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtSalario.setText("");
        txtComissao.setText("");

    }

    @Override
    public void organizaLayout() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(860, 475);
    }

    @Override
    public boolean verificaCamposNulos() {
        if (!((txtCpf.getText().trim().equals("")) || (txtNome.getText().trim().equals("")) || (txtTelefone.getText().trim().equals("")) || (txtSalario.getText().trim().equals("")) || (txtComissao.getText().trim().equals("")))) {
            return true;
        } else {
            return false;
        }
    }

}
