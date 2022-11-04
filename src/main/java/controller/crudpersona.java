/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.CallableStatement;
import Conexion.Conector;
import interfaz.CRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;

/**
 *
 * @author SENA
 */
class crudpersona extends Conector implements CRUD {

    public boolean Ingresar() {

        //PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call mostrar()}";
        boolean response = false;

        try {
            cst = con.prepareCall(sql);
            rs = cst.executeQuery();
            response = rs.next();
            if (response) {
                do {
                    System.out.println("El id es: " + rs.getString(1));
                    System.out.println("El nombre es: " + rs.getString(2));
                    System.out.println("El Apellidos es: " + rs.getString(3));
                } while (rs.next());
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    public void buscar_Cliente(int id) {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call consultar_cliente(?)}";
        boolean response = false;

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, id);
            rs = cst.executeQuery();
            response = rs.next();
            if (response) {
                do {
                    System.out.println("El id es: " + rs.getString(1));
                    System.out.println("El nombre es: " + rs.getString(2));
                    System.out.println("El Apellidos es: " + rs.getString(3));
                } while (rs.next());

            }

        } catch (SQLException e) {

            System.err.println(e);

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }

    @Override
    public boolean guardar(int id, String nombre, String apellidos, String direccion) {
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call reg_usuario(?,?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, id);
            cst.setString(2, nombre);
            cst.setString(3, apellidos);
            cst.setString(4, direccion);
            cst.execute();

            return true;

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
        }

    }

    @Override
    public boolean actualizar(int id, String nombre, String apellidos, String direccion) {
        /***
         * actualizar_usuario
         */
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call actualizar_usuario(?,?,?,?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, id);
            cst.setString(2, nombre);
            cst.setString(3, apellidos);
            cst.setString(4, direccion);
            cst.execute();

            return true;

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
        }
       
    }
    public boolean eliminar(int id) {
        /***
         * actualizar_usuario
         */
        Connection con = getConexion();
        ResultSet rs = null;
        CallableStatement cst = null;
        String sql = "{call Eliminar_usuario(?)}";

        try {
            cst = con.prepareCall(sql);
            cst.setInt(1, id);
            cst.execute();

            return true;

        } catch (SQLException e) {

            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                return false;
            }
        }
       
    }
}
