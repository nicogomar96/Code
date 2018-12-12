/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TA2;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Marcapasos {
    short pSanguinea;
    short fCardiaca;
    short nAzucar;
    static int mFuerza;
    float minTLatidos;
    double bRestante;
    String codFab;
    
    public static void main(String[] args) {
        Marcapasos.mFuerza = 0;
        
        int a = 0;
        while(a<3000000000L){
            System.out.println(a);
            a += 10000;
        }
        
        System.out.println(a);
    }
        
}
