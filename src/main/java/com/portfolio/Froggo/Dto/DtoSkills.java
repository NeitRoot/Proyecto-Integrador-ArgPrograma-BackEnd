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
public class DtoSkills {
    @NotBlank
    private String habilidad;
    @NotBlank
    private int valor;
    private String img;
    
    
    //Constructor

    public DtoSkills() {
    }

    public DtoSkills(String habilidad, int valor, String img) {
        this.habilidad = habilidad;
        this.valor = valor;
        this.img = img;
    }
    
    //GettersSetters

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
