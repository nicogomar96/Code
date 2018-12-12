/*
 * To change this license header, choose License Headers in Project Properties.
 * 
 */

package TA2;
import java.util.Scanner;

public class Main
{
    public static boolean isPrime(long n)
    {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
            {
                prime = false;
                break;
            }
        }
        if ((n % 2 != 0 && prime & n > 2) || n == 2)
        {
            return true;
        }
        else
            {
            return false;
            }
    }
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int num = entrada.nextInt();

        boolean esPrimo = TA2.Main.isPrime(num);
        
        int cont = 0;
        int suma = 0;
        if (esPrimo) {
            //suma de los numeros pares desde 0 hasta el numero
            System.out.println("El numero ingresado es primo.");
            while (cont <= num) {
                if (cont%2 == 0)
                {
                    suma += cont;
                }
                cont++;
            }
        }
        else
            {
            //suma de los impares desde el cero hasta el numero
            System.out.println("El numero ingresado no es primo.");
            while(cont <= num)
            {
                if (cont%2 != 0)
                {
                    suma += cont;
                }
                cont++;
            }
            }
        System.out.println("suma total: " + suma);
    }
}
