
package ventanas;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class jif_perfil extends javax.swing.JInternalFrame {

    ArrayList<perfil> perfiles = new ArrayList<perfil>();
    public jif_perfil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        perfil_nombre_input = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        perfil_apellido_input = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        perfil_rol_input = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Perfil");
        setPreferredSize(new java.awt.Dimension(712, 571));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 80, 30));

        perfil_nombre_input.setBackground(new java.awt.Color(255, 255, 255));
        perfil_nombre_input.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        perfil_nombre_input.setForeground(new java.awt.Color(102, 102, 102));
        perfil_nombre_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perfil_nombre_input.setText("Juan");
        perfil_nombre_input.setBorder(null);
        jPanel1.add(perfil_nombre_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 390, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 173, 390, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Rol");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 80, 30));

        perfil_apellido_input.setBackground(new java.awt.Color(255, 255, 255));
        perfil_apellido_input.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        perfil_apellido_input.setForeground(new java.awt.Color(102, 102, 102));
        perfil_apellido_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perfil_apellido_input.setText("Perez");
        perfil_apellido_input.setBorder(null);
        jPanel1.add(perfil_apellido_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 390, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 283, 390, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Rol");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 306, 80, 30));

        perfil_rol_input.setBackground(new java.awt.Color(255, 255, 255));
        perfil_rol_input.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        perfil_rol_input.setForeground(new java.awt.Color(102, 102, 102));
        perfil_rol_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        perfil_rol_input.setText("Tester");
        perfil_rol_input.setBorder(null);
        jPanel1.add(perfil_rol_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 390, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 393, 390, -1));

        jPanel2.setBackground(new java.awt.Color(98, 0, 238));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Crear Perfil");
        jLabel4.setPreferredSize(new java.awt.Dimension(712, 571));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 439, 390, 50));

        jPanel3.setBackground(new java.awt.Color(3, 218, 198));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        String nombre = perfil_nombre_input.getText();
        String apellido = perfil_apellido_input.getText();
        String rol = perfil_rol_input.getText();
        perfil perfil = new perfil(nombre, apellido, rol);
        perfiles.add(perfil);
        JOptionPane.showMessageDialog(null, "el tamaño del array es: "+perfiles.size(), "Perfiles", -1);
    }//GEN-LAST:event_jLabel4MouseClicked


    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField perfil_apellido_input;
    private javax.swing.JTextField perfil_nombre_input;
    private javax.swing.JTextField perfil_rol_input;
    // End of variables declaration//GEN-END:variables
}
