/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.Clientes;
import model.Producto;
import model.Vendedores;
import view.Admin;
import view.Cliente;
import view.Login;
import view.Productos;
import view.Vendedor;

/**
 *
 * @author SENA
 */
public class Controller implements ActionListener {

    Login log;
    Admin admin = new Admin();
    Cliente cli = new Cliente();
    Vendedor ven = new Vendedor();
    Productos pro = new Productos();

    ArrayList<Clientes> ListCliente = new ArrayList<Clientes>();
    ArrayList<Producto> ListPro = new ArrayList<Producto>();
    ArrayList<Vendedores> Listvendedor = new ArrayList<Vendedores>();

    /*
    creamos las variables
     */
    private int id = 0;
    private String Nombre = null;
    private String Apellidos = null;
    private String Direccion = null;
    private String user = null;
    private String pass = null;
    private int precio = 0;
    private int categoria = 0;

    public Controller(Login log) {
        this.log = log;
        this.iniciar();
        this.log.Iniciar.addActionListener(this);
        this.admin.Cliente.addActionListener(this);
        this.admin.Vendedor.addActionListener(this);
        this.admin.Productos.addActionListener(this);
        this.cli.Registrar.addActionListener(this);
        this.cli.Buscar.addActionListener(this);
        this.cli.Mostrar.addActionListener(this);
        this.cli.Eliminar.addActionListener(this);
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

            if (user.equals("admin") && pass.equals("123")) {
                admin.setVisible(true);
                log.setVisible(false);

            } else if (user.equals("cliente") && pass.equals("567")) {
                cli.setVisible(true);
                log.setVisible(false);

            } else if (user.equals("vendedor") && pass.equals("345")) {
                ven.setVisible(true);
                log.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
            }
        }

        /*
        creamos las funciones de los botones y le pones los parametros para el JFrame Login
         */
        if (e.getSource() == this.admin.Cliente) {
            Cliente abrir = new Cliente();
            this.admin.Panel.add(abrir);
            abrir.show();

        }
        if (e.getSource() == this.admin.Vendedor) {
            Vendedor abrir = new Vendedor();
            this.admin.Panel.add(abrir);
            abrir.show();
        }
        if (e.getSource() == this.admin.Productos) {
            Productos abrir = new Productos();
            this.admin.Panel.add(abrir);
            abrir.show();
        }

        /*
        creamos las funciones de los botones y le pones los parametros para el JFrame Cliente
         */
        if (this.cli.Registrar == e.getSource()) {

            id = Integer.parseInt(this.cli.Id.getText());
            Nombre = this.cli.Nombre.getText();
            Apellidos = this.cli.Apellidos.getText();
            Direccion = this.cli.Direccion.getText();

            ListCliente.add(new Clientes(id, Nombre, Apellidos, Direccion));

            table(this.cli.Tabla, ListCliente);

            JOptionPane.showMessageDialog(null, "DATO GUARDADO CON ÉXITO");

            this.cli.Id.setText("");
            this.cli.Nombre.setText("");
            this.cli.Apellidos.setText("");
            this.cli.Direccion.setText("");
        }

        if (this.cli.Mostrar == e.getSource()) {

            System.out.println("La lista contiene " + ListCliente.size() + " elementos\n");

            for (int i = 0; i < ListCliente.size(); i++) {
                System.out.println("Documento: " + this.ListCliente.get(i).getId() + "\n" + "Nombre: " + this.ListCliente.get(i).getNombre() + "\n" + "Apellidos: " + this.ListCliente.get(i).getApellidos() + "\n");
            }
        }

        if (this.cli.Buscar == e.getSource()) {
            id = Integer.parseInt(this.cli.Id.getText());
            for (int i = 0; i < ListCliente.size(); i++) {
                if (id == ListCliente.get(i).getId()) {
                    this.cli.Nombre.setText(ListCliente.get(i).getNombre());
                    this.cli.Apellidos.setText(ListCliente.get(i).getApellidos());
                }
            }

        }

        if (this.cli.Eliminar == e.getSource()) {
            id = Integer.parseInt(this.cli.Id.getText());
            for (int i = 0; i < ListCliente.size(); i++) {
                if (id == ListCliente.get(i).getId()) {
                    ListCliente.remove(i);
                    this.cli.Tabla.remove(i);

                    JOptionPane.showMessageDialog(null, "DATO ELIMINADO CON ÉXITO");
                }
            }

        }

        /*
        creamos las funciones de los botones y le pones los parametros para el JFrame Productos
         */
    }

    public void table(JTable Tabla, ArrayList<Clientes> ListCliente) {

        for (int i = 0; i < ListCliente.size(); i++) {

            this.cli.Tabla.setValueAt(ListCliente.get(i).getId(), i, 0);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getNombre(), i, 1);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getApellidos(), i, 2);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getDireccion(), i, 3);
        }

    }

    public void tablepro(JTable Tabla, ArrayList<Producto> ListPro) {

        for (int i = 0; i < ListPro.size(); i++) {

            Tabla.setValueAt(ListPro.get(i).getId(), i, 0);
            Tabla.setValueAt(ListPro.get(i).getNombre(), i, 1);
            Tabla.setValueAt(ListPro.get(i).getPrecio(), i, 2);
            Tabla.setValueAt(ListPro.get(i).getCategoria(), i, 3);
        }

    }

}
