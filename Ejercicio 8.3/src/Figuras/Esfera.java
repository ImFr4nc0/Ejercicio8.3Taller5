/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

public class Esfera extends FiguraGeometrica {
    private double radio;
    
    Esfera(double radio){
        this.radio = radio;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    double calcularVolumen(){
        return 1.333*Math.PI*Math.pow(radio, 3);
    }
    
    double calcularSuperficie(){
        return 4*Math.PI*Math.pow(radio, 2);
    }
}
