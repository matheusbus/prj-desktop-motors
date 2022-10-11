/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseConsultaView;
import br.com.lojaveiculo.dao.VeiculoDAO;
import br.com.lojaveiculo.model.Marca;
import br.com.lojaveiculo.model.Moto;
import br.com.lojaveiculo.model.Veiculo;
import br.com.lojaveiculo.repositorio.VeiculoRepositorio;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public final class ConsultaMotoView extends TelaBaseConsultaView{

    private final VeiculoRepositorio repositorioDeVeiculos = new VeiculoDAO();
    private DefaultTableModel grid;
    private VendaView venda;
    private VeiculoRepositorio veiculos;

    // Construtor chamado na tela inicial
    public ConsultaMotoView() {
        organizaLayout();
        this.btnSelecionarVeiculo.setEnabled(false);
    }
    
    // Construtor chamado na tela de venda
    public ConsultaMotoView(VendaView venda) {
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
        grid = (DefaultTableModel) tblMotos.getModel();
        criaVeiculos();
        popularTabela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpFundo = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMotos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarVeiculo = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        txtPlacaBuscada = new javax.swing.JTextField();
        btnCadastrarVeiculo = new javax.swing.JButton();
        btnRemoverVeiculo = new javax.swing.JButton();
        btnSelecionarVeiculo = new javax.swing.JButton();
        btnSelecionarVeiculo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Carros");

        tblMotos.setForeground(new java.awt.Color(255, 255, 255));
        tblMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Placa", "Modelo", "Marca", "Ano", "Preço", "Combustível", "Cilindradas"
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
        tblMotos.setToolTipText("");
        tblMotos.setSelectionBackground(new java.awt.Color(153, 204, 255));
        jScrollPane1.setViewportView(tblMotos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(82, 148, 226))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(82, 148, 226));

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

        btnCadastrarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnCadastrarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCadastrarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarVeiculo.setText("Cadastrar");
        btnCadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVeiculoActionPerformed(evt);
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

        btnSelecionarVeiculo.setBackground(new java.awt.Color(82, 148, 226));
        btnSelecionarVeiculo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSelecionarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarVeiculo.setText("Selecionar");
        btnSelecionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarVeiculoActionPerformed(evt);
            }
        });

        btnSelecionarVeiculo1.setBackground(new java.awt.Color(82, 148, 226));
        btnSelecionarVeiculo1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSelecionarVeiculo1.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarVeiculo1.setText("Alterar");
        btnSelecionarVeiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarVeiculo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlacaBuscada, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoverVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelecionarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSelecionarVeiculo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlacaBuscada)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarVeiculo))
                    .addComponent(btnCadastrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverVeiculo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelecionarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSelecionarVeiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        dkpFundo.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpFundo.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpFundoLayout = new javax.swing.GroupLayout(dkpFundo);
        dkpFundo.setLayout(dkpFundoLayout);
        dkpFundoLayout.setHorizontalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dkpFundoLayout.setVerticalGroup(
            dkpFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(dkpFundo, javax.swing.GroupLayout.Alignment.TRAILING)
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
        selecionaItem((String) grid.getValueAt(tblMotos.getSelectedRow(), 0));
    }//GEN-LAST:event_btnSelecionarVeiculoActionPerformed

    private void btnSelecionarVeiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarVeiculo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelecionarVeiculo1ActionPerformed

    @Override
    public void abrirTelaCadastro() {
        CadastroMotoView cadMoto = new CadastroMotoView(this);
        cadMoto.setVisible(true);        
    }

    @Override
    public void apresentaMensagem(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(rootPane, mensagem, titulo, HEIGHT);
    }
    
    @Override
    public void limparTabela(){
        grid.setRowCount(0);
    }
    
    @Override
    public void removerDaTabela() {
        if (!(tblMotos.getSelectedRow() == -1)){
            String placa = (String) grid.getValueAt(tblMotos.getSelectedRow(), 0);
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
        tblMotos.clearSelection();
    }
    
    @Override
    public void popularTabela(){
        limparTabela();
        tblMotos.getModel();
        Map<String, Veiculo> veiculos = repositorioDeVeiculos.getVeiculos();
        
        for(Map.Entry<String, Veiculo> entry : veiculos.entrySet()){
            if(entry.getValue() instanceof Moto){
                Moto moto = (Moto) entry.getValue();
                grid.addRow(moto.obterDados());
            }
        }
    }
     
    @Override
    public void buscaNaTabela(String placa){
        int incidencia = -1;
        if(placa.length() == 7){
            for(int i = 0; i <= tblMotos.getRowCount()-1; i++){
                if(grid.getValueAt(i, 0).equals(placa)){
                    incidencia = i;
                }
            }
            if(incidencia != -1){
            tblMotos.setRowSelectionInterval(incidencia, incidencia);
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
                new ConsultaMotoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVeiculo;
    private javax.swing.JButton btnCadastrarVeiculo;
    private javax.swing.JButton btnRemoverVeiculo;
    private javax.swing.JButton btnSelecionarVeiculo;
    private javax.swing.JButton btnSelecionarVeiculo1;
    private javax.swing.JDesktopPane dkpFundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JTable tblMotos;
    private javax.swing.JTextField txtPlacaBuscada;
    // End of variables declaration//GEN-END:variables

    public void criaVeiculos(){
        repositorioDeVeiculos.addVeiculo(new Moto("ABC0001", "Biz 80", new Marca("Fiat"), 2008, 25000, "Gasolina", 80));
        repositorioDeVeiculos.addVeiculo(new Moto("ABC0002", "Biz 100", new Marca("Fiat"), 2010, 80000, "Gasolina", 120));
        repositorioDeVeiculos.addVeiculo(new Moto("ABC0003", "CG150", new Marca("Honda"), 2015, 12000, "Gasolina", 150));
        repositorioDeVeiculos.addVeiculo(new Moto("ABC0004", "CG200", new Marca("Honda"), 2018, 80000, "Gasolina", 200));
    }
    
}
