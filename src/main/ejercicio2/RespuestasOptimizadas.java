package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n)"; // Ej: "O(n)"
    public static boolean tieneDuplicadosOpt(int[] arr) {
        // TODO: implementar versión eficiente

        HashSet<Integer> vistos = new HashSet<>();
        for (int n : arr) {
            if (vistos.contains(n))
                return true;
            vistos.add(n);
        }
        return false;

    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = "O(n)"; // Ej: "O(n)"
    
    public static int contarMayoresOpt(int[] arr, int x) {
        // TODO: implementar versión eficiente

        int count = 0;
        for (int n : arr) {
            if (n > x)
                count++;
        }
        return count;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = "O(n)"; // Ej: "O(n)"
    public static int encontrarMaximoOpt(int[] arr) {
        // TODO: implementar versión eficiente

        int max = arr[0];
        for (int n : arr) {
            if (n > max)
                max = n;
        }
        return max;
    }
}

//Comandos a ejecutar en el terminal:  ejercicio2 usando el SO Windonws

// javac -d out src/main/ejercicio2/AlgoritmosInoptimos.java src/main/ejercicio2/RespuestasOptimizadas.java
// javac -d out -cp "out;lib/*" src/test/TestOptimizacion.java
// java -jar lib/junit-platform-console-standalone-1.7.0.jar -cp out --scan-class-path




