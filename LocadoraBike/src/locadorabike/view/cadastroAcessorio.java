/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadorabike.view;

import javax.swing.JOptionPane;
import locadorabike.exception.NaoPreenchidoException;
import locadorabike.exception.PreenchimentoInvalidoException;

/**
 *
 * @author Usuário
 */
public class cadastroAcessorio extends javax.swing.JFrame {

    /**
     * Creates new form cadastroAcessorio
     */
    public cadastroAcessorio() {
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

        jPanel1 = new javax.swing.JPanel();
        LabelCor = new javax.swing.JLabel();
        labelModelo = new javax.swing.JLabel();
        botaoCadastrarBike = new javax.swing.JButton();
        botaoLimparBike = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Cadastro do Acessorio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        LabelCor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelCor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCor.setText("Cor:");

        labelModelo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModelo.setText("Tamanho:");

        botaoCadastrarBike.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botaoCadastrarBike.setText("CADASTRAR");
        botaoCadastrarBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarBikeActionPerformed(evt);
            }
        });

        botaoLimparBike.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botaoLimparBike.setText("LIMPAR");
        botaoLimparBike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparBikeActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botaoVoltar.setText("VOLTA");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCadastrarBike, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoLimparBike, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(211, 211, 211)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoLimparBike, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(botaoCadastrarBike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarBikeActionPerformed

        /*
        //Verifica se todos os campos foram preenchidos
        if(campoCor.getText().isEmpty() || campoModelo.getText().isEmpty()
            || campoAro.getText().isEmpty()){
            try {
                throw new NaoPreenchidoException();
            } catch (NaoPreenchidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Campo Vazios", 2);
            }
        }git
        //Nome deve conter no minimo 6 caracteres
        else if(campoCor.getText().length() < 3){
            try {
                throw new PreenchimentoInvalidoException(campoCor.getText().length(), 1);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Cor invalida", 2);
            }
        }
        //CPF não pode conter pontos ou traçõs e dever conter 11 caracteres
        else if(campoModelo.getText().length() < 3){
            try {
                throw new PreenchimentoInvalidoException(1);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Modelo Invalido", 2);
            }
        }
        //verificar se o endereco contem 6 caracteres
        else if(campoAro.getText().length() < 2){
            try {
                throw new PreenchimentoInvalidoException(campoAro.getText().length(), 4);
            } catch (PreenchimentoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Tamanho do aro Invalido", 2);
            }
        }
        else{
            Bicicleta bike = new Bicicleta();
            bike.setCor(campoCor.getText());
            bike.setModelo(campoModelo.getText());
            bike.setAro(Integer.parseInt(campoAro.getText()));
            bike.setLocada(false);
            if(cDAO.inserirBicibleta(bike)){
                System.out.println("Bicicleta cadastrada");
                JOptionPane.showMessageDialog(this,  "Bicicleta Cadastrada com Sucesso!");

            }
        }
        */
    }//GEN-LAST:event_botaoCadastrarBikeActionPerformed

    private void botaoLimparBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparBikeActionPerformed
        // TODO add your handling code here:
        //limpar();
    }//GEN-LAST:event_botaoLimparBikeActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        /*menuprincipal menu = new menuprincipal(atualuser);
        menu.setVisible(true);
        this.dispose();
        */
    }//GEN-LAST:event_botaoVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroAcessorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroAcessorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCor;
    private javax.swing.JButton botaoCadastrarBike;
    private javax.swing.JButton botaoLimparBike;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelModelo;
    // End of variables declaration//GEN-END:variables
   /* private void limpar(){
    campoCor.setText("");
    campoModelo.setText("");
    campoAro.setText("");
    }
*/
}
