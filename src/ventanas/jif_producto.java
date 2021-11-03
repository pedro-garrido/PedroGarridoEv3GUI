
package ventanas;

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class jif_producto extends javax.swing.JInternalFrame {

    ArrayList<producto> productos = new ArrayList<producto>();

    public jif_producto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        prod_nombre_input = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        prod_precio_input = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        prod_marca_input = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btn_crearprod = new javax.swing.JPanel();
        btn_label_crearprod = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Producto");
        setPreferredSize(new java.awt.Dimension(712, 571));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prod_nombre_input.setBackground(new java.awt.Color(255, 255, 255));
        prod_nombre_input.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        prod_nombre_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prod_nombre_input.setText("Leche");
        prod_nombre_input.setBorder(null);
        prod_nombre_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prod_nombre_inputMouseClicked(evt);
            }
        });
        prod_nombre_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_nombre_inputActionPerformed(evt);
            }
        });
        jPanel1.add(prod_nombre_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 390, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 153, 390, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 66, 120, 30));

        prod_precio_input.setBackground(new java.awt.Color(255, 255, 255));
        prod_precio_input.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        prod_precio_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prod_precio_input.setText("2000");
        prod_precio_input.setBorder(null);
        prod_precio_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prod_precio_inputMouseClicked(evt);
            }
        });
        jPanel1.add(prod_precio_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 390, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 390, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Precio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 120, 30));

        prod_marca_input.setBackground(new java.awt.Color(255, 255, 255));
        prod_marca_input.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        prod_marca_input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prod_marca_input.setText("Colun");
        prod_marca_input.setBorder(null);
        prod_marca_input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prod_marca_inputMouseClicked(evt);
            }
        });
        jPanel1.add(prod_marca_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 390, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 390, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Marca");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 120, 30));

        btn_crearprod.setBackground(new java.awt.Color(98, 0, 238));

        btn_label_crearprod.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btn_label_crearprod.setForeground(new java.awt.Color(255, 255, 255));
        btn_label_crearprod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_label_crearprod.setText("Crear Producto");
        btn_label_crearprod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_label_crearprodMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btn_crearprodLayout = new javax.swing.GroupLayout(btn_crearprod);
        btn_crearprod.setLayout(btn_crearprodLayout);
        btn_crearprodLayout.setHorizontalGroup(
            btn_crearprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_label_crearprod, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        btn_crearprodLayout.setVerticalGroup(
            btn_crearprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_label_crearprod, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btn_crearprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 390, 50));

        jPanel2.setBackground(new java.awt.Color(3, 218, 198));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prod_nombre_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_nombre_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prod_nombre_inputActionPerformed

    private void btn_label_crearprodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_label_crearprodMouseClicked
        String nombre = prod_nombre_input.getText();
        String precio = prod_precio_input.getText();
        String marca = prod_marca_input.getText();
        producto prod = new producto(nombre, precio, marca);
        productos.add(prod);
        JOptionPane.showMessageDialog(null, "el tamaño del array es: "+productos.size(),"Tamaño array",-1);
    }//GEN-LAST:event_btn_label_crearprodMouseClicked

    private void prod_nombre_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prod_nombre_inputMouseClicked
        prod_nombre_input.setText(null);
    }//GEN-LAST:event_prod_nombre_inputMouseClicked

    private void prod_precio_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prod_precio_inputMouseClicked
        prod_precio_input.setText(null);
    }//GEN-LAST:event_prod_precio_inputMouseClicked

    private void prod_marca_inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prod_marca_inputMouseClicked
        prod_marca_input.setText(null);
    }//GEN-LAST:event_prod_marca_inputMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_crearprod;
    private javax.swing.JLabel btn_label_crearprod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField prod_marca_input;
    private javax.swing.JTextField prod_nombre_input;
    private javax.swing.JTextField prod_precio_input;
    // End of variables declaration//GEN-END:variables
}
