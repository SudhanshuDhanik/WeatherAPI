package net.engineeringdigest.journalApp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
public class Weather {

    private Main main;

    @Getter
    @Setter
    public class Main {

        @JsonProperty("temp")
        private double temp;




    }
}

