/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

public class Piramide extends FiguraGeometrica {
    private double base, altura, apotema;
    
    Piramide(double base, double altura, double apotema){
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    double calcularVolumen(){
        return (Math.pow(base, 2)*altura)/3;
    }
    
    double calcularSuperficie(){
        return (Math.pow(base, 2))+(2*base*apotema);
    }
}
