/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.Froggo.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author NatyN
 */
public class DtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    private String img;
    private String sobrepersona;
    private String titulodepersona;
    
    
    //Constructor

    public DtoPersona() {
    }

    public DtoPersona(String nombre, String apellido, String img, String sobrepersona, String titulodepersona) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.sobrepersona = sobrepersona;
        this.titulodepersona = titulodepersona;
    }
    
    //GettersSetters

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSobrepersona() {
        return sobrepersona;
    }

    public void setSobrepersona(String sobrepersona) {
        this.sobrepersona = sobrepersona;
    }

    public String getTitulodepersona() {
        return titulodepersona;
    }

    public void setTitulodepersona(String titulodepersona) {
        this.titulodepersona = titulodepersona;
    }
    
}
