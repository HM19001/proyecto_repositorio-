package BD_Productos;
import static BD_Productos.EliminarProductos.jTable_productos;
import Control_BD.*;
import static ferreteria.Ventas.JTableProduct;
import java.awt.Dimension;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class ModificarProductos extends javax.swing.JDialog {
String idproducto="";
String path="";//creamos una variable global para guardar el path
    /**
     * Creates new form ModificarVendedors
     */
    public ModificarProductos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
       llamarProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField_busqueda = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrecioventam = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_descripcion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_preciocompram = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_cantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonModificarVendedor = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jLabel_imagen = new javax.swing.JLabel();
        btn_imagen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_busqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_busqueda.setToolTipText("Ingrese el código del Vendedor para ser buscado.");
        jTextField_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_busquedaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextField_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, -1));

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setToolTipText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre de producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Modificar Producto");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre de producto");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio venta");

        jTextFieldPrecioventam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPrecioventam.setForeground(new java.awt.Color(0, 153, 0));

        jTextArea_descripcion.setColumns(20);
        jTextArea_descripcion.setRows(5);
        jScrollPane1.setViewportView(jTextArea_descripcion);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Descripción");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Precio compra");

        jTextField_preciocompram.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_preciocompram.setForeground(new java.awt.Color(0, 153, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Disponible");

        jTextField_cantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_cantidad.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jTextFieldNombre))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldPrecioventam, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(jTextField_preciocompram, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel10)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(104, 104, 104)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_preciocompram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPrecioventam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 400, 350));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 390, 10));

        jButtonModificarVendedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonModificarVendedor.setText("Modificar");
        jButtonModificarVendedor.setToolTipText("presionar para modificar");
        jButtonModificarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarVendedorActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar Modificar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_productos);

        jLabel_imagen.setText("Falta Imagen ");

        btn_imagen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_imagen.setText("Cambiar");
        btn_imagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_imagen)))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonModificarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_imagen)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 91, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void ocultar_columnas() {
        jTable_productos.getColumnModel().getColumn(5).setMaxWidth(0);
        jTable_productos.getColumnModel().getColumn(0).setMinWidth(0);
        jTable_productos.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    private void llamarProductos() {

        // llamada de datos
        Control_Productos load = new Control_Productos();
        load.CargarProductos2();
                                                             int[] anchos = {35, 350, 160, 140, 120, 180};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
//ocultar_columnas();
    }
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
          Control_Productos cc = new Control_Productos();
        String parametroBusqueda = jTextField_busqueda.getText();
        cc.buscarProductosparaProductos(parametroBusqueda);
                                                             int[] anchos = {35, 300, 50, 150, 40, 50};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        //  jTextFieldCodigo.setText("");
       /* jTextFieldNombre.setText("");
        jTextFieldPrecios.setText("");
        try {
                    //        jTextFieldCodigo.setText(registro.getString("idProductos"));
                jTextFieldNombre.setText(registro.getString("nombreProductos"));
                jTextFieldPrecios.setText(registro.getString("preciosProductos"));
                jTextArea_descripcion.setText(registro.getString("descripcionProductos"));
                jTextField_cantidad.setText(registro.getString("cantidadProductos"));
                jTextField_preciocompra.setText(registro.getString("preciocompraProductos"));
            } else {
                JOptionPane.showMessageDialog(null,"No existe Vendedor de un codigo "+jTextFieldCodigoVendedor.getText());
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error "+ex);
        }*/
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonModificarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarVendedorActionPerformed

        Control_Productos change = new Control_Productos();
        
     //   String code = jTextField_busqueda.getText();
      
        String nombre = jTextFieldNombre.getText();
        float preciosventa =Float.valueOf(jTextFieldPrecioventam.getText()) ;
        String descripcion = jTextArea_descripcion.getText();
        int cantidad =Integer.parseInt(jTextField_cantidad.getText())  ;
        float preciocompra =Float.valueOf(jTextField_preciocompram.getText()) ;
                    float dif=0;
            dif=(preciosventa-preciocompra);
        change.ModificarProductos(idproducto, nombre, preciosventa,descripcion,cantidad,preciocompra,dif);
               llamarProductos();
                                                             int[] anchos = {35, 300, 50, 150, 40, 50};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        save();
    }//GEN-LAST:event_jButtonModificarVendedorActionPerformed

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
        // TODO add your handling code here:
//                 btn_eliminar.setEnabled(true);
  //              btn_modificar.setEnabled(true);


        int fila = jTable_productos.rowAtPoint(evt.getPoint());

       
        idproducto=(jTable_productos.getValueAt(fila, 0).toString());
        jTextFieldNombre.setText((jTable_productos.getValueAt(fila, 1).toString()));
        jTextFieldPrecioventam.setText((jTable_productos.getValueAt(fila, 2).toString()));
        jTextArea_descripcion.setText((jTable_productos.getValueAt(fila, 3).toString()));
        jTextField_cantidad.setText((jTable_productos.getValueAt(fila, 4).toString()));
        jTextField_preciocompram.setText((jTable_productos.getValueAt(fila, 5).toString()));
        
         String file = new String("/imgproductos/" + idproducto + ".jpg"); 
     String master = System.getProperty("user.dir") + file;
                  jLabel_imagen.setIcon(new ImageIcon(master));
            ImageIcon icon=new ImageIcon(master);
            Image img=icon.getImage();
            Image newimg = img.getScaledInstance(jLabel_imagen.getWidth(),jLabel_imagen.getHeight(),java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon= new ImageIcon(newimg);
            jLabel_imagen.setIcon(newIcon);
            jLabel_imagen.setSize(jLabel_imagen.getWidth(), jLabel_imagen.getHeight());
    }//GEN-LAST:event_jTable_productosMouseClicked

    private void jTextField_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_busquedaKeyPressed
        // TODO add your handling code here:
                Control_Productos cc = new Control_Productos();
        String parametroBusqueda = jTextField_busqueda.getText();
        cc.buscarProductosparaProductos(parametroBusqueda);
                                                             int[] anchos = {35, 350, 160, 140, 120, 180};
        for (int i = 0; i < jTable_productos.getColumnCount(); i++) {
            jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);}
        
        
    }//GEN-LAST:event_jTextField_busquedaKeyPressed

    private void btn_imagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imagenActionPerformed
        // TODO add your handling code here:
        try {
            open();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_imagenActionPerformed
    void open() throws IOException {
        //empezamos implementando la clase JFileChooser para abrir archivos
        JFileChooser JFC = new JFileChooser();
        //filtro que muestra solo los archivos con extension *.edu
        JFC.setFileFilter(new FileNameExtensionFilter("todos los archivos *.jpg", "png","JPG"));
        //se comprueba si se ha dado al boton aceptar
        int abrir = JFC.showDialog(null, "Abrir");
        if (abrir == JFileChooser.APPROVE_OPTION) {
            FileReader FR = null;
            BufferedReader BR = null;

            try {
                //abro el fichero y creo un BufferedReader para hacer
                //una lectura comoda (tener el metodo readLine();)
                File archivo = JFC.getSelectedFile();//abre un archivo .lengf
                
                //evitar abrir archivo con otra extension que no sea *.LFP
                String PATH = JFC.getSelectedFile().getAbsolutePath();
                if(PATH.endsWith(".jpg")||PATH.endsWith(".png")){
                    
                    FR = new FileReader(archivo);
                    BR = new BufferedReader(FR);
                    
                    //leyendo el archivo
                    String linea;//variable para leer linea por linea el archivo de entrada
                    if(path.compareTo(archivo.getAbsolutePath())==0){
                        System.out.println( "Archivo Abierto"+"Oops! Error"+ JOptionPane.ERROR_MESSAGE);
                    }else{
                        path = archivo.getAbsolutePath();
                     //   jTextArea.setText(null);//limpiamos el textArea antes de sobreescribir
                        while((linea=BR.readLine())!=null){ //cuando termina el texto del archivo?
                          //  jTextArea.append(linea+"\n");//utilizamos append para escribir en el textArea
                          //  textodir=linea+"\n";
                        }
                    }
                    jLabel_imagen.setIcon(new ImageIcon(path));
            ImageIcon icon=new ImageIcon(path);
            Image img=icon.getImage();
            Image newimg = img.getScaledInstance(jLabel_imagen.getWidth(),jLabel_imagen.getHeight(),java.awt.Image.SCALE_SMOOTH);
            ImageIcon newIcon= new ImageIcon(newimg);
            jLabel_imagen.setIcon(newIcon);
            jLabel_imagen.setSize(jLabel_imagen.getWidth(), jLabel_imagen.getHeight());
                    
                }else{
                    System.out.println( "Archivo no soportado"+"Oops! Error"+ JOptionPane.ERROR_MESSAGE);
                    open();
                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                //Logger.getLogger(fileChooser.class.getName()).log(Level.SEVERE, null, ex);
            //cerramos el fichero, para asegurar que se cierra tanto
            // si todo va bien si salta una excepcion
            } finally {
                try {
                    if(null!= FR){
                        FR.close();
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                    //Logger.getLogger(fileChooser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void save(){

        try {
                             String file = new String("/imgproductos/" + idproducto + ".jpg"); 
     String master = System.getProperty("user.dir") + file;
    
                 File source = new File(path);

        File dest = new File(master);

            System.out.println("origen :"+path+ "destino: "+master);
 

        // copy file using FileStreams

        long start = System.nanoTime();

        long end;
      
                copyFileUsingFileStreams(source, dest);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    private static void copyFileUsingFileStreams(File source, File dest)

        throws IOException {

    InputStream input = null;

    OutputStream output = null;

    try {

        input = new FileInputStream(source);

        output = new FileOutputStream(dest);

        byte[] buf = new byte[1024];

        int bytesRead;

        while ((bytesRead = input.read(buf)) > 0) {

            output.write(buf, 0, bytesRead);

        }

    } finally {

        input.close();

        output.close();

    }
}
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
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarProductos dialog = new ModificarProductos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                   
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_imagen;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonModificarVendedor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable jTable_productos;
    private javax.swing.JTextArea jTextArea_descripcion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecioventam;
    private javax.swing.JTextField jTextField_busqueda;
    private javax.swing.JTextField jTextField_cantidad;
    private javax.swing.JTextField jTextField_preciocompram;
    // End of variables declaration//GEN-END:variables
}
