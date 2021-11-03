/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author belca
 */
public class main_menu extends javax.swing.JFrame {

    /**
     * Creates new form main_menu
     */
    public main_menu() {
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

        menu_bar = new javax.swing.JMenuBar();
        menu_navegacion = new javax.swing.JMenu();
        menu_logout = new javax.swing.JMenuItem();
        menu_gestion = new javax.swing.JMenu();
        menu_gestion_admin = new javax.swing.JMenuItem();
        menu_gestion_cliente = new javax.swing.JMenuItem();
        menu_gestion_prod = new javax.swing.JMenuItem();
        menu_gestion_rol = new javax.swing.JMenuItem();
        menu_close = new javax.swing.JMenu();
        menu_close_btn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        menu_bar.setBackground(new java.awt.Color(255, 255, 255));
        menu_bar.setBorder(null);
        menu_bar.setForeground(new java.awt.Color(0, 0, 0));
        menu_bar.setBorderPainted(false);

        menu_navegacion.setBackground(new java.awt.Color(255, 255, 255));
        menu_navegacion.setForeground(new java.awt.Color(0, 0, 0));
        menu_navegacion.setText("...");
        menu_navegacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_navegacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        menu_navegacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_navegacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menu_logout.setText("cerrar sesion");
        menu_logout.setToolTipText("");
        menu_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_logoutMouseClicked(evt);
            }
        });
        menu_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_logoutActionPerformed(evt);
            }
        });
        menu_navegacion.add(menu_logout);

        menu_bar.add(menu_navegacion);

        menu_gestion.setText("Gestion");
        menu_gestion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        menu_gestion_admin.setText("Gestionar Administradores");
        menu_gestion_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gestion_adminActionPerformed(evt);
            }
        });
        menu_gestion.add(menu_gestion_admin);

        menu_gestion_cliente.setText("Gestionar Clientes");
        menu_gestion_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gestion_clienteActionPerformed(evt);
            }
        });
        menu_gestion.add(menu_gestion_cliente);

        menu_gestion_prod.setText("Gestionar Productos");
        menu_gestion_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gestion_prodActionPerformed(evt);
            }
        });
        menu_gestion.add(menu_gestion_prod);

        menu_gestion_rol.setText("Gestionar Roles");
        menu_gestion_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_gestion_rolActionPerformed(evt);
            }
        });
        menu_gestion.add(menu_gestion_rol);

        menu_bar.add(menu_gestion);

        menu_close.setText("close");

        menu_close_btn.setText("close");
        menu_close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_close_btnActionPerformed(evt);
            }
        });
        menu_close.add(menu_close_btn);

        menu_bar.add(menu_close);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 851, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_logoutMouseClicked
        
    }//GEN-LAST:event_menu_logoutMouseClicked

    private void menu_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_logoutActionPerformed
        login login = new login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_menu_logoutActionPerformed

    private void menu_gestion_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gestion_adminActionPerformed
        jif_administrador admin = new jif_administrador();
        this.add(admin);
        admin.show();
    }//GEN-LAST:event_menu_gestion_adminActionPerformed

    private void menu_gestion_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gestion_clienteActionPerformed
        jif_cliente client = new jif_cliente();
        this.add(client);
        client.show();
    }//GEN-LAST:event_menu_gestion_clienteActionPerformed

    private void menu_gestion_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gestion_prodActionPerformed
        jif_producto prod = new jif_producto();
        this.add(prod);
        prod.show();
    }//GEN-LAST:event_menu_gestion_prodActionPerformed

    private void menu_gestion_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_gestion_rolActionPerformed
        jif_perfil perfil = new jif_perfil();
        this.add(perfil);
        perfil.show();
    }//GEN-LAST:event_menu_gestion_rolActionPerformed

    private void menu_close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_close_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menu_close_btnActionPerformed

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
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenu menu_close;
    private javax.swing.JMenuItem menu_close_btn;
    private javax.swing.JMenu menu_gestion;
    private javax.swing.JMenuItem menu_gestion_admin;
    private javax.swing.JMenuItem menu_gestion_cliente;
    private javax.swing.JMenuItem menu_gestion_prod;
    private javax.swing.JMenuItem menu_gestion_rol;
    private javax.swing.JMenuItem menu_logout;
    private javax.swing.JMenu menu_navegacion;
    // End of variables declaration//GEN-END:variables
}