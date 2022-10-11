/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.lojaveiculo.view;

import br.com.lojaveiculo.dao.UsuarioDAO;
import br.com.lojaveiculo.model.Usuario;
import br.com.lojaveiculo.repositorio.UsuarioRepositorio;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public final class LoginView extends javax.swing.JFrame {
    
    
    private PrincipalView telaPrincipal;
    private UsuarioRepositorio usuariosSistema;
    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        this.setContentPane(pnlPrincipal);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        //organizaLayout();
        criaUsuarios();
    }
    
    public void criaUsuarios(){
        usuariosSistema = new UsuarioDAO();
        usuariosSistema.adicionarUsuario(new Usuario("Rafael", "rafa123"));
        usuariosSistema.adicionarUsuario(new Usuario("Eduardo", "edu123"));
        usuariosSistema.adicionarUsuario(new Usuario("Matheus", "math123"));
        usuariosSistema.adicionarUsuario(new Usuario("admin", "admin"));
    }
    
    public void organizaLayout(){
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
        lblLogado.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSenha)
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogado)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(lblFundo))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblBemVindo)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lblFundo)
                .addGap(18, 18, 18)
                .addComponent(lblBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
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

    private void criaTelaPrincipal(){
        telaPrincipal = new PrincipalView();
        telaPrincipal.setVisible(true);
    }
    
    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        Usuario usuBuscado = usuariosSistema.buscaUsuario(txtLogin.getText());
        if (usuBuscado == null){
            JOptionPane.showMessageDialog(null, "O usuário digitado não foi encontrado.", "Erro de login", HEIGHT);
        } else {
            if(usuBuscado.getSenha().equals(txtSenha.getText())){
                logar();
            }
        }
    }//GEN-LAST:event_btnLogarActionPerformed

    public void logar(){
        criaTelaPrincipal();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        FlatArcDarkIJTheme.setup();
        
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblLogado;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
