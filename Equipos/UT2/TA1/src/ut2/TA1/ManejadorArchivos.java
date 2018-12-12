/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ut2.TA1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Grupo 4
 */
public class ManejadorArchivos {
    
    /**
     * 
     * @param nombreCompletoArchivo
     * @return 
     */
    public static String[] leerArchivo(String nombreCompletoArchivo){
            FileReader fr;
            
            Scanner sc = new Scanner(System.in);
            //Al utilizar una estructura como Array de String no obliga a dimencionarla de antemano
            // o sea que tenemos que saber la cantidad de lineas que se debena almacenar. 
            //String[] lineasVector = new String[3];
            
            //Vamos a utilizar entonces una lista de Strings de Java de la clase ArrayList
            ArrayList<String> lineasArchivo = new ArrayList<String>();
            int contador = 0;
        try {
            fr = new FileReader(nombreCompletoArchivo);
               
            BufferedReader br = new BufferedReader(fr);
            String lineaActual = br.readLine();
            while (lineaActual != null){
                lineasArchivo.add(lineaActual);
                lineaActual = br.readLine();
                contador++;
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        } 
        catch (IOException e) {
            System.out.println("Error al leer el archivo " + nombreCompletoArchivo);
            e.printStackTrace();
        }
        
        System.out.println("Archivo leido satisfactoriamente");
        System.out.println("Cantidad de lineas leidas: " + contador);
        
        //Ya no retornamos el vector inicial
        //return lineasVector;
        //retornamos la lista convirtiendola en un vector de Strings.
        return lineasArchivo.toArray (new String [0]);
    }
}
