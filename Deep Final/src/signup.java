
//import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class signup extends javax.swing.JInternalFrame {
 int co=1;
   public signup() {
        initComponents();
   try
{        Class.forName("com.mysql.jdbc.Driver");
         Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","");
         ResultSet no = con.createStatement().executeQuery("Select * from signup");
          ;

 /* while(no.next())
  {
      co= no.getInt("cno");
      co=co+1;}
      jTextField8.setText(""+(co));*/
    con.close();
   }

        catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        submit_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        Exit_button = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel9.setText("jLabel9");

        setTitle(" EMPLOYEE SIGNUP ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel2.setText("Sign Up for IRCTC Employment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("User Id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("dob");

        jTextField1.setFont(new java.awt.Font("Agency FB", 1, 10));

        jTextField3.setFont(new java.awt.Font("Agency FB", 1, 10));

        jTextField4.setFont(new java.awt.Font("Agency FB", 1, 10));

        jTextField5.setFont(new java.awt.Font("Agency FB", 1, 10));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText("Address");

        submit_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit_button.setText("SUBMIT");
        submit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit_buttonMouseClicked(evt);
            }
        });
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        clear_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear_button.setText("CLEAR");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        Exit_button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Exit_button.setText("EXIT");
        Exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_buttonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel10.setText("Counter No.");

        jTextField8.setFont(new java.awt.Font("Agency FB", 1, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("Gender");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Agency FB", 1, 10));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(146)
        					.addComponent(jLabel2))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(47)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel10)
        						.addComponent(jLabel4)
        						.addComponent(jLabel5)
        						.addComponent(jLabel6)
        						.addComponent(jLabel8)
        						.addComponent(jLabel7)
        						.addComponent(jLabel1))
        					.addGap(65)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(jRadioButton1)
        											.addPreferredGap(ComponentPlacement.UNRELATED)
        											.addComponent(jRadioButton2))
        										.addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        										.addComponent(jTextField3))
        									.addPreferredGap(ComponentPlacement.RELATED))
        								.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
        							.addGap(32)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(Exit_button, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        								.addComponent(clear_button, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        								.addComponent(submit_button, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
        						.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel10)
        						.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(3)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel1))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jRadioButton1)
        							.addComponent(jLabel7))
        						.addComponent(jRadioButton2))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(7)
        							.addComponent(clear_button)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(Exit_button))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel4))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel5))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(jLabel6)
        								.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel8)))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(92)
        					.addComponent(submit_button)))
        			.addContainerGap(85, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
       
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
      jTextField1.setText("");
     
      jTextField3.setText("");
      jTextField4.setText("");
      jTextField5.setText("");
      jTextField8.setText("");
    jTextArea1.setText(null);
    int co;
     try
{   Class.forName("com.mysql.jdbc.Driver");
         Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","");
         ResultSet no = con.createStatement().executeQuery("Select * from signup");
      // co=1;

  /*while(no.next()){
  co= no.getInt("cno");
  co=co+1;}
   jTextField8.setText(""+co);

*/
   con.close();
        }
        catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}


}//GEN-LAST:event_clear_buttonActionPerformed

    private void Exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_buttonActionPerformed
     this.setVisible(false);
}//GEN-LAST:event_Exit_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
     try
{   Class.forName("com.mysql.jdbc.Driver");
    Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/irctc","root","");

   String nname=jTextField1.getText();
   String ndob=jTextField5.getText();
   String nid=jTextField3.getText();
   String npass=jTextField4.getText();
  
   String ngender="";
   if (jRadioButton1.isSelected())
        ngender="male";
   else if (jRadioButton2.isSelected())
        ngender="female";
   String naddress=jTextArea1.getText();
int ncno=Integer.parseInt(jTextField8.getText());

   String strSQL = "insert into signup values("+ncno+",'"+nname+"','"+ndob+"','"+naddress+"','"+ngender+"','"+nid+"','"+npass+"');";
   int no = con.createStatement().executeUpdate(strSQL);
   JOptionPane.showMessageDialog(null,"You are now our employee");
   con.close();
}
catch(Exception e)
{
    JOptionPane.showMessageDialog(this,e.getMessage());
}

}//GEN-LAST:event_submit_buttonActionPerformed

    private void submit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_buttonMouseClicked
    
}//GEN-LAST:event_submit_buttonMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
jRadioButton2.setSelected(false);       
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
jRadioButton1.setSelected(false);        
    }//GEN-LAST:event_jRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables

}
