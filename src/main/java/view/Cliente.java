/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author SENA
 */
public class Cliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cliente
     */
    public Cliente() {
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

        Dir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Registrar = new javax.swing.JButton();
        Ape = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Nom = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        Cli = new javax.swing.JLabel();
        Direccion = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        Apellidos = new javax.swing.JTextField();
        Ide = new javax.swing.JLabel();
        Mostrar = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dir.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        Dir.setForeground(new java.awt.Color(255, 0, 0));
        Dir.setText("Direccion");
        getContentPane().add(Dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 229, 80, -1));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Direcion"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 24, 452, 326));

        Registrar.setBackground(new java.awt.Color(0, 204, 204));
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 285, -1, -1));

        Ape.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        Ape.setForeground(new java.awt.Color(255, 0, 0));
        Ape.setText("Apellidos");
        getContentPane().add(Ape, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 189, 80, -1));
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 106, 192, -1));

        Nom.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        Nom.setForeground(new java.awt.Color(255, 0, 0));
        Nom.setText("Nombre");
        getContentPane().add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 149, 80, -1));

        Buscar.setBackground(new java.awt.Color(0, 204, 204));
        Buscar.setText("Buscar");
        getContentPane().add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 285, -1, -1));

        Cli.setFont(new java.awt.Font("Adobe Devanagari", 0, 36)); // NOI18N
        Cli.setForeground(new java.awt.Color(255, 255, 255));
        Cli.setText("Cliente");
        getContentPane().add(Cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 226, 192, -1));

        Eliminar.setBackground(new java.awt.Color(0, 204, 204));
        Eliminar.setText("Eliminar");
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 285, -1, -1));
        getContentPane().add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 186, 192, -1));

        Ide.setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        Ide.setForeground(new java.awt.Color(255, 0, 0));
        Ide.setText("ID");
        getContentPane().add(Ide, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 109, 80, -1));

        Mostrar.setBackground(new java.awt.Color(0, 204, 204));
        Mostrar.setText("Mostrar");
        getContentPane().add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 285, -1, -1));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 146, 192, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Gonzalo Araujo\\Comercio\\src\\main\\java\\IMG\\Fondo.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ape;
    public javax.swing.JTextField Apellidos;
    public javax.swing.JButton Buscar;
    private javax.swing.JLabel Cli;
    private javax.swing.JLabel Dir;
    public javax.swing.JTextField Direccion;
    public javax.swing.JButton Eliminar;
    public javax.swing.JTextField Id;
    private javax.swing.JLabel Ide;
    public javax.swing.JButton Mostrar;
    private javax.swing.JLabel Nom;
    public javax.swing.JTextField Nombre;
    public javax.swing.JButton Registrar;
    public javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
