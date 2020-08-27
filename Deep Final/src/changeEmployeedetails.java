//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
public class changeEmployeedetails extends javax.swing.JInternalFrame {

  
    public changeEmployeedetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Update_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setEditable(false);
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        Show_list_button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Clear_button = new javax.swing.JButton();
        Exit_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Employee Details");

        setTitle("UPDATE EMPLOYEE DETAILS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Update Details Of User");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 2, 8));
        jLabel13.setText("If you want to change any detail then delete the prerecorded detail and refill it");

        Update_button.setText("Update");
        Update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_buttonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Employee Details");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("User Id");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("Dob");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel11.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel10.setText("Counter No.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText("Name");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        Show_list_button.setText("Show");
        Show_list_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_list_buttonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel9.setText("Address");

        Clear_button.setText("clear");
        Clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_buttonActionPerformed(evt);
            }
        });

        Exit_button.setText("Exit");
        Exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_buttonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel12.setText("Employees");

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(42)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jLabel12)
        								.addPreferredGap(ComponentPlacement.UNRELATED)
        								.addComponent(Show_list_button))
        							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(Update_button)
        									.addGap(68)
        									.addComponent(Clear_button)
        									.addGap(76)
        									.addComponent(Exit_button)
        									.addGap(124))
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel13)
        										.addComponent(jLabel3))
        									.addGap(64)))
        							.addGap(67))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(76)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(136)
        							.addComponent(jLabel4))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(6)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel10)
        								.addComponent(jLabel8)
        								.addComponent(jLabel5)
        								.addComponent(jLabel11)
        								.addComponent(jLabel7)
        								.addComponent(jLabel9))
        							.addGap(6)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(jTextField3, Alignment.TRAILING)
        										.addComponent(jTextField5, Alignment.TRAILING)
        										.addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
        										.addComponent(jTextField6)
        										.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
        									.addGap(26))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)))))))
        			.addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(297)
        					.addComponent(jLabel3))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(22)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel12)
        						.addComponent(Show_list_button))
        					.addGap(18)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)))
        			.addGap(158))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(398, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(Clear_button)
        				.addComponent(Exit_button)
        				.addComponent(Update_button))
        			.addGap(58)
        			.addComponent(jLabel13)
        			.addGap(42))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(19)
        			.addComponent(jLabel4)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel10))
        			.addGap(31)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel8))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel11)
        				.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel7)
        						.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGap(46))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel9)
        					.addGap(118)))
        			.addContainerGap(130, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_buttonActionPerformed
           try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","");
            String ncno=jTextField2.getText();
            String nname=jTextField1.getText();
            String nid=jTextField3.getText();
            //String npass=jTextField4.getText();
            String naddress=jTextArea1.getText();
            String ngender=jTextField6.getText();
            String ndob=jTextField5.getText();
            String strSQL = "update signup set name='"+nname+"',address='"+naddress+"',dob='"+ndob+"',gender='"+ngender+"' where id="+nid+";";
            int rs2 = con.createStatement().executeUpdate(strSQL);

            JOptionPane.showMessageDialog(null,"Records updated");
            con.close();
        }


           catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
}//GEN-LAST:event_Update_buttonActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField5ActionPerformed

    private void Show_list_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_list_buttonActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","");
            String strSQL = "select id from signup;";
            ResultSet rs2 = con.createStatement().executeQuery(strSQL);
            DefaultListModel dModel=(DefaultListModel)jList1.getModel();
            dModel.clear();

            while (rs2.next())
            {
                String name=rs2.getString("id");
                dModel.addElement(name);
                jList1.setModel(dModel);
            }

            JOptionPane.showMessageDialog(null,"Records imported");
            con.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
}//GEN-LAST:event_Show_list_buttonActionPerformed

    private void Clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_buttonActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
      //  jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextArea1.setText("");
}//GEN-LAST:event_Clear_buttonActionPerformed

    private void Exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_buttonActionPerformed
       this.setVisible(false);
}//GEN-LAST:event_Exit_buttonActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        try {
            String id=(String)jList1.getSelectedValue();


            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","");
            String strSQL = "select name,pass,address,cno,gender,dob from signup where id='"+id+"';";
            ResultSet rs2 = con.createStatement().executeQuery(strSQL);
            while (rs2.next())

            {
                String ndob=rs2.getString("dob");
                String name=rs2.getString("name");
                String npass=rs2.getString("pass");
                String ngender=rs2.getString("gender");
                String naddress=rs2.getString("address");
                int ncno=rs2.getInt("cno");


                jTextField1.setText(""+name);
                jTextField2.setText(""+ncno);
                jTextField3.setText(""+id);
             //   jTextField4.setText(""+npass);
                jTextField5.setText(""+ndob);
                jTextField6.setText(""+ngender);
                jTextArea1.setText(""+naddress);
            }

            JOptionPane.showMessageDialog(null,"Records showed");
            con.close();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

    }//GEN-LAST:event_jList1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear_button;
    private javax.swing.JButton Exit_button;
    private javax.swing.JButton Show_list_button;
    private javax.swing.JButton Update_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
