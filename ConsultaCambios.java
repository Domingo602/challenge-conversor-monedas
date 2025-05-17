import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambios {

    public void buscaCambios(Cambio cambio, Integer opcionInt) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6" +
                "/4782a7fccc97a6cf6cc85b68/pair"+
                "/"+cambio.getBaseCode()+
                "/"+cambio.getTargetCode()+
                "/"+cambio.getAmount());

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());

            ExchangeRate exchange = new Gson().fromJson(response.body(),ExchangeRate.class);
            cambio.setConversionRate(exchange.conversion_rate());
            cambio.setConversionResult(exchange.conversion_result());

        } catch (Exception e) {
            throw new RuntimeException("No encontré el Cambio.");
        }
    }
}
