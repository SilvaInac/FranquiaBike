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
import locadorabike.model.Bicicleta;
import locadorabike.model.Usuario;

/**
 *
 * @author Usuário
 */
public class cadastroBike extends javax.swing.JFrame {
    casdastroDAO cDAO = new casdastroDAO();

    /**
     * Creates new form cadastroBike
     */
    public cadastroBike() {
        initComponents();
    }
    
    Usuario atualuser = new Usuario();
    public cadastroBike(Usuario user) {
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
        campoCor = new javax.swing.JTextField();
        labelModelo = new javax.swing.JLabel();
        campoModelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoAro = new javax.swing.JTextField();
        botaoCadastrarBike = new javax.swing.JButton();
        botaoLimparBike = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoAro1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(395, 490));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Cadastro da Bicicleta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        LabelCor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LabelCor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCor.setText("Cor:");

        campoCor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorActionPerformed(evt);
            }
        });

        labelModelo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModelo.setText("Modelo");

        campoModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Aro");

        campoAro.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CNPJ da Franquia");

        campoAro1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoAro1)
                            .addComponent(campoModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(campoCor)
                            .addComponent(campoAro))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAro1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoLimparBike, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(botaoCadastrarBike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
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

    private void campoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorActionPerformed

    private void botaoCadastrarBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarBikeActionPerformed

        //Verifica se todos os campos foram preenchidos
        if(campoCor.getText().isEmpty() || campoModelo.getText().isEmpty()
            || campoAro.getText().isEmpty()){
            try {
                throw new NaoPreenchidoException();
            } catch (NaoPreenchidoException ex) {
                JOptionPane.showMessageDialog(null, ex, "Campo Vazios", 2);
            }
        }
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
    }//GEN-LAST:event_botaoCadastrarBikeActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
        menuprincipal menu = new menuprincipal(atualuser);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoLimparBikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparBikeActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_botaoLimparBikeActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroBike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroBike().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCor;
    private javax.swing.JButton botaoCadastrarBike;
    private javax.swing.JButton botaoLimparBike;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoAro;
    private javax.swing.JTextField campoAro1;
    private javax.swing.JTextField campoCor;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelModelo;
    // End of variables declaration//GEN-END:variables

    private void limpar(){
    campoCor.setText("");
    campoModelo.setText("");
    campoAro.setText("");
}
    
}
