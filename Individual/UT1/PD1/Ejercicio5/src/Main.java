public class Main
{
    public static void main(String[] args)
    {
        Contador cont = new Contador();
        System.out.println("BLOQUE USANDO WHILE:");
        cont.mostrarContador1();
        System.out.println("");
        System.out.println("");
        System.out.println("BLOQUE USANDO DO-WHILE");
        Contador cont2 = new Contador();
        cont2.mostrarContador2();
        System.out.println("");
        System.out.println("");
        System.out.println("BLOQUE USANDO FOR");
        Contador cont3 = new Contador();
        cont3.mostrarContador3();
    }
}
