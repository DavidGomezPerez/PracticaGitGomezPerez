/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicagitgomezperez;

/**
 *
 * @author David Gómez
 */
public class Perez {
    
    public int resta(int numero1, int numero2){
        int resultado = numero1 - numero2;
        return resultado;
    }
    
    public int dividir(int numero1, int numero2){
        int resultado = numero1 / numero2;
        return resultado;
    }
    
    public void resultadoResta(int num1, int num2){
        System.out.println(resta(num1, num2));
    }
    
    public void resultadoDividir(int num1, int num2){
        System.out.println(dividir(num1, num2));
    }
    
    public int operacionCombinadaDivide(int num1, int num2, int num3){
        int resultado = resta(num1, num2)-dividir(num2,num3);
        return resultado;
    }
}
