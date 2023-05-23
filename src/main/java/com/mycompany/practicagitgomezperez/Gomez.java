/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicagitgomezperez;

/**
 *
 * @author David Gómez
 */
public class Gomez {
    public int suma(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }
    
    public int multiplicacion(int numero1, int numero2){
        int resultado = numero1*numero2;
        return resultado;
    }
    
    public void resultadoSuma(int num1, int num2){
        System.out.println(suma(num1, num2));
    }
    
    public void resultadoMultiplicacion(int num1, int num2){
        System.out.println(multiplicacion(num1, num2));
    }
    
    public int operacionCombinadaMultiplica(int num1, int num2, int num3){
        int resultado = suma(num1, num2)-multiplicacion(num2,num3);
        return resultado;
    }
}
