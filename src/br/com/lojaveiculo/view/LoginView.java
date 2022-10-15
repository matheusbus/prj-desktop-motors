/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.abstractview.TelaBaseView;
import br.com.lojaveiculo.componentes.PainelImagemFundo;
import br.com.lojaveiculo.dao.UsuarioDAO;
import br.com.lojaveiculo.instancia.FabricaObjetos;
import br.com.lojaveiculo.model.Usuario;
import br.com.lojaveiculo.repositorio.UsuarioRepositorio;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public final class LoginView extends TelaBaseView {
    
    
    private final UsuarioRepositorio repositorioDeUsuarios;
    
    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        organizaLayout();
        repositorioDeUsuarios = new UsuarioDAO();
        FabricaObjetos fab = new FabricaObjetos();
        fab.criaUsuarios();
    }
   

    @Override
    public void organizaLayout(){
        this.setContentPane(pnlPrincipal);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        pnlPrincipal.setSize(this.getWidth(), this.getHeight());
        pnlPrincipal.add(btnLogar);
        pnlPrincipal.add(txtLogin);
        pnlPrincipal.add(txtSenha);
        pnlPrincipal.add(lblLogin);
        pnlPrincipal.add(lblSenha);
        pnlPrincipal.add(lblFundo);
        pnlPrincipal.add(lblBemVindo);
        pnlPrincipal.add(lblLogado);
        lblFundo.setSize(pnlPrincipal.getWidth(), pnlPrincipal.getHeight());
<<<<<<< HEAD
        lblLogado.setVisible(false);
        PainelImagemFundo painelFundo = new PainelImagemFundo();
        lblLogo.add(painelFundo);
        painelFundo.setImg(new ImageIcon("src/br/com/lojaveiculo/img/fundoPrincipalView.png"));
=======
        lblLogado.setVisible(false);        
>>>>>>> d15daf9cdd54cd79a6bc5e6eb84075500c4b44f1
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        btnLogar = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblSenha = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        lblLogado = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DesktopMotors - Acesso");

        btnLogar.setBackground(new java.awt.Color(82, 148, 226));
        btnLogar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(255, 255, 255));
        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        txtLogin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblLogin.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(82, 148, 226));
        lblLogin.setText("Login");

        txtSenha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblSenha.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(82, 148, 226));
        lblSenha.setText("Senha");

        lblBemVindo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(82, 148, 226));
        lblBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBemVindo.setText("Bem-Vindo!");
        lblBemVindo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblLogado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblLogado.setForeground(new java.awt.Color(51, 255, 102));
        lblLogado.setText("Sucesso ao conectar!");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSenha)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogar, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(lblLogado)
                            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblFundo))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblBemVindo)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFundo)
                .addGap(15, 15, 15)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogado)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        validaLogin();
    }//GEN-LAST:event_btnLogarActionPerformed

    @Override
    public void apresentaMensagem(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, HEIGHT);
    }    
    
    public void logar(){
        criaTelaPrincipal();
        this.dispose();
    }
    
    private void criaTelaPrincipal(){
        PrincipalView telaPrincipal = new PrincipalView();
        telaPrincipal.setVisible(true);
    }

    public void validaLogin(){
        Usuario usuBuscado = repositorioDeUsuarios.buscaUsuario(txtLogin.getText());
        if (usuBuscado == null){
            apresentaMensagem("O usuário digitado não foi encontrado.", "Erro de login");
        } else {
            if(usuBuscado.getSenha().equals(txtSenha.getText())){
                logar();
            }
        }
    }
    
    public static void main(String args[]) {
        
        FlatArcDarkIJTheme.setup();
        
        // Create and display the form
        java.awt.EventQueue.invokeLater(() -> {
            new LoginView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogado;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables




}
