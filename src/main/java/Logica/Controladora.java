/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencia.ControladoraPersistencia;

/**
 *
 * @author massi
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(int id, String nombreUsuario, String password, String rol){
        Usuario usu = new Usuario(id, nombreUsuario, password, rol);
        controlPersis.crearUsuario(usu);
    }
}
