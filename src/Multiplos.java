public class Multiplos {
    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int size = (end - begin) / 5 + 1;
        int[] multiplos = new int[size];
        int indice = 0;

        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplos[indice] = i;
                indice++;
            }
        }

        return multiplos;
    }
    public static int calcularSuma(int[] array) {
        int suma = 0;

        for (int valor : array) {
            suma += valor;
        }

        return suma;
    }

}