/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Azaelmglw
 */
public class View_Clientes extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonas
     */
    public View_Clientes() {
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

        jLabel1 = new javax.swing.JLabel();
        jl_Id_Cliente = new javax.swing.JLabel();
        jlb_nombre_persona = new javax.swing.JLabel();
        jlb_telefono = new javax.swing.JLabel();
        jlb_email_persona = new javax.swing.JLabel();
        jtf_id_cliente = new javax.swing.JTextField();
        jtf_nombre_cliente = new javax.swing.JTextField();
        jtf_apellido1 = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jbtn_editar = new javax.swing.JButton();
        jbtn_agregar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_nuevo = new javax.swing.JButton();
        jl_apellidos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtf_direccion = new javax.swing.JTextField();
        jtf_monto = new javax.swing.JTextField();
        jtf_fecha_in = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_cliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtf_apellido2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcb_tipo_cliente = new javax.swing.JComboBox<>();
        jbtn_buscar = new javax.swing.JButton();
        jtf_buscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(0, 102, 153));
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));

        jl_Id_Cliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jl_Id_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        jl_Id_Cliente.setText("ID:");

        jlb_nombre_persona.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlb_nombre_persona.setForeground(new java.awt.Color(255, 255, 255));
        jlb_nombre_persona.setText("Nombre:");

        jlb_telefono.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlb_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jlb_telefono.setText("Teléfono:");

        jlb_email_persona.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jlb_email_persona.setForeground(new java.awt.Color(255, 255, 255));
        jlb_email_persona.setText("Direccion");

        jtf_id_cliente.setBackground(new java.awt.Color(0, 0, 153));
        jtf_id_cliente.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        jtf_id_cliente.setForeground(new java.awt.Color(255, 255, 255));

        jtf_nombre_cliente.setBackground(new java.awt.Color(0, 0, 153));
        jtf_nombre_cliente.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        jtf_nombre_cliente.setForeground(new java.awt.Color(255, 255, 255));

        jtf_apellido1.setBackground(new java.awt.Color(0, 0, 153));
        jtf_apellido1.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        jtf_apellido1.setForeground(new java.awt.Color(255, 255, 255));

        jtf_telefono.setBackground(new java.awt.Color(0, 0, 153));
        jtf_telefono.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        jtf_telefono.setForeground(new java.awt.Color(255, 255, 255));

        jbtn_primero.setBackground(new java.awt.Color(0, 153, 153));
        jbtn_primero.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_primero.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_primero.setText("|<");

        jbtn_anterior.setBackground(new java.awt.Color(0, 153, 153));
        jbtn_anterior.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_anterior.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_anterior.setText("Anterior");

        jbtn_siguiente.setBackground(new java.awt.Color(0, 153, 153));
        jbtn_siguiente.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_siguiente.setText("Siguiente");

        jbtn_ultimo.setBackground(new java.awt.Color(0, 153, 153));
        jbtn_ultimo.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_ultimo.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_ultimo.setText(">|");

        jbtn_editar.setBackground(new java.awt.Color(0, 153, 153));
        jbtn_editar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_editar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_editar.setText("Modificar");

        jbtn_agregar.setBackground(new java.awt.Color(0, 153, 153));
        jbtn_agregar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_agregar.setText("Agregar");

        jbtn_eliminar.setBackground(new java.awt.Color(0, 153, 153));
        jbtn_eliminar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_eliminar.setText("Eliminar");

        jbtn_nuevo.setBackground(new java.awt.Color(0, 153, 153));
        jbtn_nuevo.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_nuevo.setText("Nuevo");

        jl_apellidos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jl_apellidos.setForeground(new java.awt.Color(255, 255, 255));
        jl_apellidos.setText("Primer Apellido");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Monto");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Ingreso:");

        jtf_direccion.setBackground(new java.awt.Color(0, 0, 153));
        jtf_direccion.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        jtf_direccion.setForeground(new java.awt.Color(255, 255, 255));
        jtf_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_direccionActionPerformed(evt);
            }
        });

        jtf_monto.setBackground(new java.awt.Color(0, 0, 153));
        jtf_monto.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        jtf_monto.setForeground(new java.awt.Color(255, 255, 255));

        jtf_fecha_in.setBackground(new java.awt.Color(0, 0, 153));
        jtf_fecha_in.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        jtf_fecha_in.setForeground(new java.awt.Color(255, 255, 255));

        jtb_cliente.setBackground(new java.awt.Color(0, 204, 204));
        jtb_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtb_cliente);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Segundo Apellido");

        jtf_apellido2.setBackground(new java.awt.Color(0, 0, 153));
        jtf_apellido2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo Cliente");

        jcb_tipo_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CN", "E" }));
        jcb_tipo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_tipo_clienteActionPerformed(evt);
            }
        });

        jbtn_buscar.setBackground(new java.awt.Color(51, 51, 51));
        jbtn_buscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jbtn_buscar.setForeground(new java.awt.Color(0, 0, 255));
        jbtn_buscar.setText("Buscar");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jlb_telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jlb_email_persona, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jtf_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(179, 179, 179))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jl_apellidos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jl_Id_Cliente)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(jLabel3)
                                                            .addGap(37, 37, 37))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel5)
                                                                .addComponent(jLabel4))
                                                            .addGap(24, 24, 24)))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtf_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jtf_fecha_in, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jcb_tipo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(141, 141, 141)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jbtn_primero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(27, 27, 27)
                                                            .addComponent(jbtn_anterior)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jbtn_siguiente)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jbtn_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jbtn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jbtn_editar))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(129, 129, 129)
                                                            .addComponent(jbtn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel6))))
                                            .addGap(95, 95, 95)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlb_nombre_persona)
                                        .addGap(6, 6, 6)
                                        .addComponent(jtf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(162, 162, 162)
                                        .addComponent(jbtn_buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Id_Cliente))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb_nombre_persona)
                            .addComponent(jtf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_apellidos)
                            .addComponent(jtf_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jbtn_buscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlb_telefono)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtf_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlb_email_persona))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtf_fecha_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addComponent(jcb_tipo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtn_nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_anterior)
                            .addComponent(jbtn_siguiente)
                            .addComponent(jbtn_ultimo)
                            .addComponent(jbtn_primero))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_agregar)
                            .addComponent(jbtn_editar)
                            .addComponent(jbtn_eliminar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_direccionActionPerformed

    private void jcb_tipo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_tipo_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_tipo_clienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtn_agregar;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_buscar;
    public javax.swing.JButton jbtn_editar;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JComboBox<String> jcb_tipo_cliente;
    public javax.swing.JLabel jl_Id_Cliente;
    private javax.swing.JLabel jl_apellidos;
    public javax.swing.JLabel jlb_email_persona;
    public javax.swing.JLabel jlb_nombre_persona;
    public javax.swing.JLabel jlb_telefono;
    public javax.swing.JTable jtb_cliente;
    public javax.swing.JTextField jtf_apellido1;
    public javax.swing.JTextField jtf_apellido2;
    public javax.swing.JTextField jtf_buscar;
    public javax.swing.JTextField jtf_direccion;
    public javax.swing.JTextField jtf_fecha_in;
    public javax.swing.JTextField jtf_id_cliente;
    public javax.swing.JTextField jtf_monto;
    public javax.swing.JTextField jtf_nombre_cliente;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
