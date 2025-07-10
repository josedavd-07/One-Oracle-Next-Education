import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public  void guardarJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writerText = new FileWriter(pelicula.title()+".json");
        writerText.write(gson.toJson(pelicula));
        writerText.close();

    }
}
