/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ut2.TA1;
/**
 * 
 * @author Grupo 4
 */
public class Main
{
    public static void main(String[] args)
    {
        ManejadorArchivos ma = new ManejadorArchivos();
        String [] arregloFrases = ma.leerArchivo("src/ut2/TA1/prueba.txt");
        ContadorPalabras cp = new ContadorPalabras();
        int totalPalabras = cp.cantPalabras(arregloFrases);
        System.out.println("La cantidad de palabras del archivo es: " + totalPalabras);
    }
    
}
