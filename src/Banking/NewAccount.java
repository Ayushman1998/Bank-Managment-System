/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banking;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class NewAccount extends javax.swing.JFrame {/**
     * Creates new form NewAccount
     */
    public NewAccount() {
        initComponents();
        //For date
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        jTextField1.setText(sf.format(date));
        //For Account Number
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select max(Accountno) from account;");
        if(rs.next())
        {
            String s1=rs.getString("max(Accountno)");
            long acc=Long.parseLong(s1);
            long s2=acc+1;
            jTextField2.setText(""+s2);
        }
        else
            JOptionPane.showMessageDialog(this, "Something is wrong."); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        //To gain Focus in jTextField3
        jTextField3.requestFocus();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<String>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jTextField9 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Account");
        setMinimumSize(new java.awt.Dimension(820, 570));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Information Form");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 30, 460, 40);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(700, 70, 40, 20);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(580, 90, 160, 30);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setText("Account Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 110, 20);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 120, 200, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 170, 60, 20);

        jTextField3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(160, 170, 200, 30);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 90, 20);

        jTextField4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(160, 270, 200, 30);

        jComboBox1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(146, 220, 70, 30);

        jComboBox2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(220, 220, 90, 30);

        jComboBox3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(320, 220, 70, 30);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel7.setText("Phone no.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 270, 70, 20);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel8.setText("District");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 430, 46, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 310, 200, 100);

        jLabel10.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel10.setText("Address");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 320, 51, 20);

        jTextField5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(160, 430, 200, 30);

        jTextField6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(570, 280, 190, 30);

        jComboBox4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select State--", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujrat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharastra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(160, 480, 200, 30);

        jLabel12.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel12.setText("Mother's Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(440, 280, 100, 20);

        jLabel13.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel13.setText("Father's Name");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(440, 330, 100, 20);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel14.setText("Balance");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(440, 380, 70, 20);

        jLabel15.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel15.setText("State");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 480, 31, 20);

        jTextField7.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(570, 330, 190, 30);

        jTextField8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField8);
        jTextField8.setBounds(570, 380, 190, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 460, 100, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(610, 460, 90, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gender", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 12))); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jRadioButton2.setText("Female");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 150, 110, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Maritial Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sitka Small", 1, 12))); // NOI18N

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jRadioButton3.setText("Married");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jRadioButton4.setText("Unmarried");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(590, 150, 130, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/createnew.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 540);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(430, 500, 96, 27);

        jTextField9.setText("jTextField9");
        getContentPane().add(jTextField9);
        jTextField9.setBounds(410, 490, 80, 26);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(30, 20, 96, 27);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(730, 520, 45, 16);

        jTextField10.setText("jTextField10");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(630, 0, 88, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String acc, name, day, month, year, phone, add, dist, state, gender="", marid="", mname, fname;
    acc=jTextField2.getText();
    name=jTextField3.getText();
    phone=jTextField4.getText();
    add=jTextArea1.getText();
    dist=jTextField5.getText();
    mname=jTextField6.getText();
    fname=jTextField7.getText();
    
    day=jComboBox1.getSelectedItem().toString();
    month=jComboBox2.getSelectedItem().toString();
    year=jComboBox3.getSelectedItem().toString();
    state=jComboBox4.getSelectedItem().toString();
    
    Double balance=Double.parseDouble(jTextField8.getText());
    
    String date=year+"-"+month+"-"+day;
    //For Gender
    if(jRadioButton1.isSelected()==true)
        gender="Male";
    else if(jRadioButton2.isSelected()==true)
        gender="Female";
    //For Maritial Status
    if(jRadioButton3.isSelected()==true)
        marid="Married";
    else if(jRadioButton4.isSelected()==true)
        marid="Unmarried";
    //Making query
    String query="Insert into account values('"+acc+"', '"+name+"', '"+date+"', '"+phone+
            "', '"+add+"', '"+dist+"', '"+state+"', '"+gender+"', '"+marid+"', '"+mname+
            "', '"+fname+"', "+balance+");";
    // Inserting into database
    try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
            Statement st=con.createStatement();
            int rs=st.executeUpdate(query);
            if(rs==1)
                {
                    JOptionPane.showMessageDialog(this, "Saved Successfully.");
                    jButton2.doClick();
                }
                else
                    JOptionPane.showMessageDialog(this, "Something is wrong."); 
        
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    NewAccount n=new NewAccount();
    n.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
