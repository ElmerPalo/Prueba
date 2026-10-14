
public class Main extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());
    
    //Variables
    boolean A0,A1,A2,A3,B0,B1,B2,B3,C0,output7,output6,output5,output4,output3,output2,output1,output0;
    String binA, binB;
   
    public Main() {
        initComponents();
    }
    
    private void actRes(){     //Muestra
    
    String res = "";
    res += output7 ? "1" : "0";
    res += output6 ? "1" : "0";
    res += output5 ? "1" : "0";
    res += output4 ? "1" : "0";
    res += output3 ? "1" : "0";
    res += output2 ? "1" : "0";
    res += output1 ? "1" : "0";
    res += output0 ? "1" : "0";
    
    txtMos.setText(res);
    }
    
    private void asig(){       // Asigna
    binA =(txtBinA.getText());
    binB =(txtBinB.getText());
 
    A3 = binA.charAt(0) == '1';
    A2 = binA.charAt(1) == '1';
    A1 = binA.charAt(2) == '1';
    A0 = binA.charAt(3) == '1';
    
    B3 = (binB.charAt(0) == '1');
    B2 = (binB.charAt(1) == '1');
    B1 = (binB.charAt(2) == '1');
    B0 = (binB.charAt(3) == '1');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        txtBinA = new javax.swing.JTextField();
        txtBinB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDel = new javax.swing.JButton();
        txtDel = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton6.setText("jButton6");

        jButton5.setText("jButton5");

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        btnsuma.setText("Sumar");
        btnsuma.addActionListener(this::btnsumaActionPerformed);

        btnresta.setText("Restar");
        btnresta.addActionListener(this::btnrestaActionPerformed);

        btnmulti.setText("Multiplicar");
        btnmulti.addActionListener(this::btnmultiActionPerformed);

        jLabel1.setText("Ingresar Bin A:");

        jLabel2.setText("Ingresar Bin B:");

        jLabel3.setText("Resultado:");

        btnDel.setText("Decimal");
        btnDel.addActionListener(this::btnDelActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                    .addComponent(txtBinA)
                    .addComponent(txtBinB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmulti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnresta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsuma)
                    .addComponent(txtBinA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnresta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmulti)
                    .addComponent(txtBinB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnDel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed

    asig();
        
    boolean xor0 = A0 ^ B0;
    output0 = xor0 ^ false;
    boolean cout0 = (A0 && B0) || (false && xor0);

    boolean xor1 = A1 ^ B1;
    output1 = xor1 ^ cout0;
    boolean cout1 = (A1 && B1) || (cout0 && xor1);

    boolean xor2 = A2 ^ B2;
    output2 = xor2 ^ cout1;
    boolean cout2 = (A2 && B2) || (cout1 && xor2);

    boolean xor3 = A3 ^ B3;
    output3 = xor3 ^ cout2;
    output4 = (A3 && B3) || (cout2 && xor3);
    
    actRes();
    
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
 
    asig();
    
    B3 = !(binB.charAt(0) == '1');
    B2 = !(binB.charAt(1) == '1');
    B1 = !(binB.charAt(2) == '1');
    B0 = !(binB.charAt(3) == '1');

    C0 = true;

    boolean C1 = B0&&C0;
    B0 = B0^C0;
    boolean C2 = B1&&C1;
    B1 = B1^C1;
    boolean C3 = B2&&C2;
    B2 = B2^C2;
    boolean C4 = B3&&C3;
    B3 = B3^C3;    
        
    boolean xor0 = A0 ^ B0;
    output0 = xor0 ^ false;
    boolean cout0 = (A0 && B0) || (false && xor0);

    boolean xor1 = A1 ^ B1;
    output1 = xor1 ^ cout0;
    boolean cout1 = (A1 && B1) || (cout0 && xor1);

    boolean xor2 = A2 ^ B2;
    output2 = xor2 ^ cout1;
    boolean cout2 = (A2 && B2) || (cout1 && xor2);

    boolean xor3 = A3 ^ B3;
    output3 = xor3 ^ cout2;
    output4 = (A3 && B3) || (cout2 && xor3);
    
    output4 = false;
    
    actRes();        
        
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
               
    asig();    
        
    output0 = A0 && B0; //Resultado
    boolean S0A0 = A0 && B1;
    boolean S0A1 = A0 && B2;
    boolean S0A2 = A0 && B3;
    boolean S0A3 =  false;

    boolean S0B0 = A1 && B0;
    boolean S0B1 = A1 && B1;
    boolean S0B2 = A1 && B2;
    boolean S0B3 = A1 && B3;
     
    C0 = false;

    boolean S0xor0 = S0A0 ^ S0B0;
    output1 = S0xor0 ^ C0; //Resultado
    boolean S0cout0 = (S0A0 && S0B0) || (C0 && S0xor0);

    boolean S0xor1 = S0A1 ^ S0B1;
    boolean  S1A0 = S0xor1 ^ S0cout0;
    boolean S0cout1 = (S0A1 && S0B1) || (S0cout0 && S0xor1);

    boolean S0xor2 = S0A2 ^ S0B2;
    boolean  S1A1 = S0xor2 ^ S0cout1;
    boolean S0cout2 = (S0A2 && S0B2) || (S0cout1 && S0xor2);

    boolean S0xor3 = S0A3 ^ S0B3;
    boolean  S1A2 = S0xor3 ^ S0cout2;
    boolean  S1A3 = (S0A3 && S0B3) || (S0cout2 && S0xor3);

    boolean S1B0 = A2 && B0;
    boolean S1B1 = A2 && B1;
    boolean S1B2 = A2 && B2;
    boolean S1B3 = A2 && B3;

    boolean S1xor0 = S1A0 ^ S1B0;
    output2 = S1xor0 ^ C0; //Resultado
    boolean S1cout0 = (S1A0 && S1B0) || (C0 && S1xor0);

    boolean S1xor1 = S1A1 ^ S1B1;
    boolean  S2A0 = S1xor1 ^ S1cout0;
    boolean S1cout1 = (S1A1 && S1B1) || (S1cout0 && S1xor1);

    boolean S1xor2 = S1A2 ^ S1B2;
    boolean  S2A1 = S1xor2 ^ S1cout1;
    boolean S1cout2 = (S1A2 && S1B2) || (S1cout1 && S1xor2);

    boolean S1xor3 = S1A3 ^ S1B3;
    boolean  S2A2 = S1xor3 ^ S1cout2;
    boolean  S2A3 = (S1A3 && S1B3) || (S1cout2 && S1xor3);

    boolean S2B0 = A3 && B0;
    boolean S2B1 = A3 && B1;
    boolean S2B2 = A3 && B2;
    boolean S2B3 = A3 && B3;

    boolean S2xor0 = S2A0 ^ S2B0;
    output3 = S2xor0 ^ C0; //Resultado
    boolean S2cout0 = (S2A0 && S2B0) || (C0 && S2xor0);

    boolean S2xor1 = S2A1 ^ S2B1;
    output4 = S2xor1 ^ S2cout0;
    boolean S2cout1 = (S2A1 && S2B1) || (S2cout0 && S2xor1);

    boolean S2xor2 = S2A2 ^ S2B2;
    output5 = S2xor2 ^ S2cout1;
    boolean S2cout2 = (S2A2 && S2B2) || (S2cout1 && S2xor2);

    boolean S2xor3 = S2A3 ^ S2B3;
    output6 = S2xor3 ^ S2cout2;
    output7 = (S2A3 && S2B3) || (S2cout2 && S2xor3);   
    
    actRes();
    
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBinA;
    private javax.swing.JTextField txtBinB;
    private javax.swing.JTextField txtDel;
    private javax.swing.JTextField txtMos;
    // End of variables declaration//GEN-END:variables
}
