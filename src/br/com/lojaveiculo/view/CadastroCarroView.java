package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseCadastroView;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.interfaces.ValidaCadastroVeiculo;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author eduar
 */
public final class CadastroCarroView extends TelaBaseCadastroView implements ValidaCadastroVeiculo {

    private final VeiculoRepositorio veiculos = new VeiculoDAO();
    private ConsultaCarroView consultaCarro = null;
    private Carro carro;

    public CadastroCarroView() {
        organizaLayout();
    }

    public CadastroCarroView(ConsultaCarroView consultaCarro) {
        organizaLayout();
        this.consultaCarro = consultaCarro;
    }    
    
    public CadastroCarroView(ConsultaCarroView consultaCarro, Carro carro) {
        organizaLayout();
        this.consultaCarro = consultaCarro;
        this.txtPlaca.setEditable(false);
        this.carro = carro;
        lblTitulo.setText("Alterar Carro");
        btnCadCarro.setText("Alterar");
        txtPlaca.setText(carro.getPlaca());
        txtModelo.setText(carro.getModelo());
        txtMarca.setText(carro.getMarca().getNome());
        txtChassi.setText(carro.getChassi());
        txtCor.setText(carro.getCor());
        cbTipoCarroceria.setSelectedItem(carro.getTipoCarroceria());
        cbAno.setSelectedItem(Integer.toString(carro.getAno()));
        txtPreco.setText(Double.toString(carro.getPreco()));
        cbPorta.setSelectedItem(Integer.toString(carro.getPortas()));
        cbCombustivel.setSelectedItem((String) carro.getTipoCombustivel());

    }

    @Override
    public void organizaLayout() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(860, 475);
        this.add(pnlDados);
        this.add(btnCadCarro);
        this.add(btnCancela);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadCarro = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        pnlDados = new javax.swing.JPanel();
        txtModelo = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        cbCombustivel = new javax.swing.JComboBox<>();
        lblCombustivel = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        cbPorta = new javax.swing.JComboBox<>();
        lblPortas = new javax.swing.JLabel();
        cbAno = new javax.swing.JComboBox<>();
        lblAno = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        lblTipoCarroceria = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        lblChassi = new javax.swing.JLabel();
        cbTipoCarroceria = new javax.swing.JComboBox<>();
        btnCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Carros");

        btnCadCarro.setBackground(new java.awt.Color(82, 148, 226));
        btnCadCarro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadCarro.setText("Cadastrar");
        btnCadCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadCarroActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Novo Carro");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        txtModelo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblModelo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(255, 255, 255));
        lblModelo.setText("Modelo");

        txtPlaca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblPlaca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Placa");

        cbCombustivel.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        cbCombustivel.setForeground(new java.awt.Color(255, 255, 255));
        cbCombustivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Álcool", "Flex", "Diesel" }));

        lblCombustivel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCombustivel.setForeground(new java.awt.Color(255, 255, 255));
        lblCombustivel.setText("Combustível");

        txtMarca.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblMarca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Marca");

        txtPreco.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblPreco.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(255, 255, 255));
        lblPreco.setText("Valor");

        cbPorta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbPorta.setForeground(new java.awt.Color(255, 255, 255));
        cbPorta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        lblPortas.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPortas.setForeground(new java.awt.Color(255, 255, 255));
        lblPortas.setText("Portas");

        cbAno.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbAno.setForeground(new java.awt.Color(255, 255, 255));
        cbAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));

        lblAno.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAno.setForeground(new java.awt.Color(255, 255, 255));
        lblAno.setText("Ano");

        txtCor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblCor.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCor.setForeground(new java.awt.Color(255, 255, 255));
        lblCor.setText("Cor");

        lblTipoCarroceria.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTipoCarroceria.setForeground(new java.awt.Color(255, 255, 255));
        lblTipoCarroceria.setText("Tipo da Carroceria");

        txtChassi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblChassi.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblChassi.setForeground(new java.awt.Color(255, 255, 255));
        lblChassi.setText("Chassi");

        cbTipoCarroceria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cbTipoCarroceria.setForeground(new java.awt.Color(255, 255, 255));
        cbTipoCarroceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hatch compacto", "SUV", "Crossover", "Coupé", "Picape", "Sedan", "Compacto", "Minivan", "Utilitário" }));

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(lblModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                                .addComponent(txtModelo)
                                .addGap(18, 18, 18)))
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDadosLayout.createSequentialGroup()
                                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbCombustivel, 0, 131, Short.MAX_VALUE)
                                        .addComponent(lblCombustivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblPortas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCor)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipoCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbTipoCarroceria, 0, 243, Short.MAX_VALUE)))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(lblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(lblCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbTipoCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblTipoCarroceria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void adicionaAcaoAoBotaoCadastrar(ActionListener acao){
        btnCadCarro.addActionListener(acao);
    }
            
    private void btnCadCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadCarroActionPerformed
        if (this.carro == null) {
            cadastrarCarro();
        } else {
            alterarCadastro(carro);
        }
    }//GEN-LAST:event_btnCadCarroActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelaActionPerformed

    public void cadastrarCarro() {
        if (verificaLengthPlaca(txtPlaca.getText())) {
            if (verificaCamposNulos()) {
                try {
                    String placa = txtPlaca.getText().toUpperCase();
                    String modelo = txtModelo.getText();
                    Marca marca = new Marca(txtMarca.getText());
                    String chassi = txtChassi.getText();
                    String cor = txtCor.getText();
                    String tipoCarroceria = cbTipoCarroceria.getSelectedItem().toString();
                    int ano = Integer.parseInt(cbAno.getSelectedItem().toString());
                    Double preco = Double.valueOf(txtPreco.getText());
                    String tipoCombustivel = cbCombustivel.getItemAt(cbCombustivel.getSelectedIndex());
                    int portas = Integer.parseInt(cbPorta.getSelectedItem().toString());

                    Carro novoCarro = new Carro(placa, modelo, marca, chassi, cor, tipoCarroceria, ano, preco, tipoCombustivel, portas);
                    veiculos.addVeiculo(novoCarro);
                    if (consultaCarro != null) {
                        consultaCarro.limparTabela(consultaCarro.getGrid());
                        consultaCarro.popularTabela(consultaCarro.getRepositorioDeVeiculos(), 1, consultaCarro.getTblCarros(), consultaCarro.getGrid());
                    }
                    apresentaMensagem("Veículo cadastrado com sucesso.", "Cadastro realizado");
                    this.dispose();
                } catch (NumberFormatException ex) {
                    apresentaMensagem("Preencha os campos com valores válidos", "Erro");
                }
            } else {
                apresentaMensagem("Preencha todos os campos", "Erro");
            }

        } else {
            apresentaMensagem("A placa digitada é invalida!", "Erro no cadastro");
        }
    }

    public void alterarCadastro(Carro carro) {
        if (verificaLengthPlaca(txtPlaca.getText())) {
            if (verificaCamposNulos()) {
                try {
                    veiculos.removeVeiculo(carro.getPlaca());
                    carro.setAno(Integer.parseInt(cbAno.getSelectedItem().toString()));
                    carro.setModelo(txtModelo.getText());
                    carro.setPortas(Integer.parseInt(cbPorta.getSelectedItem().toString()));
                    carro.setPreco(Double.parseDouble(txtPreco.getText()));
                    carro.setTipoCombustivel(cbCombustivel.getSelectedItem().toString());
                    carro.setChassi(carro.getChassi());
                    carro.setCor(txtCor.getText());
                    carro.setTipoCarroceria(cbTipoCarroceria.getSelectedItem().toString());
                    veiculos.addVeiculo(carro);
                    consultaCarro.popularTabela(consultaCarro.getRepositorioDeVeiculos(), 1, consultaCarro.getTblCarros(), consultaCarro.getGrid());

                    apresentaMensagem("Veículo alterado com sucesso.", "Alteração realizada");
                    this.dispose();

                } catch (NumberFormatException ex) {
                    apresentaMensagem("Preencha os campos com valores válidos.", "Erro");
                }
            } else {
                apresentaMensagem("Preencha todos os campos!", "Erro na alteração");
            }
        } else {
            apresentaMensagem("A placa digitada é invalida!", "Erro na alteração");
        }
    }

    @Override
    public boolean verificaCamposNulos() {
        if (!((txtModelo.getText().trim().equals("")) || (txtMarca.getText().trim().equals("")) || (txtPlaca.getText().trim().equals(""))
                || (txtPreco.getText().trim().equals("")) || (txtChassi.getText().trim().equals("")))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean verificaLengthPlaca(String placa) {
        return placa.length() == 7;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCarro;
    private javax.swing.JButton btnCancela;
    private javax.swing.JComboBox<String> cbAno;
    private javax.swing.JComboBox<String> cbCombustivel;
    private javax.swing.JComboBox<String> cbPorta;
    private javax.swing.JComboBox<String> cbTipoCarroceria;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblChassi;
    private javax.swing.JLabel lblCombustivel;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPortas;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTipoCarroceria;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

    public ConsultaCarroView getConsultaCarro() {
        return consultaCarro;
    }

    public void setConsultaCarro(ConsultaCarroView consultaCarro) {
        this.consultaCarro = consultaCarro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public JButton getBtnCadCarro() {
        return btnCadCarro;
    }

    public void setBtnCadCarro(JButton btnCadCarro) {
        this.btnCadCarro = btnCadCarro;
    }

    public JButton getBtnCancela() {
        return btnCancela;
    }

    public void setBtnCancela(JButton btnCancela) {
        this.btnCancela = btnCancela;
    }

    public JComboBox<String> getCbAno() {
        return cbAno;
    }

    public void setCbAno(JComboBox<String> cbAno) {
        this.cbAno = cbAno;
    }

    public JComboBox<String> getCbCombustivel() {
        return cbCombustivel;
    }

    public void setCbCombustivel(JComboBox<String> cbCombustivel) {
        this.cbCombustivel = cbCombustivel;
    }

    public JComboBox<String> getCbPorta() {
        return cbPorta;
    }

    public void setCbPorta(JComboBox<String> cbPorta) {
        this.cbPorta = cbPorta;
    }

    public JComboBox<String> getCbTipoCarroceria() {
        return cbTipoCarroceria;
    }

    public void setCbTipoCarroceria(JComboBox<String> cbTipoCarroceria) {
        this.cbTipoCarroceria = cbTipoCarroceria;
    }

    public JPanel getPnlDados() {
        return pnlDados;
    }

    public void setPnlDados(JPanel pnlDados) {
        this.pnlDados = pnlDados;
    }

    public JTextField getTxtChassi() {
        return txtChassi;
    }

    public void setTxtChassi(JTextField txtChassi) {
        this.txtChassi = txtChassi;
    }

    public JTextField getTxtCor() {
        return txtCor;
    }

    public void setTxtCor(JTextField txtCor) {
        this.txtCor = txtCor;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public void setTxtPlaca(JTextField txtPlaca) {
        this.txtPlaca = txtPlaca;
    }

    public JTextField getTxtPreco() {
        return txtPreco;
    }

    public void setTxtPreco(JTextField txtPreco) {
        this.txtPreco = txtPreco;
    }
    
}
