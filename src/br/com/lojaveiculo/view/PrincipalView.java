/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseView;
import br.com.lojaveiculo.componentes.PainelImagemFundo;
import br.com.lojaveiculo.instancia.FabricaObjetos;
import java.awt.event.ActionListener;
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
            .addGap(0, 600, Short.MAX_VALUE)
        );

        muCadastros.setText("Cadastros");

        miCadClientes.setText("Clientes");
        muCadastros.add(miCadClientes);

        miCadFuncionarios.setText("Funcionarios");
        muCadastros.add(miCadFuncionarios);

        muCadVeiculo.setText("Veículos");

        miCadCarro.setText("Carro");
        muCadVeiculo.add(miCadCarro);

        miCadMoto.setText("Moto");
        muCadVeiculo.add(miCadMoto);

        muCadastros.add(muCadVeiculo);

        mbMenuPrincipal.add(muCadastros);

        muConsultas.setText("Consultas");

        muClientes.setText("Clientes");
        muConsultas.add(muClientes);

        muConsultaFuncionarios.setText("Funcionários");
        muConsultas.add(muConsultaFuncionarios);

        menuVeiculos.setText("Veículos");

        miConsCarro.setText("Carro");
        menuVeiculos.add(miConsCarro);

        miConsMoto.setText("Moto");
        menuVeiculos.add(miConsMoto);

        muConsultas.add(menuVeiculos);

        muConsultaVendas.setText("Vendas");
        muConsultas.add(muConsultaVendas);

        mbMenuPrincipal.add(muConsultas);

        muVendas.setText("Vendas");

        muTelaVenda.setText("Efetuar Venda");
        muVendas.add(muTelaVenda);

        mbMenuPrincipal.add(muVendas);

        muRelatorios.setText("Relatórios");

        miRelatorios.setText("Vendas");
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(dkpnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void adicionarAcaoAoBotaoConsultaFuncionario(ActionListener acao){
        muConsultaFuncionarios.addActionListener(acao);
    }
    
    public void adicionarAcaoAoBotaoConsultaCarro(ActionListener acao){
        miConsCarro.addActionListener(acao);
    }
    
    public void adicionarAcaoAoBotaoConsultaMoto(ActionListener acao){
        miConsMoto.addActionListener(acao);
    }
    
    public void adicionarAcaoAoBotaoRelatorio(ActionListener acao){
        miRelatorios.addActionListener(acao);
    }    
    
    public void adicionarAcaoAoBotaoCadastroCarro(ActionListener acao){
        miCadCarro.addActionListener(acao);
    }    
    

    public void adicionarAcaoAoBotaoCadastroMoto(ActionListener acao){
        miCadMoto.addActionListener(acao);
    }    
    
    public void adicionarAcaoAoBotaoCadastroCliente(ActionListener acao){
        miCadClientes.addActionListener(acao);
    }    
    
    public void adicionarAcaoAoBotaoConsultaCliente(ActionListener acao){
        muClientes.addActionListener(acao);
    }    
    
    public void adicionarAcaoAoBotaoCadastroVenda(ActionListener acao){
        muTelaVenda.addActionListener(acao);
    }    
    
    public void adicionarAcaoAoBotaoConsultaVenda(ActionListener acao){
        muConsultaVendas.addActionListener(acao);
    }    
    
    public void adicionarAcaoAoBotaoCadastroFuncionario(ActionListener acao){
        miCadFuncionarios.addActionListener(acao);
    }    
    
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
