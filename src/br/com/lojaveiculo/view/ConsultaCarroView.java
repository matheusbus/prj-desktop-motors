package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public final class ConsultaCarroView extends TelaBaseConsultaView {

    private final VeiculoRepositorio repositorioDeVeiculos = new VeiculoDAO();
    private DefaultTableModel grid;
    private VendaView venda;
    private VeiculoRepositorio veiculos;
    
    // Construtor chamado na tela inicial
    public ConsultaCarroView() {
        organizaLayout();
        this.btnSelecionarVeiculo.setEnabled(false);
    }
    
    // Construtor chamado na tela de venda
    public ConsultaCarroView(VendaView venda) {
        organizaLayout();
        this.btnSelecionarVeiculo.setEnabled(true);
        this.venda = venda;
        this.veiculos = new VeiculoDAO();
    }
      
    @Override
    public void organizaLayout(){
        initComponents();
        // Adicionar painel ao fundo
        this.setContentPane(dkpFundo);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        grid = (DefaultTableModel) tblCarros.getModel();
        popularTabela(repositorioDeVeiculos, 1, tblCarros, grid);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFundo = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarros = new javax.swing.JTable();
        pnlBotoes = new javax.swing.JPanel();
        btnSelecionarVeiculo = new javax.swing.JButton();
        btnRemoverVeiculo = new javax.swing.JButton();
        btnCadastrarVeiculo = new javax.swing.JButton();
        btnBuscarVeiculo = new javax.swing.JButton();
        txtPlacaBuscada = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        btnAlterarVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Carros");

        tblCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Modelo", "Marca", "Chassi", "Cor", "Tipo", "Ano", "Preço", "Combustível", "Portas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCarros.setToolTipText("");
        tblCarros.setSelectionBackground(new java.awt.Color(34, 110, 157));
        tblCarros.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblCarros.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCarros);
        if (tblCarros.getColumnModel().getColumnCount() > 0) {
            tblCarros.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(1).setMinWidth(300);
            tblCarros.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblCarros.getColumnModel().getColumn(1).setMaxWidth(300);
            tblCarros.getColumnModel().getColumn(2).setPreferredWidth(180);
            tblCarros.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(8).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(9).setPreferredWidth(100);
        }

        pnlBotoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 204, 255))); // NOI18N
        pnlBotoes.setPreferredSize(new java.awt.Dimension(912, 102));

        btnSelecionarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnSelecionarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSelecionarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarVeiculo.setText("Selecionar");
        btnSelecionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarVeiculoActionPerformed(evt);
            }
        });

        btnRemoverVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnRemoverVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRemoverVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoverVeiculo.setText("Remover");
        btnRemoverVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverVeiculoActionPerformed(evt);
            }
        });

        btnCadastrarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarVeiculo.setText("Cadastrar");
        btnCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVeiculoActionPerformed(evt);
            }
        });

        btnBuscarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnBuscarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarVeiculo.setText("Buscar");
        btnBuscarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVeiculoActionPerformed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaca.setText("Placa:");

        btnAlterarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnAlterarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAlterarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarVeiculo.setText("Alterar");
        btnAlterarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlacaBuscada, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelecionarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(880, Short.MAX_VALUE))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBotoesLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnRemoverVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSelecionarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAlterarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBotoesLayout.createSequentialGroup()
                                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPlacaBuscada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 21, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane1)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 1788, Short.MAX_VALUE))
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
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
            .addComponent(dkpFundo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVeiculoActionPerformed
        abrirTelaCadastro();
    }//GEN-LAST:event_btnCadastrarVeiculoActionPerformed

    private void btnRemoverVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverVeiculoActionPerformed
        validaRemocao();
    }//GEN-LAST:event_btnRemoverVeiculoActionPerformed

    private void btnBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeiculoActionPerformed
        limpaSelecao(tblCarros);
        buscaNaTabela(txtPlacaBuscada.getText().toUpperCase());
    }//GEN-LAST:event_btnBuscarVeiculoActionPerformed
    
    private void btnSelecionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarVeiculoActionPerformed
        selecionaItem((String) grid.getValueAt(tblCarros.getSelectedRow(), 0));
    }//GEN-LAST:event_btnSelecionarVeiculoActionPerformed

    private void btnAlterarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVeiculoActionPerformed
        try {
            abrirTelaAlterarCadastro(repositorioDeVeiculos.buscarVeiculo((String) grid.getValueAt(tblCarros.getSelectedRow(), 0)));
        } catch (Exception e){
            apresentaMensagem("Selecione um veículo!", "Erro ao alterar");
        }
        
    }//GEN-LAST:event_btnAlterarVeiculoActionPerformed

    @Override
    public void abrirTelaCadastro(){
        CadastroCarroView cadCarro = new CadastroCarroView(this);
        cadCarro.setVisible(true);        
    }
    
     public void validaRemocao(){
        if (!(tblCarros.getSelectedRow() != -1)) {
            apresentaMensagem("Nenhum registro foi selecionado.", "Erro de exclusão");
        } else {
            if (0 == criaQuestaoPrgunta("Tem certeza que deseja excluir o registro da lista?", "Confirmar remoção")) {
                removerDaTabela();
            }
        }
    }
     
    public void removerDaTabela() {
        if (!(tblCarros.getSelectedRow() == -1)){
            String placa = (String) grid.getValueAt(tblCarros.getSelectedRow(), 0);
            repositorioDeVeiculos.removeVeiculo(placa);
            limparTabela(grid);
            popularTabela(repositorioDeVeiculos, 1, tblCarros, grid);
            apresentaMensagem("Veículo removido!", "Remoção efetuada");
        } else {
            apresentaMensagem("Nenhum veículo foi selecionado.", "Erro de exclusão");
        }
    }
    
    @Override
    public void buscaNaTabela(String placa){
        int incidencia = -1;
        if(placa.length() == 7){
            for(int i = 0; i <= tblCarros.getRowCount()-1; i++){
                if(grid.getValueAt(i, 0).equals(placa)){
                    incidencia = i;
                }
            }
            if(incidencia != -1){
            tblCarros.setRowSelectionInterval(incidencia, incidencia);
            } else {
                apresentaMensagem("Não foi encontrado nenhum veículo com a placa '"+placa+"'.", "Veículo não encontrado");
            }
        } else {
            apresentaMensagem("Digite uma placa válida!", "Placa inválida");
        }
    }
    
    @Override
    public void abrirTelaAlterarCadastro(Object obj) {
        CadastroCarroView altCarro = new CadastroCarroView(this, (Carro) obj);
        altCarro.setVisible(true);
    }
    
    public void selecionaItem(String placa){
       venda.veiculo = veiculos.buscarVeiculo(placa); 
       venda.VeiculoSelecionado = true;
       setVisible(false);
    }

    public DefaultTableModel getGrid() {
        return grid;
    }

    public JTable getTblCarros() {
        return tblCarros;
    }

    public VeiculoRepositorio getRepositorioDeVeiculos() {
        return repositorioDeVeiculos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarVeiculo;
    private javax.swing.JButton btnBuscarVeiculo;
    private javax.swing.JButton btnCadastrarVeiculo;
    private javax.swing.JButton btnRemoverVeiculo;
    private javax.swing.JButton btnSelecionarVeiculo;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JTable tblCarros;
    private javax.swing.JTextField txtPlacaBuscada;
    // End of variables declaration//GEN-END:variables
   
}
