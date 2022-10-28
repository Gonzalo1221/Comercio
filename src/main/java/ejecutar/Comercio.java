/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejecutar;

import controller.ControllerAdmin;
import controller.ControllerCliente;
import controller.ControllerProductos;
import controller.ControllerVendedor;
import view.Login;

/**
 *
 * @author SENA
 */
public class Comercio {

    public static void main(String[] args) {
        Login abrir = new Login();
        ControllerAdmin ca = new ControllerAdmin(abrir);
        ControllerCliente cc = new ControllerCliente(ControllerCliente.cli);
        ControllerProductos cp = new ControllerProductos(ControllerProductos.pro);
        ControllerVendedor cv = new ControllerVendedor(ControllerVendedor.ven);
    }
}