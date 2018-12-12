package UT1.TA1;

/**
 *
 * @author Usuario
 */
public class PruebaAtributos
{
    //int final = 5; 
    int unEntero;
    String unString = "hola mundo";
    char unChar;
    boolean boleano;
    Boolean b1;
    byte unByte = 127;
    short unShort = 32000;
    long unLong;
    float unFloat; 
    
    public void printVariables(int a){
        int l_unEntero;
        l_unEntero = 2;
        
        char l_unChar = ' ';
        boolean l_boleano;
        byte l_unByte = 127;
        short l_unShort = 32000;
        long l_unLong = 900000000;
        float l_unFloat = 88;
        
        System.out.println("entero local: " + l_unEntero);
        
        
        System.out.println("booleano objeto global: " + b1);
        
        System.out.println(unEntero);
        System.out.println(unString);
        System.out.println(unChar);
        System.out.println(boleano);
        System.out.println(unByte);
        System.out.println(unShort);
        System.out.println(unLong);
        System.out.println(unFloat);
        
        System.out.println("El parametro es: " + a);
    }
}
