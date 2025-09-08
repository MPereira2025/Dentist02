/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import java.util.List;

/**
 *
 * @author massi
 */
public class Odontologo extends Persona{
    private String especialidad;
    private List<Turno> listTurno;
    private Usuario anUser;
    private Horario anHorario;
    
    
    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listTurno, Usuario anUser, Horario anHorario, int id, String ci, String name, String lastname, int tel, String address, Date dateBorn) {
        super(id, ci, name, lastname, tel, address, dateBorn);
        this.especialidad = especialidad;
        this.listTurno = listTurno;
        this.anUser = anUser;
        this.anHorario = anHorario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListTurno() {
        return listTurno;
    }

    public void setListTurno(List<Turno> listTurno) {
        this.listTurno = listTurno;
    }

    public Usuario getAnUser() {
        return anUser;
    }

    public void setAnUser(Usuario anUser) {
        this.anUser = anUser;
    }

    public Horario getAnHorario() {
        return anHorario;
    }

    public void setAnHorario(Horario anHorario) {
        this.anHorario = anHorario;
    }
    
    
    
}
