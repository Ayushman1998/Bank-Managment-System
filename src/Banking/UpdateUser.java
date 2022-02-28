/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshay Kumar
 */
public class UpdateUser extends javax.swing.JFrame {

    /**
     * Creates new form UpdateUser
     */
    public UpdateUser() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update User Information");
        setMinimumSize(new java.awt.Dimension(798, 425));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update User");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 20, 220, 30);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 120, 60, 20);

        jTextField2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 120, 200, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 170, 60, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(160, 170, 60, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(240, 170, 80, 30);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 210, 90, 20);

        jComboBox1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 210, 70, 30);

        jComboBox2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(220, 210, 90, 30);

        jComboBox3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(320, 210, 70, 30);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone no.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 260, 70, 20);

        jTextField3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 260, 200, 30);

        jLabel10.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(440, 160, 52, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(540, 140, 200, 100);

        jLabel12.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("User Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 80, 90, 20);

        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(160, 70, 200, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 320, 90, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 320, 90, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 70, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/createuser.jpg"))); // NOI18N
        jLabel1.setText("                                                                                                                                                                                                                                                                          ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String user=jTextField1.getText();
    //Making query
    String query="Select * from user where User='"+user+"';";
    // Inserting into database
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        if(rs.next())
        {
           String name=rs.getString("Name");
           String phone=rs.getString("Phone");
           String add=rs.getString("Address");
           String gender=rs.getString("Gender");
           Date date=rs.getDate("DateOfBirth");
           
           jTextField2.setText(""+name);
           jTextField3.setText(""+phone);
           jTextArea1.setText(""+add);
           if(gender.equals("Male"))
               jRadioButton1.setSelected(true);
           else if(gender.equals("Female"))
               jRadioButton2.setSelected(true);
           SimpleDateFormat day=new SimpleDateFormat("dd");
           jComboBox1.setSelectedItem(day.format(date));
           SimpleDateFormat mon=new SimpleDateFormat("MM");
           jComboBox2.setSelectedItem(mon.format(date));
           SimpleDateFormat yr=new SimpleDateFormat("yyyy");
           jComboBox3.setSelectedItem(yr.format(date));
        }
        else
            JOptionPane.showMessageDialog(this, "User does not exist.");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String name, day, month, year, phone, add, gender="", user, utype;
    name=jTextField2.getText();
    phone=jTextField3.getText();
    add=jTextArea1.getText();
    user=jTextField1.getText();
    
    day=jComboBox1.getSelectedItem().toString();
    month=jComboBox2.getSelectedItem().toString();
    year=jComboBox3.getSelectedItem().toString();
    
    String date=year+"-"+month+"-"+day;
    //For Gender
    if(jRadioButton1.isSelected()==true)
        gender="Male";
    else if(jRadioButton2.isSelected()==true)
        gender="Female";
    //Making query
    String query="Update user set Name='"+name+"', DateOfBirth='"+date+"', Phone='"
            +phone+"', Address='"+add+"', Gender='"+gender+"' where User='"+user+"';";
    int res=JOptionPane.showConfirmDialog(this, "Wanna update record for sure?");
    if(res==JOptionPane.YES_OPTION)
    {
    // Inserting into database
    try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
            Statement st=con.createStatement();
            int rs=st.executeUpdate(query);
            if(rs==1)
                {
                    JOptionPane.showMessageDialog(this, "Updated Successfully.");
                }
                else
                    JOptionPane.showMessageDialog(this, "Something is wrong.");
            //Resetting form
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextArea1.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            jRadioButton1.setSelected(false);                    
            jRadioButton2.setSelected(false);                    
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String user=jTextField1.getText();
    //Making query
    String query="Delete from user where User='"+user+"';";
    int res=JOptionPane.showConfirmDialog(this, "Wanna delete record for sure?");
    if(res==JOptionPane.YES_OPTION)
    {
    // Inserting into database
    try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
            Statement st=con.createStatement();
            int rs=st.executeUpdate(query);
            if(rs==1)
                {
                    JOptionPane.showMessageDialog(this, "Deleted Successfully.");
                }
                else
                    JOptionPane.showMessageDialog(this, "Something is wrong.");
            //Resetting form
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextArea1.setText("");
            jComboBox1.setSelectedIndex(0);
            jComboBox2.setSelectedIndex(0);
            jComboBox3.setSelectedIndex(0);
            jRadioButton1.setSelected(false);                    
            jRadioButton2.setSelected(false);                     
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}