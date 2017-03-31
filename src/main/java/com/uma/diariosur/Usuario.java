/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uma.diariosur;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Carmen
 */
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nick;
    private String nombre;
    private String apellidos;
    private String email;
    private String fecha_nacimiento;
    private String contraseña;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Valoracion> valoraciones;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Formulario> formulario;
    
    @ManyToOne
    private Periodista periodista;
    
    public void setNick(Integer nick) {
        this.nick = nick;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    
    
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nick != null ? nick.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.nick == null && other.nick != null) || (this.nick != null && !this.nick.equals(other.nick))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.diariosur1.Usuario[ nick=" + nick + " ]";
    }
    
}
