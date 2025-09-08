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
public class Persona {
    private int id;
    private String ci;
    private String name;
    private String lastname;
    private int tel;
    private String address;
    private Date dateBorn;

    public Persona() {
    }

    public Persona(int id, String ci, String name, String lastname, int tel, String address, Date dateBorn) {
        this.id = id;
        this.ci = ci;
        this.name = name;
        this.lastname = lastname;
        this.tel = tel;
        this.address = address;
        this.dateBorn = dateBorn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
    }
    
    
}
