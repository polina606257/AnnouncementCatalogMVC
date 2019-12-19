package serializator;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import domain.Ad;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class AdSerializator extends StdSerializer<Ad> {
    public AdSerializator(Class<Ad> t) {
        super(t);
    }

    public AdSerializator() {
        this(null);
    }

    @Override
    public void serialize(Ad ad, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {
        gen.writeStartObject();//{
            gen.writeObjectField("id", ad.getId());
            gen.writeStringField("name", ad.getName());
            gen.writeStringField("text", ad.getText());
            gen.writeObjectField("price", ad.getPrice());

            gen.writeObjectFieldStart("date");
                gen.writeObjectField("date", DateTimeFormatter.ofPattern("MM/dd/yyyy").
                        format(ad.getDate()));
//        gen.writeObjectField("date", DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).
//                format(ad.getDate()));
//        gen.writeObjectField("date", DateTimeFormatter.ISO_OFFSET_DATE.format(LocalDate.of(ad.getDate().getYear(),
//                ad.getDate().getMonth(), ad.getDate().getDayOfMonth()).atStartOfDay(ZoneId.of("UTC-5"))));
            gen.writeEndObject();//}

            gen.writeObjectFieldStart("category");//{
                gen.writeObjectField("id", ad.getCategory().getId());
                gen.writeStringField("name", ad.getCategory().getName());
            gen.writeEndObject();//}

            gen.writeObjectFieldStart("author");
                gen.writeObjectField("id", ad.getAuthor().getId());
                gen.writeStringField("name", ad.getAuthor().getName());
            gen.writeEndObject();

        gen.writeEndObject();//}
    }
}

/*
* id,
* "name",
* "price",
* "category" : {id, name},
* "author" : {id, name},
* "date",
* "text"
* */
