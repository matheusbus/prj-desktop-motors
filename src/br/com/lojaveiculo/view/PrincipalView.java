/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.componentes.PainelImagemFundo;
import br.com.lojaveiculo.instancia.FabricaObjetos;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.ImageIcon;
/**
 *
 * @author Matheus
 */
public final class PrincipalView extends javax.swing.JFrame {
    
    public PrincipalView() {
        initComponents();
        organizaLayout();
        // Instancia objetos do sistema
        FabricaObjetos criaInstancia = new FabricaObjetos();
        criaInstancia.criaClientes();
        criaInstancia.criaFuncionarios();
        criaInstancia.criaVeiculos();
    }

    public void organizaLayout(){
        PainelImagemFundo painelFundo = new PainelImagemFundo();
        this.add(painelFundo);
        this.setContentPane(painelFundo);
        painelFundo.setImg(new ImageIcon("src/br/com/lojaveiculo/img/fundoPrincipalView.png"));
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpnlFundo = new javax.swing.JDesktopPane();
        mbMenuPrincipal = new javax.swing.JMenuBar();
        muCadastros = new javax.swing.JMenu();
        miCadClientes = new javax.swing.JMenuItem();
        muCadVeiculo = new javax.swing.JMenu();
        miCadCarro = new javax.swing.JMenuItem();
        miCadMoto = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenu();
        miCadVendedor = new javax.swing.JMenuItem();
        miCadGerente = new javax.swing.JMenuItem();
        muConsultas = new javax.swing.JMenu();
        muClientes = new javax.swing.JMenuItem();
        menuVeiculos = new javax.swing.JMenu();
        miConsCarro = new javax.swing.JMenuItem();
        miConsMoto = new javax.swing.JMenuItem();
        muConsultaFuncionarios = new javax.swing.JMenuItem();
        muVendas = new javax.swing.JMenu();
        muTelaVenda = new javax.swing.JMenuItem();
        muRelatorios = new javax.swing.JMenu();
        miRelatorios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DestkopMotors");
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 900));

        dkpnlFundo.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        javax.swing.GroupLayout dkpnlFundoLayout = new javax.swing.GroupLayout(dkpnlFundo);
        dkpnlFundo.setLayout(dkpnlFundoLayout);
        dkpnlFundoLayout.setHorizontalGroup(
            dkpnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
        );
        dkpnlFundoLayout.setVerticalGroup(
            dkpnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        muCadastros.setText("Cadastros");

        miCadClientes.setText("Clientes");
        miCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadClientesActionPerformed(evt);
            }
        });
        muCadastros.add(miCadClientes);

        muCadVeiculo.setText("Veículos");

        miCadCarro.setText("Carro");
        miCadCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadCarroActionPerformed(evt);
            }
        });
        muCadVeiculo.add(miCadCarro);

        miCadMoto.setText("Moto");
        miCadMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadMotoActionPerformed(evt);
            }
        });
        muCadVeiculo.add(miCadMoto);

        muCadastros.add(muCadVeiculo);

        menuFuncionarios.setText("Funcionarios");

        miCadVendedor.setText("Vendedor");
        miCadVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadVendedorActionPerformed(evt);
            }
        });
        menuFuncionarios.add(miCadVendedor);

        miCadGerente.setText("Gerente");
        miCadGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadGerenteActionPerformed(evt);
            }
        });
        menuFuncionarios.add(miCadGerente);

        muCadastros.add(menuFuncionarios);

        mbMenuPrincipal.add(muCadastros);

        muConsultas.setText("Consultas");

        muClientes.setText("Clientes");
        muClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muClientesActionPerformed(evt);
            }
        });
        muConsultas.add(muClientes);

        menuVeiculos.setText("Veículos");

        miConsCarro.setText("Carro");
        miConsCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsCarroActionPerformed(evt);
            }
        });
        menuVeiculos.add(miConsCarro);

        miConsMoto.setText("Moto");
        miConsMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsMotoActionPerformed(evt);
            }
        });
        menuVeiculos.add(miConsMoto);

        muConsultas.add(menuVeiculos);

        muConsultaFuncionarios.setText("Funcionários");
        muConsultaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muConsultaFuncionariosActionPerformed(evt);
            }
        });
        muConsultas.add(muConsultaFuncionarios);

        mbMenuPrincipal.add(muConsultas);

        muVendas.setText("Vendas");

        muTelaVenda.setText("Efetuar Venda");
        muTelaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muTelaVendaActionPerformed(evt);
            }
        });
        muVendas.add(muTelaVenda);

        mbMenuPrincipal.add(muVendas);

        muRelatorios.setText("Relatórios");

        miRelatorios.setText("Relatório");
        miRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatoriosActionPerformed(evt);
            }
        });
        muRelatorios.add(miRelatorios);

        mbMenuPrincipal.add(muRelatorios);

        jMenu3.setText("Opções");
        mbMenuPrincipal.add(jMenu3);

        setJMenuBar(mbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpnlFundo, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpnlFundo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void muConsultaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muConsultaFuncionariosActionPerformed
       ConsultaFuncionariosView consultaFuncionarios = new ConsultaFuncionariosView();
       consultaFuncionarios.setVisible(true);
    }//GEN-LAST:event_muConsultaFuncionariosActionPerformed

    private void miCadVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadVendedorActionPerformed
       CadastroVendedorView cadastroVendedor = new CadastroVendedorView();
       cadastroVendedor.setVisible(true);
    }//GEN-LAST:event_miCadVendedorActionPerformed

    private void miCadGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadGerenteActionPerformed
       CadastroGerenteView cadastroGerente = new CadastroGerenteView();
       cadastroGerente.setVisible(true);
    }//GEN-LAST:event_miCadGerenteActionPerformed

    private void miConsCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsCarroActionPerformed
       ConsultaCarroView consultaCarro = new ConsultaCarroView();
       consultaCarro.setVisible(true);
    }//GEN-LAST:event_miConsCarroActionPerformed

    private void miConsMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsMotoActionPerformed
       ConsultaMotoView consultaMoto = new ConsultaMotoView();
       consultaMoto.setVisible(true);
    }//GEN-LAST:event_miConsMotoActionPerformed

    private void miRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatoriosActionPerformed
        RelatorioView relatorio = new RelatorioView();
        relatorio.setVisible(true);
    }//GEN-LAST:event_miRelatoriosActionPerformed


    private void miCadCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadCarroActionPerformed
        CadastroCarroView cadCarro = new CadastroCarroView();
        cadCarro.setVisible(true);
    }//GEN-LAST:event_miCadCarroActionPerformed

    private void miCadMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadMotoActionPerformed
        CadastroMotoView cadMoto = new CadastroMotoView();
        cadMoto.setVisible(true);
    }//GEN-LAST:event_miCadMotoActionPerformed

    private void miCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadClientesActionPerformed
        CadastroClienteView cadCliente = new CadastroClienteView();
        cadCliente.setVisible(true);
    }//GEN-LAST:event_miCadClientesActionPerformed

    private void muClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muClientesActionPerformed
       ConsultaClientesView consultaCliente = new ConsultaClientesView();
       consultaCliente.setVisible(true);
    }//GEN-LAST:event_muClientesActionPerformed

    private void muTelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muTelaVendaActionPerformed
        VendaView vendaView = new VendaView();
        vendaView.setVisible(true);
    }//GEN-LAST:event_muTelaVendaActionPerformed

    
        public static void main(String args[]) {
            
            FlatArcDarkIJTheme.setup();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalView().setVisible(true);
            });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkpnlFundo;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar mbMenuPrincipal;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenu menuVeiculos;
    private javax.swing.JMenuItem miCadCarro;
    private javax.swing.JMenuItem miCadClientes;
    private javax.swing.JMenuItem miCadGerente;
    private javax.swing.JMenuItem miCadMoto;
    private javax.swing.JMenuItem miCadVendedor;
    private javax.swing.JMenuItem miConsCarro;
    private javax.swing.JMenuItem miConsMoto;
    private javax.swing.JMenuItem miRelatorios;
    private javax.swing.JMenu muCadVeiculo;
    private javax.swing.JMenu muCadastros;
    private javax.swing.JMenuItem muClientes;
    private javax.swing.JMenuItem muConsultaFuncionarios;
    private javax.swing.JMenu muConsultas;
    private javax.swing.JMenu muRelatorios;
    private javax.swing.JMenuItem muTelaVenda;
    private javax.swing.JMenu muVendas;
    // End of variables declaration//GEN-END:variables
       
}


