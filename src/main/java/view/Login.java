/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author SENA
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        sepanel = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        terpanel = new javax.swing.JPanel();
        Iniciar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        User = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 91, 56, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 131, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 24, -1, -1));
        getContentPane().add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 24, -1, -1));

        sepanel.setBackground(new java.awt.Color(255, 255, 255));

        icon2.setIcon(new javax.swing.ImageIcon("C:\\Gonzalo Araujo\\Comercio\\src\\main\\java\\IMG\\5087579.png")); // NOI18N

        javax.swing.GroupLayout sepanelLayout = new javax.swing.GroupLayout(sepanel);
        sepanel.setLayout(sepanelLayout);
        sepanelLayout.setHorizontalGroup(
            sepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sepanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(icon2)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        sepanelLayout.setVerticalGroup(
            sepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sepanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(icon2)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(sepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 220));

        terpanel.setBackground(new java.awt.Color(0, 255, 255));
        terpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        Iniciar.setText("Iniciar");
        terpanel.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 180, -1, -1));

        Salir.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        Salir.setText("Salir");
        terpanel.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 180, -1, -1));
        terpanel.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 210, -1));
        terpanel.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 210, -1));

        getContentPane().add(terpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 350, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Iniciar;
    public javax.swing.JPasswordField Pass;
    public javax.swing.JButton Salir;
    public javax.swing.JTextField User;
    public javax.swing.JLabel icon;
    public javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel sepanel;
    public javax.swing.JPanel terpanel;
    // End of variables declaration//GEN-END:variables
}
