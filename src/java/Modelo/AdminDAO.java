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
public class AdminDAO {

    Dbconexion db = new Dbconexion();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;

    public Admin validar(String usuario, String contraseña) {
        Admin cl = new Admin();
        String sql = "select * from administrador where usuario=? and contraseña=?";
        try {
            con = db.Conexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            rs = ps.executeQuery();
            while (rs.next()) {
                cl.setContraseña(rs.getString("contraseña"));
                cl.setId(rs.getString("idAdmin"));
                cl.setAdminuser(rs.getString("usuario"));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cl;
    }
}
