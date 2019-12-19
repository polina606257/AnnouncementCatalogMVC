package serializator;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import domain.Ad;
import domain.Author;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class AuthorSerializator extends StdSerializer<Author> {
    public AuthorSerializator(Class<Author> t) {
        super(t);
    }

    public AuthorSerializator() {
        this(null);
    }

    @Override
    public void serialize(Author author, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {
        gen.writeStartObject();//{
        gen.writeObjectField("id", author.getId());
        gen.writeStringField("name", author.getName());

        gen.writeObjectFieldStart("phone");
        gen.writeStringField("number", author.getPhone().getNumber());
        gen.writeEndObject();

        gen.writeObjectFieldStart("author_email");
        gen.writeObjectField("email", author.getEmail().getEmail());
        gen.writeEndObject();

        gen.writeObjectFieldStart("author_address");
        gen.writeObjectField("address", author.getAddress().getCountry() + " " +
                author.getAddress().getCity());
        gen.writeEndObject();

        gen.writeObjectFieldStart("author_ads");
        gen.writeObjectField("ads", author.getAds());
        gen.writeEndObject();

        gen.writeEndObject();
    }
}
