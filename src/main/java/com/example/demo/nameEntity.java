package com.example.demo;

import javax.persistence.*;

@Entity
@Table (name="personas", catalog = "appcertus", schema = "")
public class nameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idpersona")
    private Integer idPersona;
    @Column (name = "namepersona")
    private String namePersona;
    @Column (name = "correopersona")
    private String correoPersona;
    @Column (name = "edad")
    private Integer edad;


    //Getters and Setters
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNamePersona() {
        return namePersona;
    }

    public void setNamePersona(String namePersona) {
        this.namePersona = namePersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    //            (name = "id", nullable = false)
//    private Long id;

    /*String name;
    String correo;
    int edad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public nameEntity() {
    }

    //nameEntity(){}
    nameEntity(String name, String correo, int edad){
        this.name=name;
        this.correo=correo;
        this.edad=edad;
    }*/

}
