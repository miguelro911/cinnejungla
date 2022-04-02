/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Dbconexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Unicentro implements MultiplexDAO {
    Dbconexion db = new Dbconexion();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    @Override
    public Empleado consultaEmps() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Funcion consulFunc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> consultaremo() {
        List<Empleado> listap = new ArrayList<>();
        String sql = "SELECT idEmpleado,nombreEmp,rol, multiplex_fk,cedula,telefono,salario,fechaInicio FROM empleado WHERE multiplex_fk = '5'";
        try {
            con = db.Conexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idEmpleado = rs.getString("idEmpleado");
                String Nombre = rs.getString("nombreEmp");
                System.out.println(Nombre);
                String rol = rs.getString("rol");
                String Multiplex = rs.getString("multiplex_fk");
                Date fecha = rs.getDate("fechaInicio");
                String img = rs.getString("img");
                int cedula = rs.getInt("cedula");
                int telefono = rs.getInt("telefono");
                int salario = rs.getInt("salario");

                Empleado peli = new Empleado(idEmpleado, Nombre, rol, Multiplex, cedula, telefono, salario, fecha);
                listap.add(peli);
                System.out.println(peli.Nombre);

            }
            return listap;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

}
