package deserializator;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

public class LocalDateDeserializator extends StdDeserializer<LocalDate> {
    public LocalDateDeserializator() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(JsonParser p, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

        ObjectCodec codec = p.getCodec();

        JsonNode node = codec.readTree(p);

        String value = node.textValue();

        LocalDate date = null;

        if (Objects.nonNull(value)) {
            date = LocalDate.parse(value);
        }

        return date;
    }
}
