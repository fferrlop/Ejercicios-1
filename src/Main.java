import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    System.out.println("Ejercicio 1");

        //Escribir primero el nombre de la clase. int requerida
        int segundosEnAño = Tiempo.calcular_segundos_en_año(1);
        System.out.println("Segundos en un Año = " + segundosEnAño);


    System.out.println("----------------------------------------------------------------");
    System.out.println("Ejercicio 2");

        // Char ---> Se escribe con (int) antes para poder representarlo de manera numérica
        System.out.println("El mayor número entero representable con un char es: " + (int) Character.MAX_VALUE);

        //Short
        System.out.println("El mayor número entero representable con un short es: " + Short.MAX_VALUE);

        // int
        System.out.println("El mayor número entero representable con un int es: " + Integer.MAX_VALUE);

    System.out.println("----------------------------------------------------------------");
    System.out.println("Ejercicio 3");

           //Escribir primero el nombre de la clase. int requerida
        int[] multiplos = Multiplos.obtenerMultiplosDe5(1, 100);

        // Visualizar los múltiplos de 5
        System.out.println("Múltiplos de 5 comprendidos entre 1 y 100:");
        System.out.println(Arrays.toString(multiplos));

        // Calcular la suma de los múltiplos de 5.
        int suma = Multiplos.calcularSuma(multiplos);
        System.out.println("La suma de los múltiplos de 5 es: " + suma);
        System.out.println("Cantidad de múltiplos de 5: " + multiplos.length);


    }
}