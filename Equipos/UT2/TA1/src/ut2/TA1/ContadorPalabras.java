/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ut2.TA1;

import java.lang.Character;
/**
 * 
 * @author Grupo 4
 */
public class ContadorPalabras
{
    /**
     * Metodo que permite 
     * @param String frase
     * @return int cantPalabras la cantidad de palabras que contiene la frase
     */
    public int contarPalabras(String frase)
    {
        if(!frase.equals(""))   //Verifica que la linea analizada no es vacia
        {
            int cantPalabras = 0;
            boolean nuevaPalabra = false;

            //si la frase comienza con una letra o bien algun caracter distinto a un separador
            //inicializamos una nueva palabra porque es palabra candidata
            if (Character.isLetter(frase.charAt(0)) || frase.charAt(0) != ' ') {
                nuevaPalabra = true;
            }

            for (int i = 0; i < frase.length(); i++)
            {
                //cuento una nueva palabra siempre y cuando el caracter sea una letra
                // y ademas sea palabra candidata para contar
                if (Character.isLetter(frase.charAt(i)) && nuevaPalabra) {
                    //sumo la plabara
                    cantPalabras++;
                    //y pongo a nueva palabra en false para que no siga contando en el resto de sus letras
                    nuevaPalabra = false;
                } else if (frase.charAt(i) == ' ' && !nuevaPalabra) {
                    //va a haber una nueva palabra siempre y cuando aparezca algun separador ' '
                    //basta con que un separador haya aparecido
                    nuevaPalabra = true;
                }
            }
            return cantPalabras;
        }
        else
        {
            return 0;
        }
    }
    
    
    /**
      * El método recibe un array de Strings devolviendo la cantidad de palabras que contiene todo el array
      * @param lineasArchivo array de String
      * @return int contador
      */
    public int cantPalabras(String[] lineasArchivo)
    {
        int contador = 0;
        for (int x=0; x<lineasArchivo.length;x++)
        {
            contador += this.contarPalabras(lineasArchivo[x]);
        }
        return contador;
    }
}
