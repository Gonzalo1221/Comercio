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
    Admin adm = new Admin();
    Cliente cli = new Cliente();
    Vendedor ven = new Vendedor();
    Productos pro = new Productos();

    ArrayList<Clientes> ListCliente = new ArrayList<Clientes>();
    ArrayList<Producto> ListPro = new ArrayList<Producto>();
    ArrayList<Vendedores> Listven = new ArrayList<Vendedores>();

    /*
    creamos las variables
     */
    private int id, precio;
    private String Nombre, Apellidos, Direccion, user, pass, categoria;

    public Controller(Login log) {
        this.log = log;
        this.iniciar();
        this.log.Iniciar.addActionListener(this);
        this.cli.Registrar.addActionListener(this);
        this.cli.Buscar.addActionListener(this);
        this.cli.Mostrar.addActionListener(this);
        this.cli.Eliminar.addActionListener(this);
        this.adm.Client.addActionListener(this);
        this.adm.Vendedor.addActionListener(this);
        this.adm.Product.addActionListener(this);
        this.ven.Registrar.addActionListener(this);
        this.ven.Mostrar.addActionListener(this);
        this.ven.Buscar.addActionListener(this);
        this.pro.Registrar.addActionListener(this);
        this.pro.Mostrar.addActionListener(this);
        this.pro.Buscar.addActionListener(this);
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
                this.adm.setVisible(true);
                this.log.dispose();

            } else if (user.equals("cliente") && pass.equals("567")) {
                this.adm.setVisible(true);
                this.adm.Menu2.setVisible(false);
                this.adm.Menu3.setVisible(false);
                this.log.dispose();

            } else if (user.equals("vendedor") && pass.equals("345")) {
                this.adm.setVisible(true);
                this.adm.Menu1.setVisible(false);
                this.adm.Menu3.setVisible(false);
                this.log.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
            }
        }

        /*
        creamos las funciones de los botones y le ponemos los parametros para el JFrame Login
         */
        if (this.adm.Client == e.getSource()) {
            this.adm.Panel.add(cli);
            cli.show();
        }
        if (this.adm.Vendedor == e.getSource()) {
            this.adm.Panel.add(ven);
            ven.show();
        }
        if (this.adm.Product == e.getSource()) {
            this.adm.Panel.add(pro);
            pro.show();
        }
        if (this.adm.Salir == e.getSource()){
            this.adm.dispose();
            this.log.setVisible(true);
        }

        /*
        creamos las funciones de los botones y le ponemos los parametros para el JFrame Cliente
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
                    this.cli.Direccion.setText(ListCliente.get(i).getDireccion());
                }
            }

        }

        if (this.cli.Eliminar == e.getSource()) {
            id = Integer.parseInt(this.cli.Id.getText());
            for (int i = 0; i < ListCliente.size(); i++) {
                if (id == ListCliente.get(i).getId()) {
                    ListCliente.remove(i);
                    this.cli.Tabla.clearSelection();

                    JOptionPane.showMessageDialog(null, "DATO ELIMINADO CON ÉXITO");
                }
            }

        }
        /*
        creamos las funciones de los botones y le ponemos los parametros para el JFrame Vendedor
         */

        if (this.ven.Registrar == e.getSource()) {

            id = Integer.parseInt(this.ven.Id.getText());
            Nombre = this.ven.Nombre.getText();
            Apellidos = this.ven.Apellidos.getText();

            Listven.add(new Vendedores(id, Nombre, Apellidos));
            
            tableven(this.ven.Tabla, Listven);
            
            JOptionPane.showMessageDialog(null, "DATO GUARDADO CON ÉXITO");
            
            this.ven.Id.setText("");
            this.ven.Nombre.setText("");
            this.ven.Apellidos.setText("");
        }

        /*
            creamos las funciones de los botones y le ponemos los parametros para el JFrame Productos
         */
        if (this.pro.Registrar == e.getSource()) {

            id = Integer.parseInt(this.pro.id.getText());
            Nombre = this.pro.Nombre.getText();
            precio = Integer.parseInt(this.pro.Precio.getText());
            categoria = (String) this.pro.categoria.getSelectedItem();

            ListPro.add(new Producto(id, Nombre, precio, categoria));
            
            JOptionPane.showMessageDialog(null, "DATO GUARDADO CON ÉXITO");
            
            tablepro(this.pro.Tabla, ListPro);
        
            this.pro.id.setText("");
            this.pro.Nombre.setText("");
            this.pro.Precio.setText("");
            this.pro.categoria.setSelectedItem("");
        }

        if (this.pro.Mostrar == e.getSource()) {

            System.out.println("La lista contiene " + ListPro.size() + " elementos\n");

            for (int i = 0; i < ListPro.size(); i++) {
                System.out.println("Documento: " + this.ListPro.get(i).getId()+ "\n" + "Nombre: " + this.ListPro.get(i).getNombre() +
                        "\n" + "Precio: " + this.ListPro.get(i).getPrecio()+ "\n"+"Categoria "+this.ListPro.get(i).getCategoria());
            }
        }

        if (this.pro.Buscar == e.getSource()) {
            id = Integer.parseInt(this.pro.id.getText());
            precio = Integer.parseInt(this.pro.Precio.getText());
            for (int i = 0; i < ListPro.size(); i++) {
                if (id == ListPro.get(i).getId()) {
                    this.pro.Nombre.setText(ListPro.get(i).getNombre());
//                    this.pro.Precio.setText(ListPro.get(i).setPrecio());
                }
            }

        }
        /**
         * final de las funciones
         */
    }
    
    /*
    CREAMOS LAS FUNCIONES DE LAS TABLAS PARA QUE ACRGUE LAS INFORMACIONES SUMINISTRADAS
    */

    public void table(JTable Tabla, ArrayList<Clientes> ListCliente) {

        for (int i = 0; i < ListCliente.size(); i++) {

            this.cli.Tabla.setValueAt(ListCliente.get(i).getId(), i, 0);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getNombre(), i, 1);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getApellidos(), i, 2);
            this.cli.Tabla.setValueAt(ListCliente.get(i).getDireccion(), i, 3);
        }

    }

    public void tableven(JTable Tabla, ArrayList<Vendedores> Listven) {

        for (int i = 0; i < this.Listven.size(); i++) {

            this.ven.Tabla.setValueAt(Listven.get(i).getId(), i, 0);
            this.ven.Tabla.setValueAt(Listven.get(i).getNombre(), i, 1);
            this.ven.Tabla.setValueAt(Listven.get(i).getApellidos(), i, 2);
        }

    }

    public void tablepro(JTable Tabla, ArrayList<Producto> ListPro) {

        for (int i = 0; i < ListPro.size(); i++) {

            this.pro.Tabla.setValueAt(ListPro.get(i).getId(), i, 0);
            this.pro.Tabla.setValueAt(ListPro.get(i).getNombre(), i, 1);
            this.pro.Tabla.setValueAt(ListPro.get(i).getPrecio(), i, 2);
            this.pro.Tabla.setValueAt(ListPro.get(i).getCategoria(), i, 3);
        }
    }
}
