package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseCadastroView;
import br.com.lojaveiculo.dao.PessoaDAO;
import br.com.lojaveiculo.model.Funcionario;
import br.com.lojaveiculo.model.Gerente;
import br.com.lojaveiculo.model.Pessoa;
import br.com.lojaveiculo.model.Vendedor;
import br.com.lojaveiculo.repositorio.PessoaRepositorio;
/**
 *
 * @author eduar
 */
public final class CadastroFuncionariosView extends TelaBaseCadastroView {

    private final PessoaRepositorio pessoas = new PessoaDAO();
    private ConsultaFuncionariosView consultaFuncionario = null;
    private Funcionario func;

    /**
     * Creates new form CadastroFuncionario
     *
     * @param consultaFuncView
     */
    public CadastroFuncionariosView(ConsultaFuncionariosView consultaFuncView) {
        organizaLayout();
        consultaFuncionario = consultaFuncView;
    }

    public CadastroFuncionariosView() {
        organizaLayout();
    }
    
    public CadastroFuncionariosView(ConsultaFuncionariosView consultaFuncionario, Funcionario func){
        organizaLayout();
        this.consultaFuncionario = consultaFuncionario;
        this.func = func;
        this.lblTitulo.setText("Alterar funcionário");
        this.btnCadFuncionario.setText("Alterar");
        this.cbTipoFuncionario.setEnabled(false);
        this.txtNome.setText(func.getNome());
        this.txtCpf.setText(func.getCpf());
        this.txtRg.setText(Long.toString(func.getRg()));
        this.txtCep.setText(func.getCep());
        this.txtBairro.setText(func.getBairro());
        this.txtCidade.setText(func.getCidade());
        this.txtEndereco.setText(func.getEndereco());
        this.cbEstado.setSelectedItem(func.getEstado());
        this.cbBanco.setSelectedItem(func.getBanco());
        this.txtAgencia.setText(Integer.toString(func.getAgencia()));
        this.txtContaCorrente.setText(Integer.toString(func.getContaCorrente()));
        this.txtEmail.setText(func.getEmail());
        this.txtSalario.setText(Double.toString(func.getSalario()));
        this.txtTelefone.setText(func.getTelefone());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadFuncionario = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        pnlDadosPessoais = new javax.swing.JPanel();
        txtRg = new javax.swing.JTextField();
        lblRg = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnCancela = new javax.swing.JButton();
        pnlEndereco = new javax.swing.JPanel();
        lblCep = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        pnlContato = new javax.swing.JPanel();
        txtTelefone = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblBanco = new javax.swing.JLabel();
        cbBanco = new javax.swing.JComboBox<>();
        lblAgencia = new javax.swing.JLabel();
        txtAgencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtContaCorrente = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtComissao = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        cbTipoFuncionario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionários");
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

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Cadastrar Funcionário");

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblRg.setText("RG");

        lblCpf.setText("CPF");

        lblNome.setText("Nome");

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCpf)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRg)
                    .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(286, 286, 286))
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(lblRg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
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

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblCep.setText("CEP");

        lblEndereco.setText("Endereço");

        lblBairro.setText("Bairro");

        lblCidade.setText("Cidade");

        jLabel2.setText("Estado");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblCidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblEndereco)
                    .addComponent(lblBairro)
                    .addComponent(lblCidade)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pnlContato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblTelefone.setText("Telefone");

        lblEmail.setText("E-mail");

        javax.swing.GroupLayout pnlContatoLayout = new javax.swing.GroupLayout(pnlContato);
        pnlContato.setLayout(pnlContatoLayout);
        pnlContatoLayout.setHorizontalGroup(
            pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContatoLayout.createSequentialGroup()
                        .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202))
        );
        pnlContatoLayout.setVerticalGroup(
            pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados trabalhistas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        lblBanco.setText("Banco");

        cbBanco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbBanco.setForeground(new java.awt.Color(255, 255, 255));
        cbBanco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Itau Unibanco", "Bradesco", "Banco do Brasil", "Santander", "NuBank", "C6 Bank", "Banrisul", "Banco Pan" }));

        lblAgencia.setText("Agência");

        jLabel1.setText("C. Corrente");

        lblSalario.setForeground(new java.awt.Color(255, 255, 255));
        lblSalario.setText("Salário");

        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setText("Comissão (%)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBanco))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAgencia)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBanco)
                            .addComponent(lblAgencia)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContaCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        cbTipoFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Vendedor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadFuncionarioActionPerformed
        if(this.func == null){
            cadastrarFuncionario();
        } else {
            alterarFuncionario(func);
        }
    }//GEN-LAST:event_btnCadFuncionarioActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    public void cadastrarFuncionario() {
        if (verificaExistenciaCPF(txtCpf.getText())) {
            if (verificaLengthCpf(txtCpf.getText())) {
                if (!verificaCamposNulos()) {
                    try {
                        String sNome = txtNome.getText();
                        String sCpf = txtCpf.getText();
                        String sTelefone = txtTelefone.getText();
                        String sSalario = txtSalario.getText();
                        String sComissao = txtComissao.getText();
                        Double dSalario = Double.valueOf(sSalario);
                        Double dComissao = Double.valueOf(sComissao);
                        long lRg = Long.parseLong(txtRg.getText());
                        String sCep = txtCep.getText();
                        String sEndereco = txtEndereco.getText();
                        String sBairro = txtBairro.getText();
                        String sCidade = txtCidade.getText();
                        String sEstado = cbEstado.getItemAt(cbEstado.getSelectedIndex());
                        String sEmail = txtEmail.getText();
                        String sPisPasep = "";
                        String sBanco = cbBanco.getItemAt(cbBanco.getSelectedIndex());
                        int iAgencia = Integer.parseInt(txtAgencia.getText());
                        int iContaCorrente = Integer.parseInt(txtContaCorrente.getText());

                        if (cbTipoFuncionario.getSelectedIndex() == 0) {
                            Pessoa p = new Gerente(sNome, sCpf, lRg, sCep, sEndereco, sBairro, sCidade, sEstado, sTelefone, sEmail, dSalario, sPisPasep, sBanco, iAgencia, iContaCorrente);
                            pessoas.adicionarPessoa(p);
                            apresentaMensagem("Gerente cadastrado com sucesso", "Sucesso");
                            this.dispose();
                        } else {
                            Pessoa p = new Vendedor(sNome, sCpf, lRg, sCep, sEndereco, sBairro, sCidade, sEstado, sTelefone, sEmail, dSalario, sPisPasep, sBanco, iAgencia, iContaCorrente, dComissao);
                            pessoas.adicionarPessoa(p);
                            apresentaMensagem("Vendedor cadastrado com sucesso", "Sucesso");
                            this.dispose();
                        }
                        if (consultaFuncionario != null) {
                            consultaFuncionario.limparTabela(consultaFuncionario.getGrid());
                            consultaFuncionario.popularTabela(consultaFuncionario.getRepositorioDePessoas(), 3, consultaFuncionario.getTblFuncionarios(), consultaFuncionario.getGrid());
                        }
                    } catch (NumberFormatException ex) {
                        apresentaMensagem("Algum campo está com formato diferente do solicitado.", "Erro");
                    }

                } else {
                    //verificar, não está aparecendo erro na tela
                    apresentaMensagem("Preencha todos os campos", "Erro");
                }
            } else {
                apresentaMensagem("CPF inválido, digite novamente", "Erro");
            }
        } else {
            apresentaMensagem("CPF já consta no sistema", "Erro");
        }
    }

    public void alterarFuncionario(Funcionario func){
        if (verificaLengthCpf(txtCpf.getText())) {
            if (verificaCamposNulos()) {
                pessoas.removerPessoa(func.getCpf());
                func.setNome(txtNome.getText());
                func.setCpf(txtCpf.getText());
                func.setRg(Long.parseLong(txtRg.getText()));
                func.setCep(txtCep.getText());
                func.setEndereco(txtEndereco.getText());
                func.setBairro(txtBairro.getText());
                func.setCidade(txtCidade.getText());
                func.setEstado(cbEstado.getSelectedItem().toString());
                func.setTelefone(txtTelefone.getText());
                func.setEmail(txtEmail.getText().toLowerCase());
                pessoas.adicionarPessoa(func);                
                consultaFuncionario.popularTabela(consultaFuncionario.getRepositorioDePessoas(), 3, consultaFuncionario.getTblFuncionarios(), consultaFuncionario.getGrid());

                apresentaMensagem("Registro alterado com sucesso.", "Alteração realizada");
                this.dispose();
            } else {
                apresentaMensagem("Preencha todos os campos!", "Erro na alteração");
            }
        } else {
            apresentaMensagem("O CPF digitado é inválido.", "Erro na alteração");
        }
    }
    
    public boolean verificaExistenciaCPF(String cpf) {
        return pessoas.buscarPessoaPorCPF(cpf) == null;
    }

    public boolean verificaLengthCpf(String cpf) {
        return cpf.length() == 11;
    }
    
    @Override
    public void organizaLayout() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(900, 550);
    }

    @Override
    public boolean verificaCamposNulos() {
        if (((txtCpf.getText().trim().equals("")) || (txtNome.getText().trim().equals("")) || (txtTelefone.getText().trim().equals("")) || (txtSalario.getText().trim().equals("")) || (txtComissao.getText().trim().equals(""))
                || txtAgencia.getText().trim().equals("")) || (txtBairro.getText().trim().equals("")) || (txtCep.getText().trim().equals("")) || (txtCidade.getText().trim().equals(""))
                || (txtContaCorrente.getText().trim().equals("")) || (txtEndereco.getText().trim().equals("")) || (txtRg.getText().trim().equals("")) || (txtTelefone.getText().trim().equals(""))) {
            return true;
        } else {
            return false;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadFuncionario;
    private javax.swing.JButton btnCancela;
    private javax.swing.JComboBox<String> cbBanco;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbTipoFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgencia;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRg;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlContato;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComissao;
    private javax.swing.JTextField txtContaCorrente;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
