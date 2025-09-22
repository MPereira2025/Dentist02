/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Usuario;

/**
 *
 * @author massi
 */
public class ControladoraPersistencia {
    PersonaJpaController personJpa = new PersonaJpaController();
    OdontologoJpaController odonJpa = new OdontologoJpaController();
    PacienteJpaController pacienJpa = new PacienteJpaController();
    ResponsableJpaController respoJpa = new ResponsableJpaController();
    SecretarioJpaController secreJpa = new SecretarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    HorarioJpaController horarioJpa = new HorarioJpaController();


    public ControladoraPersistencia(){
        
    }
    
    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }
}
