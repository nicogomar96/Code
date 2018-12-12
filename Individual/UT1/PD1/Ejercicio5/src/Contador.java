/**
 * Clase generadora de un contador
 * @author nicolasgonzalezmartinez
 */
public class Contador
{
    final int max_count = 50;
    int incremento;
    int contador;
    public Contador()
    {
        contador = 1;
        incremento = 1;
    }

    /**
     * Metodo encargado de mostrar Display / Pantalla del contador
     */

    public void mostrarContador1()
    {
        while(contador <= max_count)
        {
            System.out.println(contador);
            contador+=incremento;
        }
    }

    public void mostrarContador2()
    {
        do {
            System.out.println(contador);
            contador += incremento;
        } while(contador <= max_count);
    }

    public void mostrarContador3()
    {
        for (int i = 0; i < max_count ; i++)
        {
            System.out.println(contador);
            contador += incremento;
        }
    }
}
