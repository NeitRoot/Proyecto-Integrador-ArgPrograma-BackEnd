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
public class DtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String yearE;
    
    //Constructor

    public DtoEducacion() {
    }

    public DtoEducacion(String nombreE, String descripcionE, String yearE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.yearE = yearE;
    }
    
    //GettersSetters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getYearE() {
        return yearE;
    }

    public void setYearE(String yearE) {
        this.yearE = yearE;
    }
    
}
