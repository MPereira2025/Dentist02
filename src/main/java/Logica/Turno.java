/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Date;

/**
 *
 * @author massi
 */
public class Turno {
    private int idTurno;
    private Date fechaTurno;
    private String horaTurno;
    private String afeccion;
    private Odontologo odonto;
    private Paciente pacien;

    public Turno() {
    }

    public Turno(int idTurno, Date fechaTurno, String horaTurno, String afeccion, Odontologo odonto, Paciente pacien) {
        this.idTurno = idTurno;
        this.fechaTurno = fechaTurno;
        this.horaTurno = horaTurno;
        this.afeccion = afeccion;
        this.odonto = odonto;
        this.pacien = pacien;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public String getHoraTurno() {
        return horaTurno;
    }

    public void setHoraTurno(String horaTurno) {
        this.horaTurno = horaTurno;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }

    public Odontologo getOdonto() {
        return odonto;
    }

    public void setOdonto(Odontologo odonto) {
        this.odonto = odonto;
    }

    public Paciente getPacien() {
        return pacien;
    }

    public void setPacien(Paciente pacien) {
        this.pacien = pacien;
    }
    
    
    
}
