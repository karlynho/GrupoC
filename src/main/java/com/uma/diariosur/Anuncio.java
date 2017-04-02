/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uma.diariosur;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/*****
 *
 * @author Carmen
 */


@Entity
public class Anuncio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String duracion;
    private String preferencia;

    @ManyToOne
    private Evento evento;
    
   
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

      public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getPreferencia() {
        return preferencia;
    }
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Anuncio)) {
            return false;
        }
        Anuncio other = (Anuncio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.diariosur1.Anuncio[ id=" + id + " ]";
    }
    
}
