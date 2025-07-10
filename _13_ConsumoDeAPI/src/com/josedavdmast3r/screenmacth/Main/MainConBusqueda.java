package com.josedavdmast3r.screenmacth.Main;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.josedavdmast3r.screenmacth.exceptions.ErrorConversionDuracionException;
import com.josedavdmast3r.screenmacth.modelos.Titulo;
import com.josedavdmast3r.screenmacth.modelos.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner inputUser = new Scanner(System.in);
        //PROGRAMAR PARA IMPLEMETACIONES CON LIST
        List<Titulo> titulos = new ArrayList<>();

//      API KEY
        String apiKey = new Scanner(new java.io.File("apikey.txt")).nextLine().trim();

        //Global Gson object variable
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {

            //Entradas del usuario
            System.out.print("Porfavor ingresa el nombre de la pelicula que deseas buscar: ");

            var busqueda = inputUser.nextLine();

            if (busqueda.equalsIgnoreCase("salir")) {
                break; // Salir del bucle si el usuario ingresa "salir"
            }

            //direccion dinamica de la api en la busqueda
            // dirección dinámica de la API en la búsqueda

//        String urlDireccion = "https://www.omdbapi.com/?t=" +
//                busqueda.replace(" ", "+") + "&apikey=cLAVE ACA";

//            Using url encoder NO PROFESIONAL DEJAR LA API KEY
            String urlDireccion = "https://www.omdbapi.com/?t=" +
                    URLEncoder.encode(busqueda, StandardCharsets.UTF_8) + "&apikey=NUMEROAQUÍ";


            //Forma 2
            //String urlDireccion = "https://www.omdbapi.com/?apikey=APIAQUI=" + busqueda;
            try {
                // Llamamos la api por el nodelo cliente servidor
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(urlDireccion))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);


                Titulo.showBanner();

                // Deserializamos el JSON a un objeto de tipo Pelicula
                //System.out.println(miTitulo.toString());
                TituloOmdb miTituloOmbd = gson.fromJson(json, TituloOmdb.class);
                System.out.println(miTituloOmbd);

                //Controlamos las excepciones de la API

                Titulo miTitulo = new Titulo(miTituloOmbd);
                System.out.println("Titulo ya convertido: " + miTitulo);

                // Añadimos el título a la lista
                titulos.add(miTitulo);

                //Escribimos el título en un archivo de texto
//                var writeText = new FileWriter("Peliculas.txt");
//                writeText.write(miTitulo.toString());
//                writeText.close();

            } catch (NumberFormatException e) {
                System.out.print("Ocurrio un error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URI, verifique la URL: " + e.getMessage());
            } catch (ErrorConversionDuracionException e) {
                System.out.println(e.getMessage());
            }

        }
        Titulo.showBanner();
        System.out.println("Lista de títulos obtenidos: " + titulos);
        FileWriter writeText = new FileWriter("Peliculas.json");
        // Convertimos la lista de títulos a JSON
        writeText.write(gson.toJson(titulos));
        writeText.close();//Cerramos el archivo
        System.out.println("Finalizo la ejecución del programa");

    }
}
