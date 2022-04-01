/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Dbconexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class ClienteDAO {
    Dbconexion db = new Dbconexion();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    
    public Cliente validar(String correo, String contraseña){
        Cliente cl = new Cliente();
        String sql = "select * from clientes where correo=? and contraseña=?";
        try {
            con = db.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2,contraseña);
            rs = ps.executeQuery();
            while(rs.next()){
               cl.setContraseña(rs.getString("contraseña"));
               cl.setCorreo(rs.getString("correo"));
               cl.setId(rs.getString("idCliente"));
               cl.setPuntos(rs.getInt("puntos"));
               cl.setNombre(rs.getString("nombre"));
            }
            
        } catch (Exception e) {
        }
        return cl;
    }
    public boolean insertar(Cliente cliente){
        try {
            System.out.println("Bandera base de datos");
            con=db.Conexion();
            ps = con.prepareStatement("INSERT INTO clientes(nombre,correo,puntos,contraseña,idCliente)VALUES(?,?,?,?,?)");
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getCorreo());
            ps.setInt(3, cliente.getPuntos());
            ps.setString(4,cliente.getContraseña());
            ps.setString(5, cliente.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            System.out.println("F");
            return false;
            
        }
    }
}
