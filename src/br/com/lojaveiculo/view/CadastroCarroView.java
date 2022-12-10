package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseCadastroView;
import java.awt.event.ActionListener;

/**
 *
 * @author eduar
 */
public final class CadastroCarroView extends TelaBaseCadastroView {

    public CadastroCarroView() {
        organizaLayout();
    }

    @Override
    public void organizaLayout() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(860, 475);
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
        btnAlterarCarro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Carros");

        btnCadCarro.setBackground(new java.awt.Color(82, 148, 226));
        btnCadCarro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadCarro.setText("Cadastrar");

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
                            .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
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
                            .addComponent(cbTipoCarroceria, 0, 244, Short.MAX_VALUE)))
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

        btnAlterarCarro.setBackground(new java.awt.Color(82, 148, 226));
        btnAlterarCarro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAlterarCarro.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarCarro.setText("Alterar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void adicionaAcaoBtnCadastrar(ActionListener acao) {
        btnCadCarro.addActionListener(acao);
    }

    public void adicionaAcaoAoBtnAlterar(ActionListener acao) {
        btnAlterarCarro.addActionListener(acao);
    }

    public void adicionaAcaoBtnCancelar(ActionListener acao) {
        btnCancela.addActionListener(acao);
    }

    public void inicializaCadastro() {
        btnAlterarCarro.setEnabled(false);
        btnAlterarCarro.setVisible(false);
    }

    public void inicializaAlteracao() {
        btnCadCarro.setEnabled(false);
        btnCadCarro.setVisible(false);
    }
    
    @Override
    public void exibirTela() {
        super.exibirTela();
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

    public boolean verificaLengthPlaca(String placa) {
        return placa.length() == 7;
    }

    public String getChassi() {
        return txtChassi.getText();
    }

    public void setChassi(String chassi) {
        this.txtChassi.setText(chassi);
    }

    public String getCor() {
        return txtCor.getText();
    }

    public void setCor(String cor) {
        this.txtCor.setText(cor);
    }

    public String getMarca() {
        return txtMarca.getText();
    }

    public void setMarca(String marca) {
        this.txtMarca.setText(marca);
    }

    public String getModelo() {
        return txtModelo.getText();
    }

    public void setModelo(String modelo) {
        this.txtModelo.setText(modelo);
    }

    public String getPlaca() {
        return txtPlaca.getText();
    }

    public void setPlaca(String placa) {
        this.txtPlaca.setText(placa);
    }

    public String getPreco() {
        return txtPreco.getText();
    }

    public void setPreco(String preco) {
        this.txtPreco.setText(preco);
    }

    public String getTipoCarroceria() {
        return cbTipoCarroceria.getSelectedItem().toString();
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.cbTipoCarroceria.setSelectedItem(tipoCarroceria);
    }

    public String getAno() {
        return cbAno.getSelectedItem().toString();
    }

    public void setAno(String ano) {
        this.cbAno.setSelectedItem(ano);
    }

    public String getCombustivel() {
        return cbCombustivel.getSelectedItem().toString();
    }

    public void setCombustivel(String combustivel) {
        this.cbCombustivel.setSelectedItem(combustivel);
    }

    public String getPorta() {
        return cbPorta.getSelectedItem().toString();
    }

    public void setPorta(String porta) {
        this.cbPorta.setSelectedItem(porta);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCarro;
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

}
