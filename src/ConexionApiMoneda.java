import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;

public class ConexionApiMoneda {

    public Moneda buscarMoneda(String MonedaOpcion, double CantidadMoneda) {

//        String apikey = "d32cef4987e4ec71e183744a";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d32cef4987e4ec71e183744a/pair/" + MonedaOpcion + CantidadMoneda);


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();


        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException |InterruptedException | InputMismatchException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Moneda.class);
     }

}






