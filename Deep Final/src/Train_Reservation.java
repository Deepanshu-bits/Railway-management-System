
import java.awt.Frame;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
public class Train_Reservation extends javax.swing.JFrame {
    private Frame jFrame;

   public Train_Reservation() {
        initComponents();
    
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        loginpage = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        add_details = new javax.swing.JMenu();
        Add_client_menuitem = new javax.swing.JMenuItem();
        Book_ticket_MenuItem = new javax.swing.JMenuItem();
        Display_details = new javax.swing.JMenu();
        Client_details_MenuItem = new javax.swing.JMenuItem();
        Booked_ticket_menuitem = new javax.swing.JMenuItem();
        Update_password_menuitem = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        Update_clientdetails_menuitem = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Train Reservation");

        loginpage.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jLabel3.setBounds(0, -200, -1, 860);
        loginpage.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ravi/indian-railways-wallpapers.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setBounds(6, 6, 634, 441);
        loginpage.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuBar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        add_details.setText("ADD Details");
        add_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_detailsMouseClicked(evt);
            }
        });
        add_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_detailsActionPerformed(evt);
            }
        });

        Add_client_menuitem.setText("Add Passenger ");
        Add_client_menuitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_client_menuitemMouseClicked(evt);
            }
        });
        Add_client_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_client_menuitemActionPerformed(evt);
            }
        });
        add_details.add(Add_client_menuitem);

        Book_ticket_MenuItem.setText("Book Ticket");
        Book_ticket_MenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Book_ticket_MenuItemMouseClicked(evt);
            }
        });
        Book_ticket_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_ticket_MenuItemActionPerformed(evt);
            }
        });
        Book_ticket_MenuItem.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Book_ticket_MenuItemAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        add_details.add(Book_ticket_MenuItem);

        menuBar.add(add_details);

        Display_details.setText("Display Details");
        Display_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Display_detailsMouseClicked(evt);
            }
        });
        Display_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_detailsActionPerformed(evt);
            }
        });

        Client_details_MenuItem.setText("Passenger  Details");
        Client_details_MenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Client_details_MenuItemMouseClicked(evt);
            }
        });
        Client_details_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Client_details_MenuItemActionPerformed(evt);
            }
        });
        Display_details.add(Client_details_MenuItem);

        Booked_ticket_menuitem.setText("Booked Tickets");
        Booked_ticket_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Booked_ticket_menuitemActionPerformed(evt);
            }
        });
        Display_details.add(Booked_ticket_menuitem);

        menuBar.add(Display_details);

        Update_password_menuitem.setText(" Update Details");
        Update_password_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_password_menuitemActionPerformed(evt);
            }
        });

        contentMenuItem.setText("Change Password");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        Update_password_menuitem.add(contentMenuItem);

        Update_clientdetails_menuitem.setText("Change Passenger  Details");
        Update_clientdetails_menuitem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Update_clientdetails_menuitemMouseClicked(evt);
            }
        });
        Update_clientdetails_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_clientdetails_menuitemActionPerformed(evt);
            }
        });
        Update_password_menuitem.add(Update_clientdetails_menuitem);

        menuBar.add(Update_password_menuitem);

        exit.setText(" Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        menuBar.add(exit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(loginpage, GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        			.addGap(22))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(loginpage, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        			.addGap(18))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_detailsMouseClicked
    
}//GEN-LAST:event_add_detailsMouseClicked

    private void Book_ticket_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_ticket_MenuItemActionPerformed
    bookticket b=new bookticket();
     loginpage.add(b);
     b.setVisible(true);
}//GEN-LAST:event_Book_ticket_MenuItemActionPerformed

    private void Display_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_detailsActionPerformed
      

}//GEN-LAST:event_Display_detailsActionPerformed

    private void Booked_ticket_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Booked_ticket_menuitemActionPerformed
       BookedTickets e=new BookedTickets();
     loginpage.add(e);
     e.setVisible(true);
}//GEN-LAST:event_Booked_ticket_menuitemActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
      System.exit(0);
}//GEN-LAST:event_exitMouseClicked

    private void Display_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Display_detailsMouseClicked
        // TODO add your handling code here:
}//GEN-LAST:event_Display_detailsMouseClicked

    private void add_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_detailsActionPerformed
      
}//GEN-LAST:event_add_detailsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0);
}//GEN-LAST:event_exitActionPerformed

    private void Update_password_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_password_menuitemActionPerformed
        
}//GEN-LAST:event_Update_password_menuitemActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
  changepassword q=new changepassword();
       loginpage.add(q);
       q.setVisible(true);
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void Book_ticket_MenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Book_ticket_MenuItemMouseClicked
       bookticket r=new bookticket();
     loginpage.add(r);
     r.setVisible(true);
}//GEN-LAST:event_Book_ticket_MenuItemMouseClicked

    private void Book_ticket_MenuItemAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Book_ticket_MenuItemAncestorAdded

}//GEN-LAST:event_Book_ticket_MenuItemAncestorAdded

    private void Add_client_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_client_menuitemActionPerformed
        Addclient a=new Addclient();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Add_client_menuitemActionPerformed

    private void Add_client_menuitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_client_menuitemMouseClicked
        Addclient a=new Addclient();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Add_client_menuitemMouseClicked

    private void Client_details_MenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Client_details_MenuItemMouseClicked
        Clientdetails a=new Clientdetails();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Client_details_MenuItemMouseClicked

    private void Update_clientdetails_menuitemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Update_clientdetails_menuitemMouseClicked
 changeclientdetails b=new changeclientdetails();
     loginpage.add(b);
     b.setVisible(true);
}//GEN-LAST:event_Update_clientdetails_menuitemMouseClicked

    private void Update_clientdetails_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_clientdetails_menuitemActionPerformed
        changeclientdetails b=new changeclientdetails();
     loginpage.add(b);
     b.setVisible(true);
}//GEN-LAST:event_Update_clientdetails_menuitemActionPerformed

    private void Client_details_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Client_details_MenuItemActionPerformed
        Clientdetails a=new Clientdetails();
     loginpage.add(a);
     a.setVisible(true);
}//GEN-LAST:event_Client_details_MenuItemActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Train_Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Add_client_menuitem;
    private javax.swing.JMenuItem Book_ticket_MenuItem;
    private javax.swing.JMenuItem Booked_ticket_menuitem;
    private javax.swing.JMenuItem Client_details_MenuItem;
    private javax.swing.JMenu Display_details;
    private javax.swing.JMenuItem Update_clientdetails_menuitem;
    private javax.swing.JMenu Update_password_menuitem;
    private javax.swing.JMenu add_details;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenu exit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JDesktopPane loginpage;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
