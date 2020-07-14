package login_form;

public class Sign_up extends javax.swing.JFrame {

    Login_form objLog = new Login_form();
   
    
    public Sign_up() {
        initComponents();
        objLog.username = "balla";
        objLog.password = "kol";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Label2 = new javax.swing.JTextField();
        Label1 = new javax.swing.JTextField();
        Label3 = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        Separator2 = new javax.swing.JSeparator();
        NameIN = new javax.swing.JFormattedTextField();
        RePassIN = new javax.swing.JFormattedTextField();
        PassIN = new javax.swing.JFormattedTextField();
        checkbox = new javax.swing.JCheckBox();
        signSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up");
        setBackground(new java.awt.Color(255, 102, 102));
        setLocation(new java.awt.Point(300, 100));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Sign Up");
        jTextField1.setAutoscrolls(false);
        jTextField1.setEnabled(false);
        jTextField1.setFocusable(false);
        jTextField1.setRequestFocusEnabled(false);
        jTextField1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextField1.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        Label2.setEditable(false);
        Label2.setBackground(new java.awt.Color(0, 0, 0));
        Label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Label2.setForeground(new java.awt.Color(51, 51, 51));
        Label2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Label2.setText("Password");
        Label2.setAutoscrolls(false);
        Label2.setCaretColor(new java.awt.Color(51, 51, 51));
        Label2.setEnabled(false);
        Label2.setFocusable(false);
        Label2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label2ActionPerformed(evt);
            }
        });

        Label1.setEditable(false);
        Label1.setBackground(new java.awt.Color(0, 0, 0));
        Label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Label1.setForeground(new java.awt.Color(0, 0, 0));
        Label1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Label1.setText("Name ");
        Label1.setAutoscrolls(false);
        Label1.setCaretColor(new java.awt.Color(0, 0, 0));
        Label1.setEnabled(false);
        Label1.setFocusable(false);
        Label1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Label1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label1ActionPerformed(evt);
            }
        });

        Label3.setEditable(false);
        Label3.setBackground(new java.awt.Color(0, 0, 0));
        Label3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Label3.setForeground(new java.awt.Color(51, 51, 51));
        Label3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Label3.setText("Re-enter Password");
        Label3.setAutoscrolls(false);
        Label3.setCaretColor(new java.awt.Color(51, 51, 51));
        Label3.setEnabled(false);
        Label3.setFocusable(false);
        Label3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label3ActionPerformed(evt);
            }
        });

        checkbox.setText("I have readed story books and agreed to fairy tales.");

        signSubmit.setBackground(new java.awt.Color(0, 204, 204));
        signSubmit.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        signSubmit.setText("Submit");
        signSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RePassIN, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameIN))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PassIN))
                    .addComponent(Separator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Separator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(signSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(NameIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(PassIN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RePassIN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkbox)
                .addGap(18, 18, 18)
                .addComponent(signSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void Label1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label1ActionPerformed

    private void Label2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label2ActionPerformed

    private void Label3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label3ActionPerformed

    private void signSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signSubmitActionPerformed
       setSubmit();
    }//GEN-LAST:event_signSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Sign_up().setVisible(true);
        });
    }
    
    public void setSubmit() {
        if (NameIN.getText().length() > 0) {
            if (PassIN.getText().length() > 0 && RePassIN.getText().length() > 0) {
                String dd = PassIN.getText();
                String ee = RePassIN.getText();
                System.out.println(dd + "\n" + ee);
                System.out.println(checkbox.isSelected());
                if (dd.equals(ee) && checkbox.isSelected()) {
                    setVariables();
                    System.out.println("Submited");
                    this.dispose();
                }
            }
        }
    }

    public void getVar(String name, String pass) {
        this.objLog.username = name;
        this.objLog.password = pass;
    }
    
    public void setVariables() {
        objLog.setUsername(NameIN.getText().toLowerCase());
        objLog.setPassword(PassIN.getText().toLowerCase());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Label1;
    private javax.swing.JTextField Label2;
    private javax.swing.JTextField Label3;
    private javax.swing.JFormattedTextField NameIN;
    private javax.swing.JFormattedTextField PassIN;
    private javax.swing.JFormattedTextField RePassIN;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JCheckBox checkbox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton signSubmit;
    // End of variables declaration//GEN-END:variables
}
