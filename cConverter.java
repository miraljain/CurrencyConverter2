/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cConverts;

/**
 *
 * @author hp
 */
public class cConverter extends javax.swing.JFrame {
          double US_DOLLAR = 69.75;
          double PAK_RUP = 0.46;
          double JAP_YEN = 0.64;
          double CH_YUAN = 10.11;
          double ENG_PND = 87.96;
          double CAN_DOL = 51.65;
   
    public cConverter() {
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

        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jcmbCurrency = new javax.swing.JComboBox();
        jtxtConvert = new javax.swing.JTextField();
        jlblConvert = new javax.swing.JLabel();
        jbtnconvert = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();

        label2.setText("label2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Currency Converter");

        jcmbCurrency.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT", "USA", "JAPAN", "CANADA", "ENGLAND", "CHINA", "PAKISTAN" }));
        jcmbCurrency.setName("Country"); // NOI18N
        jcmbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrencyActionPerformed(evt);
            }
        });

        jtxtConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtConvertActionPerformed(evt);
            }
        });

        jlblConvert.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jbtnconvert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnconvert.setText("CONVERT");
        jbtnconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnconvertActionPerformed(evt);
            }
        });

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnreset.setText("RESET");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnexit.setText("EXIT");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtConvert, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(jlblConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jbtnconvert)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnreset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnconvert, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrencyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbCurrencyActionPerformed

    private void jbtnconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnconvertActionPerformed
             double indrup = Double.parseDouble(jtxtConvert.getText());
             
             if(jcmbCurrency.getSelectedItem().equals("PAKISTAN"))
             {
                  String cConvert1 = String.format("%.2f ruppees", indrup*PAK_RUP);
                  jlblConvert.setText(cConvert1);
             }
             if(jcmbCurrency.getSelectedItem().equals("USA"))
             {
                  String cConvert1 = String.format("%.2f US Dollars", indrup*US_DOLLAR);
                  jlblConvert.setText(cConvert1);
             }
             if(jcmbCurrency.getSelectedItem().equals("ENGLAND"))
             {
                  String cConvert1 = String.format("%.2f pounds", indrup*ENG_PND);
                  jlblConvert.setText(cConvert1);
             }
             if(jcmbCurrency.getSelectedItem().equals("JAPAN"))
             {
                  String cConvert2 = String.format("%.2f yen", indrup*JAP_YEN);
                  
                  jlblConvert.setText(cConvert2);
             }
             if(jcmbCurrency.getSelectedItem().equals("CANADA"))
             {
                  String cConvert3 = String.format("%.2f dollars", indrup*CAN_DOL);
                  jlblConvert.setText(cConvert3);
             }
             if(jcmbCurrency.getSelectedItem().equals("CHINA"))
             {
                  String cConvert4 = String.format("%.2f yuan", indrup*CH_YUAN);
                  jlblConvert.setText(cConvert4);
             }
    }//GEN-LAST:event_jbtnconvertActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
           System.exit(0);
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jtxtConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtConvertActionPerformed

    }//GEN-LAST:event_jtxtConvertActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
          jtxtConvert.setText(null);
          jlblConvert.setText(null);
          jcmbCurrency.setSelectedIndex(0);
          
    }//GEN-LAST:event_jbtnresetActionPerformed

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
            java.util.logging.Logger.getLogger(cConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnconvert;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JComboBox jcmbCurrency;
    private javax.swing.JLabel jlblConvert;
    private javax.swing.JTextField jtxtConvert;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
