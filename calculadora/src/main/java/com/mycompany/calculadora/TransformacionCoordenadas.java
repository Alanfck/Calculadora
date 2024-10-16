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
public class TransformacionCoordenadas {
    public static CoordenadasRectangulares convertirPolares_a_Rectangulares(CoordenadasPolares polar) {
        CoordenadasRectangulares rectangular;
        double x, y;      
        x = polar.getR() * Math.cos(polar.getAngulo());
        y = polar.getR() * Math.sin(polar.getAngulo());                
        rectangular = new CoordenadasRectangulares(x, y);               
        return rectangular;

        //return new CoordenadasRectangulares(polar.getR() * Math.cos(polar.getAngulo()), polar.getR() * Math.sin(polar.getAngulo()));
    }

    public static CoordenadasPolares convertirRectangulares_a_Polares(CoordenadasRectangulares rectangular) {
        CoordenadasPolares polar;
        double r, angulo = 0;

        r = Math.sqrt(Math.pow(rectangular.getX(), 2) + Math.pow(rectangular.getY(), 2));
        
        if (rectangular.getX() > 0 && rectangular.getY() >= 0) {
            angulo = Math.atan(rectangular.getY() / rectangular.getX());
        } else if (rectangular.getX() == 0 && rectangular.getY() > 0) {
            angulo = Math.PI / 2;
        } else if (rectangular.getX() < 0) {
            angulo = Math.atan(rectangular.getY() / rectangular.getX()) + Math.PI;
        } else if (rectangular.getX() == 0 && rectangular.getY() < 0) {
            angulo = Math.PI * 3 / 2;
        } else if (rectangular.getX() > 0 && rectangular.getY() < 0) {
            angulo = Math.atan(rectangular.getY() / rectangular.getX()) + 2 * Math.PI;
        }

        polar = new CoordenadasPolares(r, angulo);
        return polar;
    }
}

