/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshay Kumar
 */
public class BalanceSheet extends javax.swing.JFrame {

    /**
     * Creates new form BalanceSheet
     */
    public BalanceSheet() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Balance Sheet");
        setMinimumSize(new java.awt.Dimension(773, 530));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account no", "Date", "Mode", "Deposit", "Debit", "Balance", "From/To Account"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 120, 720, 350);

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Balance Sheet");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 20, 200, 30);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account No");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 80, 80, 20);

        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 70, 150, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 70, 80, 30);

        jComboBox1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(400, 70, 70, 30);

        jComboBox2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(480, 70, 90, 30);

        jComboBox3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(580, 70, 70, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(660, 70, 80, 30);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(380, 60, 10, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/allcust.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 760, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jComboBox1.setSelectedIndex(0);
    jComboBox2.setSelectedIndex(0);
    jComboBox3.setSelectedIndex(0);
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    //Removing rows.
    int rows=model.getRowCount();
    if(rows>0)
    {
        for(int i=0; i<rows; i++)
            model.removeRow(0);
    }
    String acc=jTextField1.getText();
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select * from balancesheet where Accountno='"+acc+"';");
        while(rs.next())
       {
            String s1=rs.getString("Accountno");
            String s2=rs.getString("Date");
            String s3=rs.getString("Mode");
            String s4=rs.getString("Deposit");
            String s5=rs.getString("Debit");
            String s6=rs.getString("Balance");
            String s7=rs.getString("from_to_Account");
            model.addRow(new Object[]{s1, s2, s3, s4, s5, s6, s7});
       }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField1.setText("");
    String day, month, year;
    day=jComboBox1.getSelectedItem().toString();
    month=jComboBox2.getSelectedItem().toString();
    year=jComboBox3.getSelectedItem().toString();
    //Making Date
    String date=year+"-"+month+"-"+day;
    
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    //Removing rows.
    int rows=model.getRowCount();
    if(rows>0)
    {
        for(int i=0; i<rows; i++)
            model.removeRow(0);
    }
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select * from balancesheet where Date='"+date+"';");
        while(rs.next())
       {
            String s1=rs.getString("Accountno");
            String s2=rs.getString("Date");
            String s3=rs.getString("Mode");
            String s4=rs.getString("Deposit");
            String s5=rs.getString("Debit");
            String s6=rs.getString("Balance");
            String s7=rs.getString("from_to_Account");
            model.addRow(new Object[]{s1, s2, s3, s4, s5, s6, s7});
       }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    int nrow=model.getRowCount();
    if(nrow==0)
    {
        JOptionPane.showMessageDialog(this, "Record does not found.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BalanceSheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
