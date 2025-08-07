
package project;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.io.FileWriter;
//import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import project.receipt;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author xpert computers
 */
public class payment extends javax.swing.JFrame {
double totalAmount;
// create new class of generate receipt
 public String generatereceipt(){
   double Total = 0;
   StringBuilder receipt = new StringBuilder();
     receipt.append("Thanks for your order\n");
   receipt.append("\t   Cafe Receipt\n");
   receipt.append("====================================\n");
   receipt.append("Qty\tItem\tPrice\n");
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
String currentDate = sdf.format(new Date());
mysqlmodel m1 = new mysqlmodel(); 
   for (int i = 0; i < model.getRowCount(); i++) {
       String Item_name = model.getValueAt(i, 0).toString();
        int Quantity = Integer.parseInt(model.getValueAt(i, 1).toString());  // Conve
       //String Quantity = model.getValueAt(i, 1).toString();  // Convert to int
   double Price = Double.parseDouble(model.getValueAt(i, 2).toString()); // Convert to double

       //String Price = model.getValueAt(i, 2).toString();
       receipt.append(Quantity + "\t" + Item_name + "\t" + Price + "\n");
       Total += Price;
        m1.saveSale(Item_name, Quantity, Price, Total, currentDate);
   } 
   receipt.append("------------------------------------\n");
   receipt.append("Total:\t\t" + Total + "\n");
    receipt.append("Date: " + currentDate + "\n");
      receipt.append("Enjoy your meal. cafe solace\n");
  
  
   return receipt.toString(); // ✅ return the receipt text
}


DefaultTableModel model;
   public payment(double amount, DefaultTableModel passedModel){
     
        initComponents();
        this.totalAmount = amount;
  this.model = passedModel;
 totalamount.setText(String.format("%.2f", amount));

}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        totalamount = new javax.swing.JLabel();
        enteramount = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        Change = new javax.swing.JTextField();
        AMOUNT1 = new javax.swing.JLabel();
        totalamount1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(60, 20, 28));

        totalamount.setBackground(new java.awt.Color(255, 255, 255));
        totalamount.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        totalamount.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setText("CONFIRM PAYMENT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("CHANGE:");

        AMOUNT1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        AMOUNT1.setForeground(new java.awt.Color(255, 255, 255));
        AMOUNT1.setText("ENTER THE AMOUNT:");

        totalamount1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        totalamount1.setForeground(new java.awt.Color(255, 255, 255));
        totalamount1.setText("TOTAL AMOUNT:");

        jButton3.setText("Generate Receipt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(totalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(totalamount1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(124, 124, 124)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(114, 114, 114)
                                    .addComponent(label))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(AMOUNT1)))
                            .addGap(31, 31, 31)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Change, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                        .addComponent(enteramount, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(totalamount1)
                .addGap(18, 18, 18)
                .addComponent(totalamount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(AMOUNT1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enteramount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(368, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        // 1. Get values from fields
      //  double change = Double.parseDouble(Change.getText());
        double paidAmount = Double.parseDouble(enteramount.getText());

        // 2. Calculate change
        double change = paidAmount - totalAmount;
        Change.setText(String.valueOf(change));

        // 3. Get customer email
       String customerEmail = LOGIN_FORM.loggedInEmail;
if (customerEmail == null || customerEmail.isEmpty()) {
    JOptionPane.showMessageDialog(this, "No email found. Please login again.");
    return;
}
        else {
        // 4. Generate receipt message
        String subject = "Your Cafe Receipt";
       
        String message = generatereceipt(); // Send full receipt in the email

        // 5. Send the email
        emailsending.sendEmail(customerEmail, subject, message);// first wright the file name of emailsending

        // 6. Show receipt window
       String receiptText = generatereceipt(); // ✅ generate the receipt
receipt r = new receipt(receiptText);   // ✅ pass the string to the receipt window
JOptionPane.showMessageDialog(null, "Email sent successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for amount.");
    } catch (Exception ex) {
        ex.printStackTrace();
    }

            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
   // DefaultTableModel model = (DefaultTableModel)table.getModel();
String receiptText = generatereceipt(); // ✅ get the receipt string
    receipt r = new receipt(receiptText);   // ✅ pass to receipt window
    r.setVisible(true); 
//generatereceipt();
//receipt r = new receipt();
//r.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             //   new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMOUNT1;
    private javax.swing.JTextField Change;
    private javax.swing.JTextField enteramount;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel totalamount;
    private javax.swing.JLabel totalamount1;
    // End of variables declaration//GEN-END:variables

   

}
