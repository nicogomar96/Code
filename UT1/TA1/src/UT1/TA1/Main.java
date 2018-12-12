package UT1.TA1;


/**
 *
 * @author Usuario
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        int a = 5;
        int i = 3;
        a+=++i;
        System.out.println("Ejercicio 2: " + a);
        System.out.println("---------------------------");

        System.out.println("Ejercicio 3: ");
        int b = 3;
        b++;
        System.out.println(b);
        ++b;
        System.out.println(b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println("---------------------------");

        System.out.println("----------PRUEBA ATRIBUTOS----------");
        PruebaAtributos obj1 = new PruebaAtributos();
        obj1.printVariables(4);
    }
    
}
