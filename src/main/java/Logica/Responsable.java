/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author massi
 */
@Entity
public class Responsable extends Persona{
    private String typeResponsable;
    @OneToOne
    private Paciente anPaciente;

    public Responsable() {
    }

    public Responsable(String typeResponsable, Paciente anPaciente, int id, String ci, String name, String lastname, int tel, String address, Date dateBorn) {
        super(id, ci, name, lastname, tel, address, dateBorn);
        this.typeResponsable = typeResponsable;
        this.anPaciente = anPaciente;
    }

    public String getTypeResponsable() {
        return typeResponsable;
    }

    public void setTypeResponsable(String typeResponsable) {
        this.typeResponsable = typeResponsable;
    }

    public Paciente getAnPaciente() {
        return anPaciente;
    }

    public void setAnPaciente(Paciente anPaciente) {
        this.anPaciente = anPaciente;
    }
    
    
}
