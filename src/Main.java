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


    }
}