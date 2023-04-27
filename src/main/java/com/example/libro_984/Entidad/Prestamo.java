package com.example.libro_984.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "documento", referencedColumnName = "documento",nullable = false)
    @JsonIgnore
    private Estudiante estudiante;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "isbn", referencedColumnName = "isbn",nullable = false)
    @JsonIgnore
    private Libro libro;
    @Column()
    @Temporal(TemporalType.DATE)
    private Date fecha;

    @PrePersist
    public void prePersist(){
        this.fecha = new Date();
    }

    public Prestamo(int id, Estudiante estudiante, Libro libro, Date fecha) {
        this.id = id;
        this.estudiante = estudiante;
        this.libro = libro;
        this.fecha = fecha;
    }

    public Prestamo() {
    }

    //Getter

    public int getId() {
        return id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Libro getLibro() {
        return libro;
    }

    public Date getFecha() {
        return fecha;
    }


    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
