//Interface que identifica o endpoint da API que será
// Consumida pelo Retrofit
package com.example.projectcurrencyconverterapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ExchangeRateService {
    /**
     * Método para obter taxas de câmbio recentes
     */

    @GET("/v6/{apikey}/latest/{baseCurrency}")
    Call<ExchangeRatesResponse> getExchangeRates(
            //Substitui {apiKey} na URL com valor fornecido
            @Path("apiKey") String apiKey,
            // Substitui {baseCurrency} na URL com valor fornecido
            @Path("baseCurrency") String baseCurrency
    );
}
