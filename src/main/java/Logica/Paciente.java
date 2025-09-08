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
public class Paciente extends Persona{
    private boolean tieneOS;
    private String typeBlood;
    private Responsable anResponsable;
    private List<Turno> listTurno;

    public Paciente() {
    }

    public Paciente(boolean tieneOS, String typeBlood, Responsable anResponsable, List<Turno> listTurno, int id, String ci, String name, String lastname, int tel, String address, Date dateBorn) {
        super(id, ci, name, lastname, tel, address, dateBorn);
        this.tieneOS = tieneOS;
        this.typeBlood = typeBlood;
        this.anResponsable = anResponsable;
        this.listTurno = listTurno;
    }

    public boolean isTieneOS() {
        return tieneOS;
    }

    public void setTieneOS(boolean tieneOS) {
        this.tieneOS = tieneOS;
    }

    public String getTypeBlood() {
        return typeBlood;
    }

    public void setTypeBlood(String typeBlood) {
        this.typeBlood = typeBlood;
    }

    public Responsable getAnResponsable() {
        return anResponsable;
    }

    public void setAnResponsable(Responsable anResponsable) {
        this.anResponsable = anResponsable;
    }

    public List<Turno> getListTurno() {
        return listTurno;
    }

    public void setListTurno(List<Turno> listTurno) {
        this.listTurno = listTurno;
    }
    
    
}
