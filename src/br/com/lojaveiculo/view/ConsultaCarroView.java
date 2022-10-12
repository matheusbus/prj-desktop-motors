/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Carro;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.jshell.spi.ExecutionControl;

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
        criaVeiculos();
        popularTabela();
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
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Modelo", "Marca", "Ano", "Preço", "Combustível", "Portas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(tblCarros);
        if (tblCarros.getColumnModel().getColumnCount() > 0) {
            tblCarros.getColumnModel().getColumn(0).setMinWidth(100);
            tblCarros.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(0).setMaxWidth(100);
            tblCarros.getColumnModel().getColumn(2).setMinWidth(130);
            tblCarros.getColumnModel().getColumn(2).setPreferredWidth(130);
            tblCarros.getColumnModel().getColumn(2).setMaxWidth(130);
            tblCarros.getColumnModel().getColumn(3).setMinWidth(100);
            tblCarros.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(3).setMaxWidth(100);
            tblCarros.getColumnModel().getColumn(4).setMinWidth(100);
            tblCarros.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(4).setMaxWidth(100);
            tblCarros.getColumnModel().getColumn(5).setMinWidth(100);
            tblCarros.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(5).setMaxWidth(100);
            tblCarros.getColumnModel().getColumn(6).setMinWidth(100);
            tblCarros.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(6).setMaxWidth(100);
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
                .addContainerGap(26, Short.MAX_VALUE))
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
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE))
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
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
        removerDaTabela();
    }//GEN-LAST:event_btnRemoverVeiculoActionPerformed

    private void btnBuscarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVeiculoActionPerformed
        limpaSelecao();
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
    
    @Override
    public void abrirTelaAlterarCadastro(Object obj) {
        CadastroCarroView altCarro = new CadastroCarroView((Carro) obj);
        altCarro.setVisible(true);
    }
    
    @Override
    public void apresentaMensagem(String mensagem, String titulo){
        JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }

    @Override
    public void limparTabela(){
        grid.setRowCount(0);
    }
    
    @Override
    public void removerDaTabela() {
        if (!(tblCarros.getSelectedRow() == -1)){
            String placa = (String) grid.getValueAt(tblCarros.getSelectedRow(), 0);
            repositorioDeVeiculos.removeVeiculo(placa);
            limparTabela();
            popularTabela();
        } else {
            apresentaMensagem("Nenhum veículo foi selecionado.", "Erro de exclusão");
        }
    }
    
    @Override
    public void limpaSelecao(){
        // Limpar seleção da linha atual na tabela
        tblCarros.clearSelection();
    }
    
    @Override
    public void popularTabela(){
       limparTabela();
        tblCarros.getModel();
        Map<String, Veiculo> veiculos = repositorioDeVeiculos.getVeiculos();
        
       for(Map.Entry<String, Veiculo> entry : veiculos.entrySet()){
            if(entry.getValue() instanceof Carro){
                Carro carro = (Carro) entry.getValue();
                grid.addRow(carro.obterDados());
            }
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
    
    
    public void selecionaItem(String placa){
       venda.veiculo = veiculos.buscarVeiculo(placa); 
       venda.VeiculoSelecionado = true;
       setVisible(false);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatArcDarkIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaCarroView().setVisible(true);
            }
        });
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

    // Método de teste, não vai ficar na versão final.
    public void criaVeiculos(){
        repositorioDeVeiculos.addVeiculo(new Carro("MKQ8507", "CL-244 2.8 132cv 4x4 TB Int.", new Marca("Cross Lander"), 2003, 25000, "Diesel", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LWR9396", "9000 CD 2.3 Turbo", new Marca("Saab"), 2002, 80000, "Diesel", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MJE6388", "TOPIC FURGAO L 2.2 8V/ 2.0 16V 4p", new Marca("JINBEI"), 1992, 50000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MBR4428", "Hilux CD SR 4x4 3.0 8V 90cv Diesel", new Marca("Toyota"), 2002, 40000, "Flex", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MGU3473", "Defender 90 TDI Hard Top Diesel", new Marca("Land Rover"), 1996, 40000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MEZ1270", "HOVER CUV 2.4 16V 5p Mec.", new Marca("GREAT WALL"), 2008, 40000, "Alcool", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LZH3275", "SL-63 AMG 5.5 Bi-Turbo V8 Aut.", new Marca("Mercedes-Benz"), 2013, 40000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MLL1094", "Wraith 6.6 V12 Aut.", new Marca("Rolls-Royce"), 2014, 40000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MHE0503", "156 SportWagon 2.5 V6 24V 190cv 4p Aut.", new Marca("Alfa Romeo"), 2003, 40000, "Alcool", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MMD3744", "Pick-Up 4x2 Curto/Longo 2.5 TDI Diesel", new Marca("Matra"), 2002, 40000, "Gasolina", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("LZH7265", "Outback 3.0 H6 SW 245cv Aut.", new Marca("Subaru"), 2004, 40000, "Gasolina", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("LYN0101", "Grand Siena ATTRAC. 1.4 EVO F.Flex 8V", new Marca("Fiat"), 2002, 40000, "Flex", 2));
        repositorioDeVeiculos.addVeiculo(new Carro("MJE5467", "F599 GTB Fiorano F1 6.0 V12 620cv", new Marca("Ferrari"), 2007, 400000, "Flex", 4));
        repositorioDeVeiculos.addVeiculo(new Carro("MII7048", "PT Cruiser Limited 2.0 16V 4p", new Marca("Fiat"), 2001, 40000, "Alcool", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MCB0839", "155 Super", new Marca("Alfa Romeo"), 1995, 40000, "Flex", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MJF5888", "Carnival EX 3.8 V6 24V 242cv Aut.", new Marca("Kia Motors"), 2006, 40000, "Gasolina", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MJB2287", "Quattroporte Automatica 4.2 32V 400cv", new Marca("Maserati"), 2008, 40000, "Alcool", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MMM0009", "911 Carrera Coup", new Marca("Porsche"), 1992, 40000, "Flex", 7));
        repositorioDeVeiculos.addVeiculo(new Carro("MEU6423", "Gallardo Coupe LP560-4", new Marca("LAMBORGHINI"), 2010, 40000, "Gasolina", 7));
    }
    
}
