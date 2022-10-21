/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejecutar;

import controller.Controller;
import view.Login;

/**
 *
 * @author SENA
 */
public class Comercio {

    public static void main(String[] args) {
        Login abrir = new Login();
        Controller cp = new Controller(abrir);
    }
}