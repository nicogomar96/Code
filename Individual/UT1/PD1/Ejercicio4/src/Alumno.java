public class Alumno
{
    private String nombre;

    public Alumno()
    {
        nombre = "";
    }

    public String getNombreAdmiracion() {
        return nombre.concat("!");
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        System.out.println(alumno.getNombreAdmiracion());
        System.out.println("Recorrido: " + Alumno.recorrer("hola"));
        System.out.println("");
        System.out.println("Obtener valor: " + Alumno.getValor());
        System.out.println("");
        System.out.println("Obtener primer Chr: " + Alumno.getPrimerCaracter("Hola"));
        System.out.println("");
        System.out.println("ParaAString: " + Alumno.paraAString(5));
    }

    public static int recorrer(String cadena)
    {
        int res = 0;
        for (int i = 0; i < cadena.length(); i++)
        {
            if (cadena.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }

    public static int getValor()
    {
        int vector[] = {6, 16, 26, 36, 46, 56, 66, 76};
        int idx = 3;
        return vector[idx];
    }

    public static char getPrimerCaracter(String palabra)
    {
        return palabra.charAt(0);
    }

    public static String paraAString(int a)
    {
        Object x1 = new Integer(a);
        return x1.toString();
    }
}