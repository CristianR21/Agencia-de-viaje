/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cerezoambulante.mx.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author labso07
 */
@Entity
@Table(name = "viajes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viajes.findAll", query = "SELECT v FROM Viajes v"),
    @NamedQuery(name = "Viajes.findById", query = "SELECT v FROM Viajes v WHERE v.id = :id"),
    @NamedQuery(name = "Viajes.findByNombre", query = "SELECT v FROM Viajes v WHERE v.nombre = :nombre"),
    @NamedQuery(name = "Viajes.findByLugar", query = "SELECT v FROM Viajes v WHERE v.lugar = :lugar"),
    @NamedQuery(name = "Viajes.findByPrecio", query = "SELECT v FROM Viajes v WHERE v.precio = :precio"),
    @NamedQuery(name = "Viajes.findByDias", query = "SELECT v FROM Viajes v WHERE v.dias = :dias")})
public class Viajes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "lugar")
    private String lugar;
    @Column(name = "precio")
    private Integer precio;
    @Column(name = "dias")
    private Integer dias;

    public Viajes() {
    }

    public Viajes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viajes)) {
            return false;
        }
        Viajes other = (Viajes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cerezoambulante.mx.entity.Viajes[ id=" + id + " ]";
    }
    
}
