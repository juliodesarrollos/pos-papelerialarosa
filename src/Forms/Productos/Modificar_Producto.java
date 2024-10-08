/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Productos;

import Clases.CRUD;
import Clases.Categoria;
import Clases.Colores;
import Clases.Producto;
import Clases.Proveedor;
import Clases.Strings;
import Clases.Vista;
import Forms.Categorias.Eliminar_Categoria;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;

/**
 *
 * @author jandr
 */
public class Modificar_Producto extends javax.swing.JPanel {

    public ArrayList<Proveedor> proveedores;
    public ArrayList<Categoria> categorias;
    ArrayList<Producto> productos = new ArrayList<Producto>();
    ArrayList<Producto> filtro = new ArrayList<Producto>();
    DefaultListModel listModel;

    /**
     * Creates new form Modificar_Producto
     */
    public Modificar_Producto() {
        initComponents();
        diseñar_form();
        new consultar_productos().show();
        new consultar_proveedor().show();
    }

    public void diseñar_form() {
        this.setBackground(Colores.texto_botones_clicked);
        pnlContenedor.setBackground(Colores.fondo_primario);
        btnLista.setBackground(Colores.texto_botones_clicked);
        btnLista.setOpaque(true);
        btnActualizar.setBackground(Colores.texto_botones_clicked);
        btnActualizar.setOpaque(true);
        lblLoader.setVisible(false);
        txtDescripcion.setLineWrap(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList<>();
        txtProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtPrecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JLabel();
        btnLista = new javax.swing.JLabel();
        lblLoader = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("NOTA: Para modificar un producto, seleccione uno de la lista, de no encontrarlo actualicela.");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setText("NOTA: Los productos se pueden filtrar con la barra de busqueda.");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lstProductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstProductos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstProductos);

        txtProducto.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Producto:");

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripción:");

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Precio de venta:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(3);
        txtDescripcion.setAutoscrolls(false);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtDescripcion);

        txtPrecio.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Existencia:");

        txtExistencia.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        txtExistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtExistenciaKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Categoria:");

        cmbCategoria.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Proveedor:");

        cmbProveedor.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnActualizar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizar.setText("Actualizar datos");
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMouseEntered(evt);
            }
        });

        btnLista.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        btnLista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLista.setText("Actualizar lista");
        btnLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListaMouseEntered(evt);
            }
        });

        lblLoader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loader.gif"))); // NOI18N

        javax.swing.GroupLayout pnlContenedorLayout = new javax.swing.GroupLayout(pnlContenedor);
        pnlContenedor.setLayout(pnlContenedorLayout);
        pnlContenedorLayout.setHorizontalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContenedorLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlContenedorLayout.createSequentialGroup()
                                .addComponent(btnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExistencia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbProveedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblLoader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        pnlContenedorLayout.setVerticalGroup(
            pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContenedorLayout.createSequentialGroup()
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecio)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtExistencia)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCategoria)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbProveedor)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(pnlContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(btnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(lblLoader, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:if (txtBuscar.getText() != null && !txtBuscar.getText().equals("")) {
        if (txtBuscar.getText() != null && !txtBuscar.getText().equals("")) {
            txtBuscar.setText(txtBuscar.getText().toUpperCase());   
            System.out.println(txtBuscar.getText());
            System.out.println(productos);
            filtro.clear();
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i).getNombreProducto().contains(txtBuscar.getText())) {
                    filtro.add(productos.get(i));
                }
            }
            listModel = new DefaultListModel();
            for (int i = 0; i < filtro.size(); i++) {
                listModel.add(i, filtro.get(i).getNombreProducto());
            }
            lstProductos.setModel(listModel);
        } else {
            listModel = new DefaultListModel();
            filtro.clear();
            for (int i = 0; i < productos.size(); i++) {
                filtro.add(productos.get(i));
                listModel.add(i, productos.get(i).getNombreProducto());
            }
            lstProductos.setModel(listModel);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void lstProductosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductosValueChanged
        // TODO add your handling code here:
        if (lstProductos.getSelectedIndex() != -1) {
            txtProducto.setText(filtro.get(lstProductos.getSelectedIndex()).getNombreProducto());
            txtDescripcion.setText(filtro.get(lstProductos.getSelectedIndex()).getDescripcion());
            txtPrecio.setText(String.valueOf(filtro.get(lstProductos.getSelectedIndex()).getPrecioVenta()));
            txtExistencia.setText(String.valueOf(filtro.get(lstProductos.getSelectedIndex()).getExistencia()));
            Iterator<Producto> it = filtro.iterator();
            while (it.hasNext()) {
                Producto current = it.next();
                if (current.getCategoria().getIdCategoria() == filtro.get(lstProductos.getSelectedIndex()).getCategoria().getIdCategoria()) {
                    cmbCategoria.setSelectedItem(current.getCategoria().getNombreCategoria());
                }
            }
            Iterator<Producto> it2 = filtro.iterator();
            while (it2.hasNext()) {
                Producto current = it2.next();
                if (current.getProveedor().getIdProveedor() == filtro.get(lstProductos.getSelectedIndex()).getProveedor().getIdProveedor()) {
                    cmbProveedor.setSelectedItem(current.getProveedor().getNombreProveedor());
                }
            }
        }
    }//GEN-LAST:event_lstProductosValueChanged

    private void btnListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseEntered
        // TODO add your handling code here:
        btnLista.setBackground(Colores.fondo_primario_oscuro);
        btnLista.setForeground(Colores.texto_botones_clicked);
    }//GEN-LAST:event_btnListaMouseEntered

    private void btnListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseExited
        // TODO add your handling code here:
        btnLista.setBackground(Colores.texto_botones_clicked);
        btnLista.setForeground(Colores.texto_botones);
    }//GEN-LAST:event_btnListaMouseExited

    private void btnListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaMouseClicked
        // TODO add your handling code here:
        txtBuscar.setText("");
        new consultar_productos().show();
        new consultar_proveedor().show();
    }//GEN-LAST:event_btnListaMouseClicked

    private void btnActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseEntered
        // TODO add your handling code here:
        btnActualizar.setBackground(Colores.fondo_primario_oscuro);
        btnActualizar.setForeground(Colores.texto_botones_clicked);
    }//GEN-LAST:event_btnActualizarMouseEntered

    private void btnActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseExited
        // TODO add your handling code here:
        btnActualizar.setBackground(Colores.texto_botones_clicked);
        btnActualizar.setForeground(Colores.texto_botones);
    }//GEN-LAST:event_btnActualizarMouseExited

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:
        filtro.get(lstProductos.getSelectedIndex()).setNombreProducto(txtProducto.getText().toUpperCase());
        filtro.get(lstProductos.getSelectedIndex()).setDescripcion(txtDescripcion.getText());
        filtro.get(lstProductos.getSelectedIndex()).setPrecioVenta(Double.parseDouble(txtPrecio.getText()));
        filtro.get(lstProductos.getSelectedIndex()).setExistencia(Integer.parseInt(txtExistencia.getText()));
        filtro.get(lstProductos.getSelectedIndex()).setCategoria(categorias.get(cmbCategoria.getSelectedIndex()));
        filtro.get(lstProductos.getSelectedIndex()).setProveedor(proveedores.get(cmbProveedor.getSelectedIndex()));
        new modificar().show();
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void txtProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoKeyReleased
        // TODO add your handling code here:
        if (txtProducto.getText() != null && !txtProducto.getText().equals("")) {
            txtProducto.setText(txtProducto.getText().toUpperCase());   
        }
    }//GEN-LAST:event_txtProductoKeyReleased

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        // TODO add your handling code here:
        if (txtDescripcion.getText() != null && !txtDescripcion.getText().equals("")) {
            txtDescripcion.setText(txtDescripcion.getText().toUpperCase());   
        }
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:                           
        char car = evt.getKeyChar();
        if(car<'0' || car>'9') evt.consume();
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtExistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExistenciaKeyTyped
        // TODO add your handling code here:                           
        char car = evt.getKeyChar();
        if(car<'0' || car>'9') evt.consume();
    }//GEN-LAST:event_txtExistenciaKeyTyped

    public class modificar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    if (CRUD.modificar_producto(filtro.get(lstProductos.getSelectedIndex()))) {
                        new consultar_proveedor().show();
                        Vista.mensaje_informacion(Strings.producto_modificado, Strings.ventana_informacion_titulo);
                    } else {
                        mostrar_loading(false);
                        Vista.mensaje_error(Strings.error_desconocido, Strings.error_desconocido);
                    }
                } else {
                    mostrar_loading(false);
                    Vista.mensaje_error(Strings.sin_internet, Strings.titulo_sin_internet);
                }
            } catch (InterruptedException | IOException | SQLException | ClassNotFoundException ex) {
                mostrar_loading(false);
                Logger.getLogger(Eliminar_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class consultar_productos implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    productos = CRUD.consultar_productos(-500, "categoria, nombreProducto");
                    filtro.clear();
                    for (int i = 0; i < productos.size(); i++) {
                        filtro.add(productos.get(i));
                    }
                    listModel = new DefaultListModel();
                    for (int i = 0; i < productos.size(); i++) {
                        listModel.add(i, productos.get(i).getNombreProducto());
                        System.out.println(productos.get(i).getNombreProducto());
                    }
                    lstProductos.setModel(listModel);
                    mostrar_loading(false);
                } else {
                    mostrar_loading(false);
                    Vista.mensaje_error(Strings.sin_internet, Strings.titulo_sin_internet);
                }
            } catch (InterruptedException | IOException | SQLException | ClassNotFoundException ex) {
                mostrar_loading(false);
                Logger.getLogger(Eliminar_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class consultar_proveedor implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                mostrar_loading(true);
                if (CRUD.conexion_internet()) {
                    proveedores = CRUD.consultar_proveedores();
                    cmbProveedor.removeAllItems();
                    for (Proveedor campos : proveedores) {
                        cmbProveedor.addItem(campos.getNombreProveedor());
                    }
                    cmbProveedor.setSelectedIndex(0);
                    new consultar_categoria().show();
                } else {
                    mostrar_loading(false);
                    Vista.mensaje_error(Strings.sin_internet, Strings.titulo_sin_internet);
                }
            } catch (InterruptedException | IOException | SQLException | ClassNotFoundException ex) {
                mostrar_loading(false);
                Logger.getLogger(Eliminar_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class consultar_categoria implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            try {
                if (CRUD.conexion_internet()) {
                    categorias = CRUD.consultar_categorias();
                    cmbCategoria.removeAllItems();
                    for (Categoria campos : categorias) {
                        cmbCategoria.addItem(campos.getNombreCategoria());
                    }
                    cmbCategoria.setSelectedIndex(0);
                    mostrar_loading(false);
                } else {
                    mostrar_loading(false);
                    Vista.mensaje_error(Strings.sin_internet, Strings.titulo_sin_internet);
                }
            } catch (InterruptedException | IOException | SQLException | ClassNotFoundException ex) {
                mostrar_loading(false);
                Logger.getLogger(Eliminar_Categoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void mostrar_loading(boolean mostrar) {
        btnLista.setVisible(!mostrar);
        btnActualizar.setVisible(!mostrar);
        lblLoader.setVisible(mostrar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnLista;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLoader;
    private javax.swing.JList<String> lstProductos;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
