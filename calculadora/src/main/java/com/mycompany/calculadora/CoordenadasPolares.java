/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author user
 */
public class CoordenadasPolares {
    private double angulo;
    private double r;
    
    public CoordenadasPolares(double r, double angulo){
        this.angulo = angulo;
        this.r = r;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }     
    
    public String toString(){
        String cadena = "[" + r + ", " + angulo +"])";
        return cadena;
    }
}

