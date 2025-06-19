public class _02_AproboCurso {
    public static void main(String[] args) {
        double promedio = 8.2; // Cambia este valor para probar diferentes resultados

        if (promedio >= 7.0) {
            System.out.printf(">> El estudiante ha aprobado el curso con un promedio de %.2f\n", promedio);
        } else if ( promedio >= 5.0) {
            System.out.printf(">> El estudiante ha tenido un promedio bajo de %.2f, esta en recuperacion\n", promedio);

        } else {
            System.out.printf(">> El estudiante no ha aprobado el curso, su promedio es %.2f\n", promedio);
        }
    }
}
