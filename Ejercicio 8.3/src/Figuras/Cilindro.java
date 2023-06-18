/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras;

public class Cilindro extends FiguraGeometrica {
    private double radio, altura;
    
    Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }
    
    double calcularVolumen(){
        return Math.PI*Math.pow(radio, 2)*altura;
    }
    
    double calcularSuperficie(){
        return (Math.PI*radio*2*altura)+2*(Math.PI*Math.pow(radio, 2));
    }
}
