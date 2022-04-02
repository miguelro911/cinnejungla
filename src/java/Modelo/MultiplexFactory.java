/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Miguel
 */
public class MultiplexFactory {

    public MultiplexDAO CrearMultiplex(String opcion) {
        if (opcion == null || opcion.isEmpty()) {
            return null;
        }
        switch (opcion) {
            case "Gran Estacion":
                return new Granestacion();
            case "Embajador":
                return new Embajador();
            case "Plaza Central":
                return new Plazacentral();
            case "Titan":
                return new Titan();
            case "Unicentro":
                return new Unicentro();
            case "Las Americas":
                return new LasAmericas();
            default:
                return null;
        }
    }
}
