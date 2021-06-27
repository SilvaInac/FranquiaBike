/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.view;

import javax.swing.JOptionPane;
import locadorabike.controller.buscaDAO;
import locadorabike.exception.NaoPreenchidoException;
import locadorabike.exception.PreenchimentoInvalidoException;
import locadorabike.model.Usuario;

/**
 *
 * @author Cap
 */
public class LoginUsuario extends javax.swing.JFrame {
    buscaDAO bDAO = new buscaDAO();
    Usuario user = new Usuario();
    /**
     * Creates new form LoginUsuario
     */
    public LoginUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TITULO = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        cpf1 = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        senha1 = new javax.swing.JPasswordField();
        entrar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        informacoes = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sing UP");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TITULO.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        TITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TITULO.setText("BEM VINDO A LOCANBIKE");
        getContentPane().add(TITULO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        cpf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cpf.setText("CPF:");
        getContentPane().add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));
        getContentPane().add(cpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 290, 30));

        senha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        senha.setText("SENHA:");
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));
        getContentPane().add(senha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 290, 30));

        entrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        entrar.setText("ENTRAR");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 170, 40));

        cadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cadastrar.setText("REGISTRAR-SE");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 290, 190, 40));

        informacoes.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        informacoes.setText("CONHEÇA MAIS SOBRE NÓS");
        getContentPane().add(informacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 360, 50));

        sair.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sair.setText("SAIR");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 439, 360, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/logo_fundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 400, 500));

        setSize(new java.awt.Dimension(400, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:
        if(cpf1.getText().isEmpty() || senha1.getText().isEmpty()){
            try {
                throw new NaoPreenchidoException();
            } catch (NaoPreenchidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Campo Vazios", 2);
            }         
        }
        //CPF não pode conter pontos ou traçõs e dever conter 11 caracteres
        else if(!cpf1.getText().matches("[0-9]*")){
            try {
                throw new PreenchimentoInvalidoException(1);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "CPF Inválido", 2);
            } 
        }
        else if(cpf1.getText().length() != 11){
            try {
                throw new PreenchimentoInvalidoException(cpf1.getText().length(), 2);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "CPF Inválido", 2);
            } 
        }
        else{
            user = bDAO.buscarUsuarioPorCPF(Long.parseLong(cpf1.getText()));
            if(!user.getSenha().equals(new String(senha1.getPassword()))){
            JOptionPane.showMessageDialog(this, "Senha errada tente novamente!", "Senha Inválida", 2);
            }
            else{
                JOptionPane.showMessageDialog(this, "Bem Vindo a LocanBike!", "Bem Vindo", 1);
                menuprincipal menu = new menuprincipal(user);
        
                menu.setVisible(true);
                this.dispose();
            }
        }
        
    }//GEN-LAST:event_entrarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
        CadastroUsuario telaCadUser = new CadastroUsuario();
        
        telaCadUser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO;
    private javax.swing.JButton cadastrar;
    private javax.swing.JLabel cpf;
    private javax.swing.JTextField cpf1;
    private javax.swing.JButton entrar;
    private javax.swing.JButton informacoes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton sair;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senha1;
    // End of variables declaration//GEN-END:variables
}
