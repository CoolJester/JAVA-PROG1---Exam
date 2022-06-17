/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import javax.swing.JOptionPane;

/**
 *
 * @author e19342975
 */
public class Manufacturers extends javax.swing.JFrame {

    /**
     * Creates new form Manufacturers
     */
    public Manufacturers() {
        initComponents();
    }
    
    //Objects used to store and retrive information about the manufacturers
    deviceManufacturers apple = new deviceManufacturers("APPLE", 10000000, 35000000, 20000000);
    deviceManufacturers samsung = new deviceManufacturers("SAMSUNG", 15000000, 22000000, 12000000);
    deviceManufacturers huawei = new deviceManufacturers("HUAWEI", 10000000, 11000000, 13000000);
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManufacturer = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        cbManufacturer = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnDisplayTotalSales = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblManufacturer.setText("Select Manufacturer:");

        lblYear.setText("Select Year:");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        cbManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "APPLE", "SAMSUNG", "HUAWEI" }));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020" }));

        jMenu1.setText("File");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jMenu1.add(btnExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        jMenuItem2.setText("Submission");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        btnDisplayTotalSales.setText("Display Total Sales");
        btnDisplayTotalSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayTotalSalesActionPerformed(evt);
            }
        });
        jMenu2.add(btnDisplayTotalSales);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbManufacturer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblManufacturer)
                            .addComponent(lblYear))
                        .addGap(0, 153, Short.MAX_VALUE))
                    .addComponent(cbYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManufacturer)
                .addGap(18, 18, 18)
                .addComponent(cbManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblYear)
                .addGap(18, 18, 18)
                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        //Closing the program
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        //Running the method thats handles the event
        formSubmission();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        //Running the method thats handles the event
        formSubmission();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnDisplayTotalSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayTotalSalesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Total units sold for " + apple.getName() + " is " + apple.getTotalSales() + "\n"
                                          + "Total units sold for " + samsung.getName() + " is " + samsung.getTotalSales() + "\n"
                                          + "Total units sold for " + huawei.getName() + " is " + huawei.getTotalSales() + "\n");
    }//GEN-LAST:event_btnDisplayTotalSalesActionPerformed

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
            java.util.logging.Logger.getLogger(Manufacturers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manufacturers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manufacturers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manufacturers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manufacturers().setVisible(true);
            }
        });
    }
    
    //method used for handling the submission
    public void formSubmission(){
        //Getting the options selected by the user from the combo boxes
        String selectedManufacturer = cbManufacturer.getSelectedItem().toString();
        String selectedYear = cbYear.getSelectedItem().toString();
        
        //Checking who is the manufacturer
        switch(selectedManufacturer){
            case "APPLE":
                if (selectedYear.equals("2018")){
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + apple.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + apple.getSales2018());
                }else if (selectedYear.equals("2019")){
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + apple.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + apple.getSales2019());
                }else{
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + apple.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + apple.getSales2020());
                }
                break;
            case "SAMSUNG":
                if (selectedYear.equals("2018")){
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + samsung.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + samsung.getSales2018());
                }else if (selectedYear.equals("2019")){
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + samsung.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + samsung.getSales2019());
                }else{
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + samsung.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + samsung.getSales2020());
                }
                break;
            case "HUAWEI":
                if (selectedYear.equals("2018")){
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + huawei.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + huawei.getSales2018());
                }else if (selectedYear.equals("2019")){
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + huawei.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + huawei.getSales2019());
                }else{
                    JOptionPane.showMessageDialog(null, "MANUFACTURER: " + huawei.getName() + "\nYEAR: " + selectedYear + "\nUNITS SOLD: " + huawei.getSales2020());
                }
                break;
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnDisplayTotalSales;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbManufacturer;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblYear;
    // End of variables declaration//GEN-END:variables
}
