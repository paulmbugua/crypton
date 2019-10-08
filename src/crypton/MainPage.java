package crypton;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainPage extends javax.swing.JFrame {
    public MainPage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statuslbl = new javax.swing.JLabel();
        Filechooser = new javax.swing.JFileChooser();
        filepathlbl = new javax.swing.JLabel();
        Encryptbtn = new javax.swing.JButton();
        Decryptbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        transposetxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        visiblecheck = new javax.swing.JCheckBox();
        passwordtxt = new javax.swing.JPasswordField();
        advancedbtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        filemenu = new javax.swing.JMenu();
        Exitmenuitem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crypton Application");

        Filechooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilechooserActionPerformed(evt);
            }
        });

        Encryptbtn.setText("Encrypt");
        Encryptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptbtnActionPerformed(evt);
            }
        });

        Decryptbtn.setText("Decrypt");
        Decryptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptbtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Transpose Value");

        jLabel2.setText("Password:");

        visiblecheck.setText("View");
        visiblecheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visiblecheckActionPerformed(evt);
            }
        });

        advancedbtn.setText("Advanced....");
        advancedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedbtnActionPerformed(evt);
            }
        });

        filemenu.setText("File..");

        Exitmenuitem.setText("Exit");
        Exitmenuitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitmenuitemMouseClicked(evt);
            }
        });
        filemenu.add(Exitmenuitem);

        jMenuBar1.add(filemenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(filepathlbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Filechooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Decryptbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Encryptbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(advancedbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statuslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(passwordtxt)
                                        .addGap(42, 42, 42)
                                        .addComponent(visiblecheck)
                                        .addGap(216, 216, 216))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(transposetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Encryptbtn)
                        .addGap(18, 18, 18)
                        .addComponent(Decryptbtn)
                        .addGap(29, 29, 29)
                        .addComponent(advancedbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Filechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(filepathlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(transposetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visiblecheck))
                .addGap(18, 18, 18)
                .addComponent(statuslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitmenuitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitmenuitemMouseClicked
      System.exit(0);
    }//GEN-LAST:event_ExitmenuitemMouseClicked

    private void FilechooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilechooserActionPerformed
    String filepath=Filechooser.getSelectedFile().toString();
    statuslbl.setText(filepath+".........selected");
    filepathlbl.setText(filepath);
    }//GEN-LAST:event_FilechooserActionPerformed

    private void visiblecheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visiblecheckActionPerformed
        if(visiblecheck.isSelected())
        {
           
             passwordtxt.setEchoChar((char)0);
        }
        else{
            passwordtxt.setEchoChar('*');
        }
    }//GEN-LAST:event_visiblecheckActionPerformed

    private void EncryptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptbtnActionPerformed
        try {
            String filepath=filepathlbl.getText();
            String password=passwordtxt.getText();
            
            if(filepath.isEmpty()||password.isEmpty()||transposetxt.getText().isEmpty()){
                statuslbl.setForeground(Color.red);
                statuslbl.setText("missing fields");
            }else{
                int transpose=Integer.parseInt(transposetxt.getText());
            Getfile gf= new Getfile();
            gf.Encrypt(transpose, password, filepath);
               statuslbl.setForeground(Color.green);
                statuslbl.setText("Encrypted");}
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EncryptbtnActionPerformed

    private void DecryptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptbtnActionPerformed
        try {
            String filepath=filepathlbl.getText();
            String password=passwordtxt.getText();
            
            if(filepath.isEmpty()||password.isEmpty()||transposetxt.getText().isEmpty()){
               statuslbl.setForeground(Color.red);
                statuslbl.setText("missing fields");
            }else{
                int transpose=Integer.parseInt(transposetxt.getText());
            Getfile gf1= new Getfile();
            gf1.Decrypt(transpose, password, filepath);
             statuslbl.setForeground(Color.green);
                statuslbl.setText("Decrypted");}
        } catch (IOException ex) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DecryptbtnActionPerformed

    private void advancedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedbtnActionPerformed
  Advanced adv= new Advanced();
  adv.setVisible(true);
    }//GEN-LAST:event_advancedbtnActionPerformed
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Decryptbtn;
    private javax.swing.JButton Encryptbtn;
    private javax.swing.JMenuItem Exitmenuitem;
    private javax.swing.JFileChooser Filechooser;
    private javax.swing.JButton advancedbtn;
    private javax.swing.JMenu filemenu;
    private javax.swing.JLabel filepathlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel statuslbl;
    private javax.swing.JTextField transposetxt;
    private javax.swing.JCheckBox visiblecheck;
    // End of variables declaration//GEN-END:variables
}
