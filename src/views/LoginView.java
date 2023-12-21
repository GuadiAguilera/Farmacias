/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.LoginController;
import java.awt.event.KeyEvent;
import models.Employee;
import models.EmployeeDao;

/**
 *
 * @author Us
 */
public class LoginView extends javax.swing.JFrame {

    Employee employee = new Employee();
    EmployeeDao employeeDao = new EmployeeDao();
    public LoginView() {
        initComponents();
        //controlador del login
        LoginController loginControler = new LoginController(employee, employeeDao,this);
        setSize(930,415); 
        setResizable(false); 
        setTitle("Ingresar al sistema");
        setLocationRelativeTo(null); 
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnEnter = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(40, 147, 153));
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("INICIAR SESION");
        panel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, 60));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Usuario:");
        panel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 67, -1));

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Contraseña:");
        panel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 210, 35));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 210, 35));
        txtPassword.getAccessibleContext().setAccessibleName("");

        btnEnter.setBackground(new java.awt.Color(204, 204, 204));
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEnter.setLabel("Ingresar");
        panel1.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 210, 35));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 490, 420));
        panel1.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Iconos/wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 420));

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.Button btnEnter;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Panel panel1;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}