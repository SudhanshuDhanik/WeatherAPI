package net.engineeringdigest.journalApp.Service;

import net.engineeringdigest.journalApp.api.response.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherService {
    @Autowired
    private RestTemplate restTemplate;

    private static final String api_key = "fd8f89ca864a1d6bb817ec99cf5faae2";

    private static final String API = "https://api.openweathermap.org/data/2.5/weather?q=CITY&appid=API_KEY&units=metric";

    public Weather getWeather(String city){
        String finalApi = API.replace("CITY" , city).replace("API_KEY" , api_key);
        ResponseEntity<Weather> response = restTemplate.exchange(finalApi, HttpMethod.GET, null, Weather.class);
        Weather body = response.getBody();
        return body;
    }


}
