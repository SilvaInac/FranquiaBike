/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.view;

import javax.swing.JOptionPane;
import locadorabike.controller.casdastroDAO;
import locadorabike.exception.NaoPreenchidoException;
import locadorabike.exception.PreenchimentoInvalidoException;
import locadorabike.model.Franquia;
import locadorabike.model.Usuario;

/**
 *
 * @author Usuário
 */
public class cadastroFranquia extends javax.swing.JFrame {
    casdastroDAO cDAO = new casdastroDAO();

    /**
     * Creates new form cadastroFranquia
     */
    public cadastroFranquia() {
        initComponents();
    }
    
    Usuario atualuser = new Usuario();
    public cadastroFranquia(Usuario user) {
        initComponents();
        atualuser.setCpf(user.getCpf());
        atualuser.setTelefone(user.getTelefone());
        atualuser.setAdm(user.isAdm());
        atualuser.setEndereco(user.getEndereco());
        atualuser.setNome(user.getNome());
        atualuser.setSenha(user.getSenha());
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelCor = new javax.swing.JLabel();
        campoNomeFranq = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        campoCNPJ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        botaoCadastrarFranq = new javax.swing.JButton();
        botaoLimparFranq = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(395, 490));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Cadastro da Franquia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        LabelCor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelCor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCor.setText("Nome");

        campoNomeFranq.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNomeFranq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeFranqActionPerformed(evt);
            }
        });

        labelModelo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModelo.setText("CNPJ");

        campoCNPJ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCNPJActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Telefone");

        campoTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botaoCadastrarFranq.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botaoCadastrarFranq.setText("CADASTRAR");
        botaoCadastrarFranq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarFranqActionPerformed(evt);
            }
        });

        botaoLimparFranq.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botaoLimparFranq.setText("LIMPAR");
        botaoLimparFranq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparFranqActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botaoVoltar.setText("VOLTA");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Endereço");

        campoEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCadastrarFranq, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoLimparFranq, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeFranq, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNomeFranq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoLimparFranq, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(botaoCadastrarFranq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeFranqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeFranqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeFranqActionPerformed

    private void botaoCadastrarFranqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarFranqActionPerformed

        //Verifica se todos os campos foram preenchidos
        if(campoNomeFranq.getText().isEmpty() || campoCNPJ.getText().isEmpty()
            || campoTelefone.getText().isEmpty()){
            try {
                throw new NaoPreenchidoException();
            } catch (NaoPreenchidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Campo Vazios", 2);
            }
        }
        //Nome deve conter no minimo 6 caracteres
        else if(campoNomeFranq.getText().length() < 6){
            try {
                throw new PreenchimentoInvalidoException(campoNomeFranq.getText().length(), 1);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Nome Inválido", 2);
            }
        }
        //CPF não pode conter pontos ou traçõs e dever conter 11 caracteres
        else if(!campoCNPJ.getText().matches("[0-9]*")){
            try {
                throw new PreenchimentoInvalidoException(1);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "CNPJ Inválido", 2);
            }
        }
        else if(campoCNPJ.getText().length() != 14){
            try {
                throw new PreenchimentoInvalidoException(campoCNPJ.getText().length(), 2);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "CNPJ Inválido", 2);
            }
        }
        //verificar se o endereco contem 6 caracteres
        else if(campoTelefone.getText().length() < 6){
            try {
                throw new PreenchimentoInvalidoException(campoTelefone.getText().length(), 4);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Endereço Inválido", 2);
            }
        }
        else{
            Franquia franq = new Franquia();
            franq.setNome(campoNomeFranq.getText());
            franq.setCnpj(Long.parseLong(campoCNPJ.getText()));
            franq.setTelefone(Long.parseLong(campoTelefone.getText()));
            franq.setEndereco(campoEndereco.getText());
            System.out.println(franq.getCnpj());
            if(cDAO.inserirFranquia(franq)){
                System.out.println("Franquia cadastrada");
                JOptionPane.showMessageDialog(this,  "Franquia Cadastrada com Sucesso");
        }
    }//GEN-LAST:event_botaoCadastrarFranqActionPerformed
  }
    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal(atualuser);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void campoCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCNPJActionPerformed

    private void botaoLimparFranqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparFranqActionPerformed
        // TODO add your handling code here:s
        limpar();
    }//GEN-LAST:event_botaoLimparFranqActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroFranquia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroFranquia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroFranquia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroFranquia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroFranquia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCor;
    private javax.swing.JButton botaoCadastrarFranq;
    private javax.swing.JButton botaoLimparFranq;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoCNPJ;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNomeFranq;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelModelo;
    // End of variables declaration//GEN-END:variables
    private void limpar(){
    campoNomeFranq.setText("");
    campoCNPJ.setText("");
    campoTelefone.setText("");
    campoEndereco.setText("");
}
}
