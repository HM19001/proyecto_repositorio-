
package consultas;


import Control_BD.*;
import static ferreteria.Ventas.JTableProduct;
import java.awt.Dimension;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ConsultarVentas extends javax.swing.JDialog {

    /**
     * Creates new form ListarCliente
     */
    Control_Consultas cc = new Control_Consultas();
    
    public ConsultarVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        

    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListarVentas = new javax.swing.JTable();
        jLabelBuscando = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonBuscarTodos = new javax.swing.JButton();
        jButtonBuscarFiltro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldParametroBusqueda = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelBuscando1 = new javax.swing.JLabel();
        jButtonBuscar_fecha = new javax.swing.JButton();
        jDateChooser_fecha = new com.toedter.calendar.JDateChooser();
        jDateChooser_fechafinal = new com.toedter.calendar.JDateChooser();
        lalala = new javax.swing.JLabel();
        label_total = new javax.swing.JLabel();
        jLabelBuscando2 = new javax.swing.JLabel();
        lalala1 = new javax.swing.JLabel();
        label_ganancia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Clientes");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultas de Ventas");

        jTableListarVentas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableListarVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListarVentas);

        jLabelBuscando.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscando.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelBuscando.setText("Producto");

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(204, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonBuscarTodos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscarTodos.setText("Mostrar Todos");
        jButtonBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTodosActionPerformed(evt);
            }
        });

        jButtonBuscarFiltro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscarFiltro.setText("Buscar");
        jButtonBuscarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarFiltroActionPerformed(evt);
            }
        });

        jTextFieldParametroBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/impresora.png"))); // NOI18N

        jLabelBuscando1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscando1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelBuscando1.setText("Fecha inicial");

        jButtonBuscar_fecha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscar_fecha.setText("Buscar fecha");
        jButtonBuscar_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscar_fechaActionPerformed(evt);
            }
        });

        jDateChooser_fecha.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fecha.setMaxSelectableDate(new java.util.Date(253370786517000L));

        jDateChooser_fechafinal.setDateFormatString("yyyy-MM-dd");
        jDateChooser_fechafinal.setMaxSelectableDate(new java.util.Date(253370786517000L));

        lalala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lalala.setText("Total ");

        label_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_total.setForeground(new java.awt.Color(0, 0, 204));
        label_total.setText("0.00");

        jLabelBuscando2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelBuscando2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelBuscando2.setText("Fecha final");

        lalala1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lalala1.setText("Ganancia ");

        label_ganancia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_ganancia.setForeground(new java.awt.Color(0, 0, 204));
        label_ganancia.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelBuscando, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jTextFieldParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButtonBuscarFiltro))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(94, 94, 94)
                                        .addComponent(lalala)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label_total))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(lalala1)
                                        .addGap(31, 31, 31)
                                        .addComponent(label_ganancia)))
                                .addGap(37, 37, 37))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBuscando1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBuscando2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_fechafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButtonBuscar_fecha)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonBuscar_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBuscando2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser_fechafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelBuscando1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBuscando)
                    .addComponent(jTextFieldParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBuscarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lalala, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_total, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lalala1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(8, 8, 8))
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2)))
                .addContainerGap(33, Short.MAX_VALUE))
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
        cc.buscarFacturasdeVentas(parametroBusqueda );
                                                                                                   int[] anchos = {35, 150, 400, 70, 70};
        for (int i = 0; i < jTableListarVentas.getColumnCount(); i++) {
            jTableListarVentas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," bash "+e);
        }
    }//GEN-LAST:event_jButtonBuscarFiltroActionPerformed

    private void jButtonBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTodosActionPerformed
  
        cc.listarTodosVentas();
                                                                                           int[] anchos = {35, 150, 400, 70, 70};
        for (int i = 0; i < jTableListarVentas.getColumnCount(); i++) {
            jTableListarVentas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        label_total.setText("click en buscar");
        label_ganancia.setText("click en buscar");
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
            MessageFormat footerFormat = new MessageFormat("ALMACEN ");
            //Imprimir JTable
            jTableListarVentas.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
        } catch (PrinterException ex) {
            Logger.getLogger(ConsultarVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonBuscar_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscar_fechaActionPerformed
        // TODO add your handling code here:
            
        try{
/*                    Date fechaActual = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd");
        String fecha = formateador.format(fechaActual);
  */      
                    String formato = jDateChooser_fecha.getDateFormatString();
            Date date = jDateChooser_fecha.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            String fecha=String.valueOf(sdf.format(date));
                    String formato2 = jDateChooser_fechafinal.getDateFormatString();
            Date date2 = jDateChooser_fechafinal.getDate();
            SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
            String fecha2=String.valueOf(sdf.format(date2));    
            //fecha 2
            
      //  String parametroBusqueda = jDateChooser_fecha.getText(); 
        cc.buscarFacturasdeVentasFecha(fecha,fecha2 );
                                                                                                   int[] anchos = {35, 150, 400, 70, 70};
        for (int i = 0; i < jTableListarVentas.getColumnCount(); i++) {
            jTableListarVentas.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," bash "+e);
        }
    }//GEN-LAST:event_jButtonBuscar_fechaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConsultarVentas dialog = new ConsultarVentas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                  
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonBuscarFiltro;
    private javax.swing.JButton jButtonBuscarTodos;
    private javax.swing.JButton jButtonBuscar_fecha;
    private javax.swing.JButton jButtonCancelar;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha;
    private com.toedter.calendar.JDateChooser jDateChooser_fechafinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBuscando;
    private javax.swing.JLabel jLabelBuscando1;
    private javax.swing.JLabel jLabelBuscando2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTableListarVentas;
    private javax.swing.JTextField jTextFieldParametroBusqueda;
    public static javax.swing.JLabel label_ganancia;
    public static javax.swing.JLabel label_total;
    private javax.swing.JLabel lalala;
    private javax.swing.JLabel lalala1;
    // End of variables declaration//GEN-END:variables
}
