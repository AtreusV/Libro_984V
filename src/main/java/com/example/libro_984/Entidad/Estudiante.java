package com.example.libro_984.Entidad;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @Column(unique = true,length = 25)
    private String documento;
    @Column(nullable = false,length = 50)
    private String nombre;
    @Column(nullable = false,length = 50)
    private String apellido;
    @Column(nullable = false,length = 50)
    private String correo;
    @Column(nullable = false,length = 50)
    private String telefono;

    @OneToMany(mappedBy = "estudiante",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Prestamo> prestamo;

    public Estudiante(String documento, String nombre, String apellido, String correo, String telefono) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Estudiante() {

    }

    //Getter

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Set<Prestamo> getPrestamo() {
        return prestamo;
    }


    //Setter

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPrestamo(Set<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }
}
