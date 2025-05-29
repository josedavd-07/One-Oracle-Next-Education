public  class _02_ConversionTemperaturas {

    public static void main(String[] args) {
        //Conversion de  de grados Celsius a Fahrenheit

        int temperaturaCelsius = 20;
        final float COEFICIENTE_DE_CONVERSION = 1.8f; //Constante
        final int CONSTANTE_DE_AJUSTE_DESPLAZAMIENTO = 32;


        int  temperaturaConvertidaFahrenheit = (int) (temperaturaCelsius * COEFICIENTE_DE_CONVERSION)
                + CONSTANTE_DE_AJUSTE_DESPLAZAMIENTO;

        System.out.printf("%d° grados celsius quivalen a %d° grados farenheit\n",temperaturaCelsius,
                temperaturaConvertidaFahrenheit)
        ;
    }
}


//Para ser llamada en main a si en forma de objeto de clase para ello esta clase no debe contener main
//
//ConversionTemperaturas Conversion = new ConversionTemperaturas();
//int value =  Conversion.temperaturaConvertidaFahrenheit;
//
//        System.out.printf("%d° grados celsius quivalen a %d° grados farenheit\n",
//                          Conversion.temperaturaCelsius, value); // impresión formato
//        System.out.println(Conversion.temperaturaCelsius +"° grados celsius equivalen a "+ value
//        +"° grados farenheit\n"); // impresión valor


