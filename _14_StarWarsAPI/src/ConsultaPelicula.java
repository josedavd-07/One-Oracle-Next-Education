import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    public Pelicula buscarpelicula(int numeroDePelicula){

        URI direccionApi = URI.create("https://swapi.dev/api/films/"+numeroDePelicula);

        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //Crear el request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccionApi)
                .build();

        // CREAR EL RESPONSE DE LA LLAMADA A LA API
        //Using multicatch

        try {
            HttpResponse<String> responseJson = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new  Gson().fromJson(responseJson.body(), Pelicula.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre esa pelicula");
        }
    }
}

