
package BD_Productos;

import static BD_Productos.ModificarProductos.jTable_productos;
import Control_BD.*;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ConsultarProductos extends javax.swing.JDialog {
String idproducto="";
    /**
     * Creates new form ListarCliente
     */
    Control_Productos cc = new Control_Productos();
    
    public ConsultarProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarCliente = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldParametroBusqueda = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonBuscarTodos = new javax.swing.JButton();
        jButtonBuscarFiltro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_i = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel_imagen = new javax.swing.JLabel();
        btn_alerta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Clientes");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Productos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 390, 50));

        jTableListarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableListarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableListarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListarClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListarCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 500, 170));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Buscar ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jTextFieldParametroBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldParametroBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldParametroBusquedaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldParametroBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 160, -1));

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(204, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 110, -1));

        jButtonBuscarTodos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscarTodos.setText("Mostrar Todos");
        jButtonBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTodosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 30));

        jButtonBuscarFiltro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscarFiltro.setText("Buscar");
        jButtonBuscarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 380, 10));

        jLabel_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Paint-can-with-brush.png"))); // NOI18N
        jPanel1.add(jLabel_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/impresora.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jLabel_imagen.setText("No hay imagen");
        jPanel1.add(jLabel_imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 190, 170));

        btn_alerta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_alerta.setForeground(new java.awt.Color(0, 0, 255));
        btn_alerta.setText("Alerta productos");
        btn_alerta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alertaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_alerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        System.gc();//limpiar basura
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonBuscarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarFiltroActionPerformed
       
      try{
        String parametroBusqueda = jTextFieldParametroBusqueda.getText();       
        cc.buscarProductos(parametroBusqueda);
                                  int[] anchos = {35, 300, 50, 150, 40, 50};
        for (int i = 0; i < jTableListarCliente.getColumnCount(); i++) {
            jTableListarCliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," bash "+e);
        }
    }//GEN-LAST:event_jButtonBuscarFiltroActionPerformed

    private void jButtonBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTodosActionPerformed
  
        cc.listarTodosProductos();
                                             int[] anchos = {35, 300, 50, 150, 40, 50};
        for (int i = 0; i < jTableListarCliente.getColumnCount(); i++) {
            jTableListarCliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        
    }//GEN-LAST:event_jButtonBuscarTodosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // sale mensaje y decir que reporte es
        String reporte = JOptionPane.showInputDialog(null, "Escriba Titulo de la hoja?");
        // IMPRIMIR POR IMPRESORA
        try {
            //Mensaje de encabezado
            MessageFormat  headerFormat = new MessageFormat("Reportes de "+reporte);
            //Mensaje en el pie de pagina
            MessageFormat footerFormat = new MessageFormat("Ferretria florez");
            //Imprimir JTable
            jTableListarCliente.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
        } catch (PrinterException ex) {
            Logger.getLogger(ConsultarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldParametroBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldParametroBusquedaKeyPressed
        // TODO add your handling code here:
     try{
        String parametroBusqueda = jTextFieldParametroBusqueda.getText();       
        cc.buscarProductos(parametroBusqueda);
                                                     int[] anchos = {35, 300, 50, 150, 40, 50};
        for (int i = 0; i < jTableListarCliente.getColumnCount(); i++) {
            jTableListarCliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," bash "+e);
        }
    }//GEN-LAST:event_jTextFieldParametroBusquedaKeyPressed

    private void jTableListarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListarClienteMouseClicked
        // TODO add your handling code here:
        try {
                    int fila = jTableListarCliente.rowAtPoint(evt.getPoint());

       
        idproducto=(jTableListarCliente.getValueAt(fila, 0).toString());
                 String file = new String("/imgproductos/" + idproducto + ".jpg"); 
     String master = System.getProperty("user.dir") + file;
                  jLabel_imagen.setIcon(new ImageIcon(master));
            ImageIcon icon=new ImageIcon(master);
            Image img=icon.getImage();
            Image newimg = img.getScaledInstance(jLabel_imagen.getWidth(),jLabel_imagen.getHeight(),java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon= new ImageIcon(newimg);
            jLabel_imagen.setIcon(newIcon);
            jLabel_imagen.setSize(jLabel_imagen.getWidth(), jLabel_imagen.getHeight());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabel_imagen.setText("no hay imagen");
            
            
        }

    }//GEN-LAST:event_jTableListarClienteMouseClicked

    private void btn_alertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alertaActionPerformed
        // TODO add your handling code here:
             cc.listarTodosProductos_por_agotar();
                                             int[] anchos = {35, 300, 50, 150, 40, 50};
        for (int i = 0; i < jTableListarCliente.getColumnCount(); i++) {
            jTableListarCliente.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
    }//GEN-LAST:event_btn_alertaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarProductos dialog = new ConsultarProductos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                   
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alerta;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBuscarFiltro;
    private javax.swing.JButton jButtonBuscarTodos;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_i;
    private javax.swing.JLabel jLabel_imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableListarCliente;
    private javax.swing.JTextField jTextFieldParametroBusqueda;
    // End of variables declaration//GEN-END:variables
}
