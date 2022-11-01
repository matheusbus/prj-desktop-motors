/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseView;
import br.com.lojaveiculo.componentes.PainelImagemFundo;
import br.com.lojaveiculo.instancia.FabricaObjetos;
import javax.swing.ImageIcon;
/**
 *
 * @author Matheus
 */
public final class PrincipalView extends TelaBaseView {

    private ConsultaFuncionariosView consultaFuncionarios;
    private ConsultaCarroView consultaCarro;
    private ConsultaMotoView consultaMoto;
    private RelatorioView relatorio;
    private CadastroCarroView cadCarro;
    private CadastroMotoView cadMoto;
    private CadastroClienteView cadCliente;
    private ConsultaClientesView consultaCliente;
    private VendaView venda;
    private ConsultaVendaView consultaVenda;
    private CadastroFuncionariosView cadFuncionarios;
    
    public PrincipalView() {
        initComponents();
        organizaLayout();
        // Instancia objetos do sistema
        
        if(0 == criaQuestaoPrgunta("Deseja iniciar o software com objetos instanciados?", "Questão instâncias")){
            FabricaObjetos criaInstancia = new FabricaObjetos();
            criaInstancia.criaClientes();
            criaInstancia.criaFuncionarios();
            criaInstancia.criaVeiculos();
            criaInstancia.criaVendas();
        }
    }

    @Override
    public void organizaLayout() {
        PainelImagemFundo painelFundo = new PainelImagemFundo();
        this.add(painelFundo);
        this.setContentPane(painelFundo);
        painelFundo.setImg(new ImageIcon("src/br/com/lojaveiculo/img/fundoPrincipalView.png"));
        this.setSize(1400, 900);
        this.setLocationRelativeTo(null);
        // Tela cheia: quando o software estiver pronto
        //this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpnlFundo = new javax.swing.JDesktopPane();
        mbMenuPrincipal = new javax.swing.JMenuBar();
        muCadastros = new javax.swing.JMenu();
        miCadClientes = new javax.swing.JMenuItem();
        miCadFuncionarios = new javax.swing.JMenuItem();
        muCadVeiculo = new javax.swing.JMenu();
        miCadCarro = new javax.swing.JMenuItem();
        miCadMoto = new javax.swing.JMenuItem();
        muConsultas = new javax.swing.JMenu();
        muClientes = new javax.swing.JMenuItem();
        muConsultaFuncionarios = new javax.swing.JMenuItem();
        menuVeiculos = new javax.swing.JMenu();
        miConsCarro = new javax.swing.JMenuItem();
        miConsMoto = new javax.swing.JMenuItem();
        muConsultaVendas = new javax.swing.JMenuItem();
        muVendas = new javax.swing.JMenu();
        muTelaVenda = new javax.swing.JMenuItem();
        muRelatorios = new javax.swing.JMenu();
        miRelatorios = new javax.swing.JMenuItem();

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

        miCadFuncionarios.setText("Funcionarios");
        miCadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadFuncionariosActionPerformed(evt);
            }
        });
        muCadastros.add(miCadFuncionarios);

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

        mbMenuPrincipal.add(muCadastros);

        muConsultas.setText("Consultas");

        muClientes.setText("Clientes");
        muClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muClientesActionPerformed(evt);
            }
        });
        muConsultas.add(muClientes);

        muConsultaFuncionarios.setText("Funcionários");
        muConsultaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muConsultaFuncionariosActionPerformed(evt);
            }
        });
        muConsultas.add(muConsultaFuncionarios);

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

        muConsultaVendas.setText("Vendas");
        muConsultaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muConsultaVendasActionPerformed(evt);
            }
        });
        muConsultas.add(muConsultaVendas);

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

        miRelatorios.setText("Vendas");
        miRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatoriosActionPerformed(evt);
            }
        });
        muRelatorios.add(miRelatorios);

        mbMenuPrincipal.add(muRelatorios);

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
        if(verificaTelaAberta(consultaFuncionarios)){
            consultaFuncionarios = new ConsultaFuncionariosView();
        }
        consultaFuncionarios.setVisible(true);
    }//GEN-LAST:event_muConsultaFuncionariosActionPerformed

    private void miConsCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsCarroActionPerformed
        if(verificaTelaAberta(consultaCarro)){
            consultaCarro = new ConsultaCarroView();
        }
        consultaCarro.setVisible(true);
    }//GEN-LAST:event_miConsCarroActionPerformed

    private void miConsMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsMotoActionPerformed
        if(verificaTelaAberta(consultaMoto)){
            consultaMoto = new ConsultaMotoView();
            consultaMoto.setVisible(true);
        }
    }//GEN-LAST:event_miConsMotoActionPerformed

    private void miRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatoriosActionPerformed
        if(verificaTelaAberta(relatorio)){
            relatorio = new RelatorioView();    
        }
        relatorio.setVisible(true);
    }//GEN-LAST:event_miRelatoriosActionPerformed


    private void miCadCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadCarroActionPerformed
        if(verificaTelaAberta(cadCarro)){
            cadCarro = new CadastroCarroView();
        }
        cadCarro.setVisible(true);
    }//GEN-LAST:event_miCadCarroActionPerformed

    private void miCadMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadMotoActionPerformed
        if(verificaTelaAberta(cadMoto)){
            cadMoto = new CadastroMotoView();
        }
        cadMoto.setVisible(true);
    }//GEN-LAST:event_miCadMotoActionPerformed

    private void miCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadClientesActionPerformed
        if(verificaTelaAberta(cadCliente)){
            cadCliente = new CadastroClienteView();
        }
        cadCliente.setVisible(true);
    }//GEN-LAST:event_miCadClientesActionPerformed

    private void muClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muClientesActionPerformed
        if(verificaTelaAberta(consultaCliente)){
            consultaCliente = new ConsultaClientesView();
        }
        consultaCliente.setVisible(true);
    }//GEN-LAST:event_muClientesActionPerformed

    private void muTelaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muTelaVendaActionPerformed
        if(verificaTelaAberta(venda)){
            venda = new VendaView();
        }
        venda.setVisible(true);
    }//GEN-LAST:event_muTelaVendaActionPerformed

    private void muConsultaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muConsultaVendasActionPerformed
        if(verificaTelaAberta(consultaVenda)){
            consultaVenda = new ConsultaVendaView();
        }
        consultaVenda.setVisible(true);
    }//GEN-LAST:event_muConsultaVendasActionPerformed

    private void miCadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadFuncionariosActionPerformed
        if(verificaTelaAberta(cadFuncionarios)){
            cadFuncionarios = new CadastroFuncionariosView();
        }
        cadFuncionarios.setVisible(true);
    }//GEN-LAST:event_miCadFuncionariosActionPerformed

    public boolean verificaTelaAberta(Object tela){
        return tela == null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkpnlFundo;
    private javax.swing.JMenuBar mbMenuPrincipal;
    private javax.swing.JMenu menuVeiculos;
    private javax.swing.JMenuItem miCadCarro;
    private javax.swing.JMenuItem miCadClientes;
    private javax.swing.JMenuItem miCadFuncionarios;
    private javax.swing.JMenuItem miCadMoto;
    private javax.swing.JMenuItem miConsCarro;
    private javax.swing.JMenuItem miConsMoto;
    private javax.swing.JMenuItem miRelatorios;
    private javax.swing.JMenu muCadVeiculo;
    private javax.swing.JMenu muCadastros;
    private javax.swing.JMenuItem muClientes;
    private javax.swing.JMenuItem muConsultaFuncionarios;
    private javax.swing.JMenuItem muConsultaVendas;
    private javax.swing.JMenu muConsultas;
    private javax.swing.JMenu muRelatorios;
    private javax.swing.JMenuItem muTelaVenda;
    private javax.swing.JMenu muVendas;
    // End of variables declaration//GEN-END:variables

}
