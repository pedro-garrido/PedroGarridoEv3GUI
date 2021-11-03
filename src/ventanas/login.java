
package ventanas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;

public class login extends javax.swing.JFrame {

    String usuario = "admin";
    char[] pass = {'4','3','2','1'};
    int xMouse, yMouse;
    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        login_user_input = new javax.swing.JTextField();
        user_separator = new javax.swing.JSeparator();
        login_pass_input = new javax.swing.JPasswordField();
        pass_separator = new javax.swing.JSeparator();
        boton_login = new javax.swing.JPanel();
        button_text = new javax.swing.JLabel();
        user_text = new javax.swing.JLabel();
        pass_text = new javax.swing.JLabel();
        decorado = new javax.swing.JPanel();
        close_button = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setToolTipText("");
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_user_input.setBackground(new java.awt.Color(255, 255, 255));
        login_user_input.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        login_user_input.setForeground(new java.awt.Color(153, 153, 153));
        login_user_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login_user_input.setText("usuario");
        login_user_input.setBorder(null);
        login_user_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_user_inputMouseClicked(evt);
            }
        });
        login_user_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_user_inputActionPerformed(evt);
            }
        });
        background.add(login_user_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 107, 280, 46));
        background.add(user_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 155, 280, 15));

        login_pass_input.setBackground(new java.awt.Color(255, 255, 255));
        login_pass_input.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        login_pass_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        login_pass_input.setText("Password");
        login_pass_input.setBorder(null);
        login_pass_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_pass_inputMouseClicked(evt);
            }
        });
        login_pass_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_pass_inputActionPerformed(evt);
            }
        });
        login_pass_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                login_pass_inputKeyPressed(evt);
            }
        });
        background.add(login_pass_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 190, 280, 46));
        background.add(pass_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 240, 280, 15));

        boton_login.setBackground(new java.awt.Color(98, 0, 238));
        boton_login.setToolTipText("");
        boton_login.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        boton_login.setName(""); // NOI18N

        button_text.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        button_text.setForeground(new java.awt.Color(255, 255, 255));
        button_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        button_text.setText("Login");
        button_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_textMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boton_loginLayout = new javax.swing.GroupLayout(boton_login);
        boton_login.setLayout(boton_loginLayout);
        boton_loginLayout.setHorizontalGroup(
            boton_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_text, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        boton_loginLayout.setVerticalGroup(
            boton_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_text, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(boton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 320, 280, 40));

        user_text.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        user_text.setForeground(new java.awt.Color(0, 0, 0));
        user_text.setText("Usuario");
        background.add(user_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 70, 280, 40));

        pass_text.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        pass_text.setForeground(new java.awt.Color(0, 0, 0));
        pass_text.setText("Contraseña");
        background.add(pass_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 170, -1, -1));

        decorado.setBackground(new java.awt.Color(255, 255, 255));
        decorado.setOpaque(false);
        decorado.setOpaque(false);
        decorado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                decoradoMouseDragged(evt);
            }
        });
        decorado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                decoradoMousePressed(evt);
            }
        });

        close_button.setBackground(new java.awt.Color(255, 255, 255));
        close_button.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        close_button.setForeground(new java.awt.Color(0, 0, 0));
        close_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_button.setText("X");
        close_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_buttonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout decoradoLayout = new javax.swing.GroupLayout(decorado);
        decorado.setLayout(decoradoLayout);
        decoradoLayout.setHorizontalGroup(
            decoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoradoLayout.createSequentialGroup()
                .addGap(0, 632, Short.MAX_VALUE)
                .addComponent(close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        decoradoLayout.setVerticalGroup(
            decoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decoradoLayout.createSequentialGroup()
                .addComponent(close_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(decorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 30));

        jPanel1.setBackground(new java.awt.Color(3, 218, 198));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void login_user_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_user_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_user_inputActionPerformed

    private void login_pass_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_pass_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_pass_inputActionPerformed
    
    private void decoradoMousePressed(java.awt.event.MouseEvent evt) {                                      
        xMouse = evt.getX();
        yMouse = evt.getY();
    }            
    private void decoradoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decoradoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_decoradoMouseDragged

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_close_buttonMouseClicked

    private void close_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseEntered
        close_button.setBackground(Color.red);
    }//GEN-LAST:event_close_buttonMouseEntered

    private void close_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseExited
        close_button.setBackground(Color.white);
    }//GEN-LAST:event_close_buttonMouseExited

    private void button_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_textMouseClicked
        String userInput = login_user_input.getText();
        char[] passInput = login_pass_input.getPassword();
        if(userInput.equals(usuario) && Arrays.equals(passInput, pass)){
            main_menu menu = new main_menu();
            this.setVisible(false);
            menu.setVisible(true);
       
        }else{
        login_pass_input.setText(null);
        }
    }//GEN-LAST:event_button_textMouseClicked

    private void login_user_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_user_inputMouseClicked
        login_user_input.setText(null);
    }//GEN-LAST:event_login_user_inputMouseClicked

    private void login_pass_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_pass_inputMouseClicked
        login_pass_input.setText(null);
    }//GEN-LAST:event_login_pass_inputMouseClicked

    private void login_pass_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_login_pass_inputKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            String userInput = login_user_input.getText();
            char[] passInput = login_pass_input.getPassword();
            if(userInput.equals(usuario)&&Arrays.equals(passInput, pass)){
                main_menu menu = new main_menu();
            this.setVisible(false);
            menu.setVisible(true);
        
            }else{
            login_pass_input.setText(null);
            }
        }
    }//GEN-LAST:event_login_pass_inputKeyPressed


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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel boton_login;
    private javax.swing.JLabel button_text;
    private javax.swing.JLabel close_button;
    private javax.swing.JPanel decorado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField login_pass_input;
    private javax.swing.JTextField login_user_input;
    private javax.swing.JSeparator pass_separator;
    private javax.swing.JLabel pass_text;
    private javax.swing.JSeparator user_separator;
    private javax.swing.JLabel user_text;
    // End of variables declaration//GEN-END:variables

    private void lf(boolean equals) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
