/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UT01.TA3;

/**
 * 
 * @author Renzo Parente
 */
public class Main {
    public static void main(String[] args)
    {
        ContadorPalabras cp = new ContadorPalabras();
        int palabras = cp.contarPalabras("la   .  mundo  ....grupo  4  .."); 
        
        System.out.println("cantidad de palabras: " + palabras);
    }
}
