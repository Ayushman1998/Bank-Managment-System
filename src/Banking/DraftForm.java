/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay Kumar
 */
public class DraftForm extends javax.swing.JFrame {

    /**
     * Creates new form DraftForm
     */
    public DraftForm() {
        initComponents();
        //For date
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        jTextField1.setText(sf.format(date));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Draft Form");
        setMinimumSize(new java.awt.Dimension(485, 415));
        getContentPane().setLayout(null);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(290, 20, 160, 30);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 30, 40, 20);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Draft Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 80, 100, 20);

        jTextField2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(200, 80, 200, 30);

        jTextField3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 240, 200, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("In Favour of");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 140, 90, 20);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Account No");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(70, 250, 90, 20);

        jTextField4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(200, 290, 200, 30);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Amount");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 300, 60, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save Draft");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 330, 120, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 130, 200, 96);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/deposit.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 480, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    double amt=Double.parseDouble(jTextField4.getText());
    String date=jTextField1.getText();
    String draftno=jTextField2.getText();
    String acc=jTextField3.getText();
    String favour=jTextArea1.getText();
    //First try statement starts to check account.
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
        Statement st=conn.createStatement();
        ResultSet set=st.executeQuery("Select * from account where Accountno='"+acc+"';");
        if(set.next())
        {
            
    String query="Insert into draft values('"+draftno+"', '"+date+"', '"+favour+"', '"+acc+
            "', "+amt+");";
    
    //try statement to uodate balance sheet.
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
        st=conn.createStatement();
        int rs=st.executeUpdate(query);
            if(rs==1)
                {
                    JOptionPane.showMessageDialog(this, "Draft Saved Successfully.");
                    jTextField2.setText(""); 
                    jTextField3.setText(""); 
                    jTextField4.setText(""); 
                    jTextArea1.setText(""); 
               }
                else
                    JOptionPane.showMessageDialog(this, "Something is wrong.");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    //end of if statement.
    
        }
        else
            JOptionPane.showMessageDialog(this, "Account does not exist.");
    //End of first try.
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DraftForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DraftForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DraftForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DraftForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DraftForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
