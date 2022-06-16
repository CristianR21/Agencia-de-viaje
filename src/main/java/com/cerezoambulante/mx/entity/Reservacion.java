
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
 * @author labso02
 */
@Entity
@Table(name = "reservacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservacion.findAll", query = "SELECT r FROM Reservacion r"),
    @NamedQuery(name = "Reservacion.findByCodigo", query = "SELECT r FROM Reservacion r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "Reservacion.findByNombre", query = "SELECT r FROM Reservacion r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Reservacion.findByApellido", query = "SELECT r FROM Reservacion r WHERE r.apellido = :apellido"),
    @NamedQuery(name = "Reservacion.findByLugar", query = "SELECT r FROM Reservacion r WHERE r.lugar = :lugar"),
    @NamedQuery(name = "Reservacion.findByPersonas", query = "SELECT r FROM Reservacion r WHERE r.personas = :personas"),
    @NamedQuery(name = "Reservacion.findByFechaEntrada", query = "SELECT r FROM Reservacion r WHERE r.fechaEntrada = :fechaEntrada"),
    @NamedQuery(name = "Reservacion.findByFechaSalida", query = "SELECT r FROM Reservacion r WHERE r.fechaSalida = :fechaSalida")})
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 50)
    @Column(name = "lugar")
    private String lugar;
    @Column(name = "personas")
    private Integer personas;
    @Size(max = 100)
    @Column(name = "fecha_entrada")
    private String fechaEntrada;
    @Size(max = 100)
    @Column(name = "fecha_salida")
    private String fechaSalida;

    public Reservacion() {
    }

    public Reservacion(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacion)) {
            return false;
        }
        Reservacion other = (Reservacion) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cerezoambulante.mx.entity.Reservacion[ codigo=" + codigo + " ]";
    }
    
}
