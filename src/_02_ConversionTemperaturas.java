public  class _02_ConversionTemperaturas {

    public static void main(String[] args) {

        int celsius = 20;
        final float FACTOR_CONVERSION = 1.8f;
        final int AJUSTE = 32;

        int fahrenheit = (int)(celsius * FACTOR_CONVERSION) + AJUSTE;

        System.out.printf("%d°C equivalen a %d°F\n", celsius, fahrenheit);
    }
}
