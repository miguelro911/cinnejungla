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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class PeliculaDAO {
    Dbconexion db = new Dbconexion();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    public List<Pelicula> listarpeliculas(){
        List<Pelicula> listap =new ArrayList<>();
        String sql = "SELECT idPelicula,nombre,duracion,genero,año,img FROM pelicula";
        try {
           con = db.Conexion();
            ps = con.prepareStatement(sql);
            rs =ps.executeQuery();
            while(rs.next()){
                String id = rs.getString("idPelicula");
                String nombre = rs.getString("nombre");
                System.out.println(nombre);
                String duracion = rs.getString("duracion");
                String año = rs.getString("genero");
                String genero = rs.getString("año");
                String img = rs.getString("img");
                
                Pelicula peli =  new Pelicula(id,nombre,duracion,genero,año,img);
                listap.add(peli);
                System.out.println(peli.nombre);
         
            }
            
            return listap;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
