/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Producto;
import view.Admin;
import view.Cliente;
import view.Login;
import view.Productos;
import view.Vendedor;
import controller.ControllerCliente;

/**
 *
 * @author SENA
 */
public class ControllerAdmin implements ActionListener {

    Login log;
    Admin adm = new Admin();
    /*
    creamos las variables
     */
    public String user, pass;

    public ControllerAdmin(Login log) {
        this.log = log;
        this.iniciar();

        this.log.Iniciar.addActionListener(this);
        this.log.Salir.addActionListener(this);

        /*
        BOTONES ADMIN   
         */
        this.adm.Client.addActionListener(this);
        this.adm.Vendedor.addActionListener(this);
        this.adm.Product.addActionListener(this);
        this.adm.Salir.addActionListener(this);
    }

    public void iniciar() {
        this.log.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*
        creamos las variables para poner los usuarios predeterminados utilizando equals
         */
        user = this.log.User.getText();
        pass = this.log.Pass.getText();

        if (e.getSource() == this.log.Iniciar) {

            if (user.equals("admin")) {
                if (pass.equals("123")){
                    
                this.adm.setVisible(true);
                this.log.dispose();

                this.log.User.setText("");
                this.log.Pass.setText("");
                     
                }else {
                    JOptionPane.showMessageDialog(null, "PASS INCORRECTO", "ERROR", JOptionPane.WARNING_MESSAGE);
                }

            } else if (user.equals("cliente")) {
                if (pass.equals("567")){

                    this.adm.setVisible(true);
                    this.adm.Menu2.setVisible(false);
                    this.adm.Menu3.setVisible(false);
                    this.log.dispose();

                    this.log.User.setText("");
                    this.log.Pass.setText("");

                }else {
                    JOptionPane.showMessageDialog(null, "PASS INCORRECTO", "ERROR", JOptionPane.WARNING_MESSAGE);
                }

            } else if (user.equals("vendedor")) {
                if (pass.equals("345")) {
                    
                    this.adm.setVisible(true);
                    this.adm.Menu1.setVisible(false);
                    this.adm.Menu3.setVisible(false);
                    this.log.dispose();

                    this.log.User.setText("");
                    this.log.Pass.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "PASS INCORRECTO", "ERROR", JOptionPane.WARNING_MESSAGE);
                }

            } else {

                JOptionPane.showMessageDialog(null, "USUARIO INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (this.log.Salir == e.getSource()) {
            System.exit(0);
        }

        /*
        creamos las funciones de los botones y le ponemos los parametros para el JFrame Login
         */
        if (this.adm.Client == e.getSource()) {
            this.adm.Panel.add(cli);
            cli.show();
            this.pro.doDefaultCloseAction();
            this.ven.doDefaultCloseAction();

        }
        if (this.adm.Vendedor == e.getSource()) {
            this.adm.Panel.add(ven);
            ven.show();
            ControllerCliente.classcli.doDefaultCloseAction();
            this.pro.doDefaultCloseAction();

        }
        if (this.adm.Product == e.getSource()) {
            this.adm.Panel.add(pro);
            pro.show();
            this.cli.doDefaultCloseAction();
            this.ven.doDefaultCloseAction();
        }
        if (this.adm.Salir == e.getSource()) {
            this.adm.dispose();
            this.log.setVisible(true);
        }

    }
}
