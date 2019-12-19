package dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import deserializator.LocalDateDeserializator;

import java.time.LocalDate;

/**
 * Created by polin on 10/10/2019.
 */
public class LocalDateDTO {

    @JsonDeserialize(using = LocalDateDeserializator.class)
    private LocalDate date;

    public LocalDateDTO() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
