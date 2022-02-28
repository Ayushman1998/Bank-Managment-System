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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Akshay Kumar
 */
public class UpdateAccount extends javax.swing.JFrame {

    /**
     * Creates new form UpdateAccount
     */
    public UpdateAccount() {
        initComponents();
        //For date
        Date date=new Date();
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        jTextField1.setText(sf.format(date));
        jTextField2.requestFocus();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Customer Information");
        setMinimumSize(new java.awt.Dimension(680, 670));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Updation Form");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 260, 40);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(610, 20, 40, 20);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(490, 40, 160, 30);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel4.setText("Account Number");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 60, 110, 20);

        jTextField2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(140, 60, 200, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 110, 60, 20);

        jTextField3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(140, 110, 200, 30);

        jLabel6.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 160, 90, 20);

        jTextField4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(140, 210, 200, 30);

        jComboBox1.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(120, 160, 70, 30);

        jComboBox2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(200, 160, 90, 30);

        jComboBox3.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2008", "2009", "2010" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(300, 160, 70, 30);

        jLabel7.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel7.setText("Phone no.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 210, 70, 20);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel8.setText("District");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 370, 48, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 250, 200, 100);

        jLabel10.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel10.setText("Address");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 260, 52, 20);

        jTextField5.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(140, 370, 200, 30);

        jComboBox4.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select State--", "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujrat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharastra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(140, 420, 200, 30);

        jLabel14.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel14.setText("Mother's Name");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 280, 100, 20);

        jLabel15.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel15.setText("State");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(10, 420, 32, 20);

        jTextField8.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField8);
        jTextField8.setBounds(470, 280, 180, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 60, 100, 30);

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(370, 110, 100, 30);

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
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(390, 160, 110, 110);

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
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(520, 160, 130, 110);

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(380, 370, 100, 30);

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(520, 370, 100, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Acc no", "Name", "Phone no.", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 480, 648, 134);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 460, 658, 10);

        jButton5.setBackground(new java.awt.Color(0, 0, 255));
        jButton5.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(450, 410, 100, 30);

        jLabel16.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel16.setText("Father's Name");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(350, 330, 100, 20);

        jTextField9.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        getContentPane().add(jTextField9);
        jTextField9.setBounds(470, 330, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Banking/updatead.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String acc;
    acc=jTextField2.getText();
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    int rows=model.getRowCount();
    if(rows>0)
    {
        for(int i=0; i<rows; i++)
            model.removeRow(0);
    }
    //Making query
    String query="Select * from account where Accountno='"+acc+"';";
    // Inserting into database
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        if(rs.next())
        {
           String accno=rs.getString("Accountno");
           String name=rs.getString("Name");
           String phone=rs.getString("Phone");
           String add=rs.getString("Address");
           model.addRow(new Object[]{accno, name, phone, add});
        }
        else
            JOptionPane.showMessageDialog(this, "Record does not exist.");
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String name;
    name=jTextField3.getText();
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    int rows=model.getRowCount();
    if(rows>0)
    {
        for(int i=0; i<rows; i++)
            model.removeRow(0);
    }
    //Making query
    String query="Select * from account where Name like '%"+name+"%';";
    // Inserting into database
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
           String accno=rs.getString("Accountno");
           String nname=rs.getString("Name");
           String phone=rs.getString("Phone");
           String add=rs.getString("Address");
           model.addRow(new Object[]{accno, nname, phone, add});
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    String gen, gen2;
    int row=jTable1.getSelectedRow();
    String acc=jTable1.getModel().getValueAt(row, 0).toString();
    //Making query
    String query="Select * from account where Accountno='"+acc+"';";
    // Inserting into database
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","@@Sha8960&&");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        if(rs.next())
        {
           String accno=rs.getString("Accountno");
           String nname=rs.getString("Name");
           String phone=rs.getString("Phone");
           String add=rs.getString("Address");
           String dist=rs.getString("District");
           String state=rs.getString("State");
           String gender=rs.getString("Gender");
           String marid=rs.getString("MaritialStatus");
           String mname=rs.getString("Mother_Name");
           String fname=rs.getString("Father_Name");
           Date date=rs.getDate("DateOfBirth");
           
           jTextField2.setText(""+accno);
           jTextField3.setText(""+nname);
           jTextField4.setText(""+phone);
           jTextArea1.setText(""+add);
           jTextField5.setText(""+dist);
           jComboBox4.setSelectedItem(""+state);
           jTextField8.setText(""+mname);
           jTextField9.setText(""+fname);
           if(gender.equals("Male"))
               jRadioButton1.setSelected(true);
           else if(gender.equals("Female"))
               jRadioButton2.setSelected(true);
           if(marid.equals("Married"))
               jRadioButton3.setSelected(true);
           else if(marid.equals("Unmarried"))
               jRadioButton4.setSelected(true);
           SimpleDateFormat day=new SimpleDateFormat("dd");
           jComboBox1.setSelectedItem(day.format(date));
           SimpleDateFormat mon=new SimpleDateFormat("MM");
           jComboBox2.setSelectedItem(mon.format(date));
           SimpleDateFormat yr=new SimpleDateFormat("yyyy");
           jComboBox3.setSelectedItem(yr.format(date));
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    String acc, name, day, month, year, phone, add, dist, state, gender="", marid="", mname, fname;
    acc=jTextField2.getText();
    name=jTextField3.getText();
    phone=jTextField4.getText();
    add=jTextArea1.getText();
    dist=jTextField5.getText();
    mname=jTextField8.getText();
    fname=jTextField9.getText();
    
    day=jComboBox1.getSelectedItem().toString();
    month=jComboBox2.getSelectedItem().toString();
    year=jComboBox3.getSelectedItem().toString();
    state=jComboBox4.getSelectedItem().toString();
    
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
    String query="Update account set Name='"+name+"', DateOfBirth='"+date+
            "', Phone='"+phone+"', Address='"+add+"', District='"+dist+"', State='"+state+
            "', Gender='"+gender+"', MaritialStatus='"+marid+"', Mother_Name='"+mname+
            "', Father_Name='"+fname+"' where Accountno='"+acc+"';";
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
            int rows=model.getRowCount();
                if(rows>0)
                {
                    for(int i=0; i<rows; i++)
                        model.removeRow(0);
                }
            ResultSet sol=st.executeQuery("Select * from account;");
            while (sol.next())
            {
                String s1=sol.getString("Accountno");
                String s2=sol.getString("Name");
                String s3=sol.getString("Phone");
                String s4=sol.getString("Address");
                model.addRow(new Object[]{s1, s2, s3, s4});
            }
            jButton5.doClick();                    
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
    int rows=model.getRowCount();
        if(rows>0)
            {
                
                for(int i=0; i<rows; i++)
                    model.removeRow(0);
            }
    String acc;
    acc=jTextField2.getText();
    //Making query
    String query="Delete from account where Accountno='"+acc+"';";
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
            //Showing data in table.
            ResultSet sol=st.executeQuery("Select * from account;");
            while (sol.next())
            {
                String s1=sol.getString("Accountno");
                String s2=sol.getString("Name");
                String s3=sol.getString("Phone");
                String s4=sol.getString("Address");
                model.addRow(new Object[]{s1, s2, s3, s4});
            }
            jButton5.doClick();                    
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
    }
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
    jTextArea1.setText("");
    jComboBox1.setSelectedIndex(0);
    jComboBox2.setSelectedIndex(0);
    jComboBox3.setSelectedIndex(0);
    jComboBox4.setSelectedIndex(0);
    jRadioButton1.setSelected(false);                    
    jRadioButton2.setSelected(false);                    
    jRadioButton3.setSelected(false);                    
    jRadioButton4.setSelected(false); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
