/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.sql.Date;

/**
 *
 * @author Miguel
 */
public class Empleado {
    String idEmpleado;
    String Nombre,rol,Multiplex;
    int cedula,telefono,salario;
    Date fecha;
    
    public Empleado(String idEmpleado, String Nombre,String rol,String Multiplex, int cedula,int telefono,int salario, Date fecha){
        this.idEmpleado = idEmpleado;
        this.Multiplex = Multiplex;
        this.cedula= cedula;
        this.telefono=telefono;
        this.rol=rol;
        this.salario = salario;
        this.Nombre = Nombre;
        this.fecha = fecha;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getMultiplex() {
        return Multiplex;
    }

    public void setMultiplex(String Multiplex) {
        this.Multiplex = Multiplex;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
}
