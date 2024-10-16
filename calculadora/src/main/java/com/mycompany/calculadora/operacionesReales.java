/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class operacionesReales {
    private double suma;
    private double resta;
    private double multiplicacion;
    private double division; 
    private double exponencial;
    private double raiz;
    private double n1;
    private double n2;
    
    public operacionesReales(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresar el primer numero ");
        n1 = scan.nextDouble();
        System.out.println("ingresar el segundo numero");
        n2 = scan.nextDouble();
        sumas();
        restar();
        multiplicar();
        dividir();
        exponenciales();
        raices();
    }
    

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(double multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public double getExponencial() {
        return exponencial;
    }

    public void setExponencial(double exponencial) {
        this.exponencial = exponencial;
    }

    public double getRaiz() {
        return raiz;
    }

    public void setRaiz(double raiz) {
        this.raiz = raiz;
    }
    
    public void sumas(){
        suma=n1+n2;
    }
    public void multiplicar(){
        multiplicacion= n1*n2;
    }
    public void restar(){
        resta= n1-n2;
    }
    public void dividir(){
        division= n1/n2;
    }
    public void exponenciales(){
        exponencial= Math.pow(n1, n2);
    }
    public void raices(){
        raiz=Math.sqrt(n1);
    }
    @Override
    public String toString() {
        
        String retorno = "LA DIVISON es:   " + this.division + "LA POTENCIA es:    " + this.exponencial + "LA MULTIPLICACION es:   " + this.multiplicacion + "LA RAIZ es:" + this.raiz + "LA RESTA es:   " + this.resta+ "LA SUMA es:   " + this.suma;

        return retorno;
    }
}
