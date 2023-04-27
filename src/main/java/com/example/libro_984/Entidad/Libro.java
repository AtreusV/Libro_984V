package com.example.libro_984.Entidad;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name="libro")
public class Libro {

    @Id
    @Column(unique = true,length = 30)
    private String isbn;
    @Column(nullable = false,length = 50)
    private String Titulo;
    @Column(nullable = false,length = 50)
    private String editorial;
    @Column(nullable = false,length = 30)
    private String Autor;
    @Column(nullable = false)
    private int no_pag;

    @OneToMany(mappedBy="libro",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Prestamo> prestamos;

    public Libro(String isbn, String titulo, String editorial, String autor, int no_pag) {
        this.isbn = isbn;
        Titulo = titulo;
        this.editorial = editorial;
        Autor = autor;
        this.no_pag = no_pag;
    }

    //getter

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNo_pag() {
        return no_pag;
    }

    public Set<Prestamo> getPrestamos() {
        return prestamos;
    }

    //setter

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setNo_pag(int no_pag) {
        this.no_pag = no_pag;
    }

    public void setPrestamos(Set<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
}


