/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.view;

import javax.swing.JOptionPane;
import locadorabike.controller.atualizaDAO;
import locadorabike.controller.deleteDAO;
import locadorabike.model.Usuario;

/**
 *
 * @author Cap
 */
public class menuprincipal extends javax.swing.JFrame {

    deleteDAO dDAO = new deleteDAO();
    atualizaDAO aDAO = new atualizaDAO();
    /**
     * Creates new form menuprincipal
     */
    public menuprincipal() {
        initComponents();
    }
    Usuario atuuser = new Usuario();
    public menuprincipal(Usuario user) {
        initComponents();        
        atuuser.setCpf(user.getCpf());
        atuuser.setTelefone(user.getTelefone());
        atuuser.setAdm(user.isAdm());
        atuuser.setEndereco(user.getEndereco());
        atuuser.setNome(user.getNome());
        atuuser.setSenha(user.getSenha());
        nome1.setText(user.getNome());
        cpf1.setText(Long.toString(user.getCpf()));
        endereco1.setText(user.getEndereco());
        telefone1.setText(Long.toString(user.getTelefone()));
        senha1.setText(user.getSenha());
        nomeuser.setText("Bem Vindo, " + user.getNome());
        nomeuser1.setText("Bem Vindo, " + user.getNome());
        if(!user.isAdm()){
            legenda.setVisible(false);
            criarfranq.setVisible(false);
            criarbikeasc.setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane4 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        nomeuser1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        criarfranq = new javax.swing.JButton();
        criarbikeasc = new javax.swing.JButton();
        locar = new javax.swing.JButton();
        franquias = new javax.swing.JButton();
        legenda = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        nomeuser = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        nome1 = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        telefone1 = new javax.swing.JTextField();
        endereco1 = new javax.swing.JTextField();
        excluir = new javax.swing.JButton();
        atualiza = new javax.swing.JButton();
        senha1 = new javax.swing.JPasswordField();
        cpf1 = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/user_30x30.png"))); // NOI18N
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        nomeuser1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nomeuser1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(nomeuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 260, 30));

        logout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/logout_30x30.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        criarfranq.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        criarfranq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/franquia_30x30.png"))); // NOI18N
        criarfranq.setText("FRAQUIAS");
        criarfranq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarfranqActionPerformed(evt);
            }
        });
        jPanel1.add(criarfranq, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 100));

        criarbikeasc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        criarbikeasc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/bike_30x30.png"))); // NOI18N
        criarbikeasc.setText("BIKE");
        criarbikeasc.setToolTipText("");
        criarbikeasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarbikeascActionPerformed(evt);
            }
        });
        jPanel1.add(criarbikeasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 140, 100));

        locar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        locar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/locar_30x30.png"))); // NOI18N
        locar.setText("LOCAR");
        locar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locarActionPerformed(evt);
            }
        });
        jPanel1.add(locar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 100));

        franquias.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        franquias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/franquia2_30x30.png"))); // NOI18N
        franquias.setText("FRAQUIAS");
        jPanel1.add(franquias, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 140, 100));

        legenda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        legenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        legenda.setText("O QUE VOC?? DESEJA CADASTRAR:");
        jPanel1.add(legenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 320, 30));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        jTabbedPane1.addTab("MAIN", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/user_30x30.png"))); // NOI18N
        jPanel2.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        nomeuser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nomeuser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel2.add(nomeuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 260, 30));

        nome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome.setText("NOME:");
        jPanel2.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 40));

        cpf.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpf.setText("CPF:");
        jPanel2.add(cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 40));

        endereco.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        endereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        endereco.setText("ENDERE??O:");
        jPanel2.add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 40));

        telefone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        telefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telefone.setText("SENHA:");
        jPanel2.add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 110, 40));
        jPanel2.add(nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 230, 40));

        senha.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senha.setText("TELEFONE:");
        jPanel2.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 40));
        jPanel2.add(telefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 40));
        jPanel2.add(endereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, 40));

        excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/deletar_30x30.png"))); // NOI18N
        excluir.setText("DELETAR CONTA");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPanel2.add(excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 340, 40));

        atualiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/AUTALIZAR_30x30.png"))); // NOI18N
        atualiza.setText("ATUALIZAR DADOS");
        atualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaActionPerformed(evt);
            }
        });
        jPanel2.add(atualiza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 340, 40));
        jPanel2.add(senha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 230, 40));

        cpf1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(cpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, 40));

        logout1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logout1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadorabike/view/imagens/logout_30x30.png"))); // NOI18N
        logout1.setText("LOGOUT");
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        jPanel2.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        jTabbedPane1.addTab("PERFIL", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setSize(new java.awt.Dimension(400, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        if(dDAO.deletarUser(Long.parseLong(cpf1.getText()))){
            JOptionPane.showMessageDialog(null, "O usuario " + nome1.getText() + " foi deletado!", "Usuario deletado", 1);
            LoginUsuario login = new LoginUsuario();        
            login.setVisible(true);
            this.dispose();        
        }
        else{
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel deletado o usu??rio!", "Usu??rio N??o Deletado", 2);
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void atualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaActionPerformed
        // TODO add your handling code here:
        atuuser.setNome(nome1.getText());
        atuuser.setEndereco(endereco1.getText());
        atuuser.setTelefone(Long.parseLong(telefone1.getText()));
        atuuser.setCpf(Long.parseLong(cpf1.getText()));
        atuuser.setSenha(new String(senha1.getPassword()));
        nomeuser.setText("Bem Vindo, " + atuuser.getNome());
        nomeuser1.setText("Bem Vindo, " + atuuser.getNome());
        if(aDAO.atualizarUsuario(atuuser.getCpf(), atuuser)){
            JOptionPane.showMessageDialog(null, "O usuario " + nome1.getText() + " foi Atualizado!", "Usuario Atualizado", 1);      
        }
        else{
            JOptionPane.showMessageDialog(null, "N??o foi poss??vel atualizar o usu??rio!", "Usu??rio N??o Atualizado", 2);
        }
    }//GEN-LAST:event_atualizaActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        LoginUsuario login = new LoginUsuario();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        // TODO add your handling code here:
        LoginUsuario login = new LoginUsuario();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout1MouseClicked

    private void locarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locarActionPerformed
        // TODO add your handling code here:
        Locar lc = new Locar(atuuser);
        lc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_locarActionPerformed

    private void criarfranqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarfranqActionPerformed
        // TODO add your handling code here:
        cadastroFranquia cf = new cadastroFranquia(atuuser);
        cf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_criarfranqActionPerformed

    private void criarbikeascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarbikeascActionPerformed
        // TODO add your handling code here:
        cadastroBike cb = new cadastroBike(atuuser);
        cb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_criarbikeascActionPerformed

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
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualiza;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel cpf1;
    private javax.swing.JButton criarbikeasc;
    private javax.swing.JButton criarfranq;
    private javax.swing.JLabel endereco;
    private javax.swing.JTextField endereco1;
    private javax.swing.JButton excluir;
    private javax.swing.JButton franquias;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel legenda;
    private javax.swing.JButton locar;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logout1;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField nome1;
    private javax.swing.JLabel nomeuser;
    private javax.swing.JLabel nomeuser1;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senha1;
    private javax.swing.JLabel telefone;
    private javax.swing.JTextField telefone1;
    // End of variables declaration//GEN-END:variables
}
